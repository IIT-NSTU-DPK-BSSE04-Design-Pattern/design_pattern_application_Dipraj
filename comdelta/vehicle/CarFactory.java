package design_pattern_application_Dipraj.comdelta.vehicle;



public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

