package design_pattern_application_Dipraj.comdelta.vehicle;



public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
