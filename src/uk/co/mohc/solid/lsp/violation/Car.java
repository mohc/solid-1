package uk.co.mohc.solid.lsp.violation;

public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        boolean currentGearIsDrive = getGear().equals(Gear.DRIVE);

        if(Gear.REVERSE.equals(gear) && currentGearIsDrive){
            changeGear(Gear.NEUTRAL);
        }
        changeGear(gear);
    }
}
