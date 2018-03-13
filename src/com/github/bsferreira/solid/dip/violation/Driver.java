package com.github.bsferreira.solid.dip.violation;

/**
 * Created by bsferreira on 17-04-2016.
 */
public class Driver {

    private RacingCar vehicle;

    public Driver(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}