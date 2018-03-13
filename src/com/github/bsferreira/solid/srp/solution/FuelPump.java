package com.github.bsferreira.solid.srp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class FuelPump {

    public void reFuel(final Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}