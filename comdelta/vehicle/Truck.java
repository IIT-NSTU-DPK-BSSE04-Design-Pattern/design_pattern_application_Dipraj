package design_pattern_application_Dipraj.comdelta.vehicle;



public class Truck extends Vehicle {
    public Truck() {
        this.body = new TruckBody();
        this.wheels = new TruckWheels();
        this.engine = new TruckEngine();
    }

    @Override
    public void assembleVehicle() {
        System.out.println("Assembling truck...");
    }
}
