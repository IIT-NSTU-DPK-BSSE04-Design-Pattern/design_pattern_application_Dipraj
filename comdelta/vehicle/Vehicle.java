package design_pattern_application_Dipraj.comdelta.vehicle;



public abstract class Vehicle {
    protected Body body;
    protected Wheels wheels;
    protected Engine engine;

    public abstract void assembleVehicle();

    public void showVehicleDetails() {
        System.out.println("Vehicle Details:");
        body.createBody();
        wheels.createWheels();
        engine.createEngine();
    }
}
