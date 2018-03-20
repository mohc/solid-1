package uk.co.mohc.solid.ocp.violation;

public class Vehicle {

    private int power;
    private int suspensionHeight;

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

    public void setDrivingMode(DrivingMode drivingMode) {
        if(drivingMode == null) {
            drivingMode = DrivingMode.ECONOMY;
        }
        this.power = drivingMode.getPower();
        this.suspensionHeight = drivingMode.getSuspensionHeight();
    }

}