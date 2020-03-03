package appliancesobjects;

import constants.AllConstants;

import java.util.HashMap;
import java.util.Map;

public class Appliance {

    protected float basePrice;
    protected float weight;
    protected String color;
    protected char energyConsumption;

    public Appliance(){
        this.basePrice = AllConstants.BASE_PRICE;
        this.weight = AllConstants.WEIGHT;
        this.color = AllConstants.COLOR;
        this.energyConsumption = AllConstants.DEFAULT_ENERGY_CONSUMPTION;
    }

    public Appliance(float weigth, float basePrice){
        this.basePrice = basePrice;
        this.weight = weigth;
        this.color = AllConstants.COLOR;
        this.energyConsumption = AllConstants.DEFAULT_ENERGY_CONSUMPTION;
    }

    public Appliance(float weigth, float basePrice, String color, char energyConsumption){
        this.basePrice = basePrice;
        this.weight = weigth;
        this.color = checkColor(color);
        this.energyConsumption = this.checkEnergyConsumption(energyConsumption);
    }

    private char checkEnergyConsumption(char energyConsumption){

        Map<Character, Character> validateConsumption =  new HashMap<>();

        validateConsumption.put('A', 'A');
        validateConsumption.put('B', 'B');
        validateConsumption.put('C', 'C');
        validateConsumption.put('D', 'D');
        validateConsumption.put('E', 'E');

        return validateConsumption.getOrDefault(energyConsumption, AllConstants.DEFAULT_ENERGY_CONSUMPTION);
    }

    private String checkColor(String color){

        color = color.toLowerCase();
        Map<String, String> validateColor =  new HashMap<>();

        validateColor.put("black", "black");
        validateColor.put("red", "red");
        validateColor.put("blue", "blue");
        validateColor.put("gray", "gray");

        return validateColor.getOrDefault(color, AllConstants.COLOR);
    }

    public float finalPrice(){
        return this.getBasePrice() + this.getSumPrices();
    }

    private float getSumPrices(){
        float priceApplianceEnergyConsumption = AllConstants.applianceConsumtionPrice(this.getEnergyConsumption());
        float priceApplianceWeight = AllConstants.applianceWeightPrice(this.getWeight());
        return priceApplianceEnergyConsumption + priceApplianceWeight;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName())
                .concat("\nBase price: ").concat(String.valueOf(this.getBasePrice()))
                .concat("\nWeight: ").concat(String.valueOf(this.getWeight()))
                .concat("\nEnergy consumption: ").concat(Character.toString(this.getEnergyConsumption()))
                .concat("\nColor: ").concat(this.getColor());
    }
}