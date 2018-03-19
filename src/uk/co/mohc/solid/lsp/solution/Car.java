package uk.co.mohc.solid.lsp.solution;

public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if (isMovingForwards() && gear.equals(Gear.R)
             || isMovingBackwards() && gear.equals(Gear.D)) {
            stop();
        }
        super.changeGear(gear);
    }

    private boolean isMovingBackwards() {
        return isMoving() && getGear().equals(Gear.R);
    }

    private boolean isMovingForwards() {
        return isMoving() && getGear().equals(Gear.D);
    }
}
