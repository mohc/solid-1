package uk.co.mohc.solid.dip.solution;

public class Driver {

    private Car vehicle;

    public Driver(Car car){
        this.vehicle = car;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}