package appliancesobjects;

public class Television extends Appliance {

    private static final boolean DEFAULT_TDT_TUNER = false;
    private static final int DEFAULT_RESOLUTION = 20;
    private boolean tdtTuner;
    private int resolution;

    public Television(){
        super();
        this.tdtTuner = DEFAULT_TDT_TUNER;
        this.resolution = DEFAULT_RESOLUTION;
    }

    public Television(float weight, float basePrice){
        super(weight, basePrice);
        this.tdtTuner = DEFAULT_TDT_TUNER;
        this.resolution = DEFAULT_RESOLUTION;
    }

    public Television(int resolution, boolean tdtTuner, float weight, float basePrice, String color, char energyConsumption){
        super(weight, basePrice, color, energyConsumption);
        this.tdtTuner = tdtTuner;
        this.resolution = resolution;
    }

    @Override
    public float finalPrice(){
        float subtotal = super.finalPrice();
        subtotal += this.getPricePerResolution(subtotal) + this.getPriceTuner();
        return subtotal;
    }

    private float getPricePerResolution(float subtotal){
        return (this.getResolution() > 40) ? subtotal * 0.30f : 0;
    }

    private float getPriceTuner(){
        return (this.isTdtTuner()) ? 50 : 0;
    }

    public boolean isTdtTuner() {
        return tdtTuner;
    }

    public int getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return super.toString()
                .concat("\nResolution: ").concat(String.valueOf(this.getResolution()))
                .concat("\nTDT Tuner: ").concat(this.messageByTuner());
    }

    private String messageByTuner(){
        return (this.isTdtTuner()) ? "YES" : "NO";
    }


}
