package uk.co.mohc.solid.dip.solution;

public class Main {
    public static void main(String[] args) {
        Car car = new RacingCar(100);
        ((RacingCar)car).printStatus();
        Driver driver = new Driver(car);
        driver.increaseSpeed();
        ((RacingCar)car).printStatus();

    }

}
