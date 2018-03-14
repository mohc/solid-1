package uk.co.mohc.solid.srp.solution;


public class PetrolPump {

    public void reFuel(final Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}