package uk.co.mohc.solid.dip.solution;

public class RacingCar implements Car {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate(){
        power++;
        remainingFuel--;
    }

    public void printStatus() {
        System.out.println("Power: "+this.power+", Fuel: "+this.remainingFuel);
    }
}