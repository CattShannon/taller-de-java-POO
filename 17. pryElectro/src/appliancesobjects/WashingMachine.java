package appliancesobjects;

public class WashingMachine extends Appliance {

    private static final float DEFAULT_LOAD = 5;
    private float load;

    public WashingMachine (){
        super();
        this.load = DEFAULT_LOAD;
    }

    public WashingMachine(float weight, float basePrice){
        super(weight, basePrice);
        this.load = DEFAULT_LOAD;
    }

    public WashingMachine(float weight, float basePrice, float load, char energyConsumption, String color){
        super(weight, basePrice, color, energyConsumption);
        this.load = load;
    }

    @Override
    public float finalPrice(){
        float subtotal = super.finalPrice();
        return (this.isMoreWeightThan30Kg()) ? subtotal + 50 : subtotal;
    }

    private boolean isMoreWeightThan30Kg (){
        return this.getLoad() > 30;
    }

    public float getLoad() {
        return load;
    }

    @Override
    public String toString() {
        return super.toString()
                .concat("\nLoad: ").concat(String.valueOf(this.getLoad()));
    }
}
