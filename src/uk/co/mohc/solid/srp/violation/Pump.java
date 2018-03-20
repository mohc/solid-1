package uk.co.mohc.solid.srp.violation;

public class Pump {



    public void refuelVehicle(Vehicle vehicle) {
        // calculate how much fuel we want to put in the car
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }


}
