package run;

import appliancesobjects.Appliance;
import appliancesobjects.Television;
import appliancesobjects.WashingMachine;

import javax.swing.*;

public class Execute {

    float pricesWashingMachine = 0;
    float pricesTelevision = 0;
    float pricesAppliances = 0;

    public void runProgram() {

        JOptionPane.showMessageDialog(null, "Please wait...", "Processing", JOptionPane.WARNING_MESSAGE);

        calculatePrices();

        JOptionPane.showMessageDialog(null, ("Appliances    Televisions    Washing Machines\n"
                + "   " + this.pricesAppliances + "                " + this.pricesTelevision + "                   "
                + this.pricesWashingMachine), "Showing Prices", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Total: " + (pricesAppliances + pricesTelevision
                + this.pricesWashingMachine) + "$", "Sum Prices", JOptionPane.INFORMATION_MESSAGE);

    }

    private void calculatePrices() {
        Object[] listOfAppliances = createListOfAppliances();

        for (int i = 0; i < listOfAppliances.length; i++) {

            if (isATelevision(listOfAppliances[i])) {

                this.pricesTelevision += getTelevisionFinalPrice(listOfAppliances[i]);

            } else if (isAWashingMachine(listOfAppliances[i])) {

                this.pricesWashingMachine += getWashingMachineFinalPrice(listOfAppliances[i]);

            } else {

                this.pricesAppliances += getApplianceFinalPrice(listOfAppliances[i]);

            }
        }
    }

    private Object[] createListOfAppliances() {
        return new Object[]{
                    new Appliance(),
                    new WashingMachine(14, 250),
                    new Television(36, true, 14, 500, "Red", 'C'),
                    new Appliance(50, 100),
                    new WashingMachine(),
                    new Television(20, 700),
                    new Appliance(90, 160, "White", 'D'),
                    new WashingMachine(29, 300, 18, 'Z', "Red"),
                    new Television(),
                    new Television(50, false, 9, 700, "Purple", 'B')
            };
    }

    private boolean isATelevision(Object objAppliance) {
        return objAppliance instanceof Television;

    }

    private float getTelevisionFinalPrice(Object objAppliance) {
        return castToTelevision(objAppliance).finalPrice();
    }

    private Television castToTelevision(Object objAppliance) {
        return (Television) objAppliance;
    }

    private boolean isAWashingMachine(Object objAppliance) {
        return objAppliance instanceof WashingMachine;
    }

    private float getWashingMachineFinalPrice(Object objAppliance) {
        return castToWashingMachine(objAppliance).finalPrice();
    }

    private WashingMachine castToWashingMachine(Object objAppliance) {
        return (WashingMachine) objAppliance;
    }

    private float getApplianceFinalPrice(Object objAppliance) {
        return castToAppliance(objAppliance).finalPrice();
    }

    private Appliance castToAppliance(Object objAppliance) {
        return (Appliance) objAppliance;
    }

}
