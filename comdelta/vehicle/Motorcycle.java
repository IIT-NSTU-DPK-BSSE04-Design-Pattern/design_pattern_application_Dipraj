package design_pattern_application_Dipraj.comdelta.vehicle;


public class Motorcycle extends Vehicle {
    public Motorcycle() {
        this.body = new MotorcycleBody();
        this.wheels = new MotorcycleWheels();
        this.engine = new MotorcycleEngine();
    }

    @Override
    public void assembleVehicle() {
        System.out.println("Assembling motorcycle...");
    }
}
