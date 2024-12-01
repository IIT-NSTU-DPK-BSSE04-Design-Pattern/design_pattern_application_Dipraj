package design_pattern_application_Dipraj.comdelta.vehicle;



public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

