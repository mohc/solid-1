package uk.co.mohc.solid.ocp.violation;


public enum DrivingMode {

    SPORT(10, 15),
    COMFORT(20, 25),
    ECONOMY(5, 5);
    private int power;
    private int suspensionHeight;

    DrivingMode(int power, int suspensionHeight) {
        this.power = power;
        this.suspensionHeight = suspensionHeight;
    }

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }
}
