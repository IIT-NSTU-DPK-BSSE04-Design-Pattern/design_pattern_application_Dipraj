package design_pattern_application_Dipraj.comdelta.vehicle;



public class Car extends Vehicle {
    public Car() {
        this.body = new CarBody();
        this.wheels = new CarWheels();
        this.engine = new CarEngine();
    }

    @Override
    public void assembleVehicle() {
        System.out.println("Assembling car...");
    }
}

