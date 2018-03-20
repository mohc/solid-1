package uk.co.mohc.solid.ocp.violation;

public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setDrivingMode(drivingMode);
    }
}
