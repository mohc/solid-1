package uk.co.mohc.solid.dip.solution;


public class Driver {

    private Vehicle vehicle;

    public Driver(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
