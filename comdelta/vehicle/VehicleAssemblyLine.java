package design_pattern_application_Dipraj.comdelta.vehicle;



public class VehicleAssemblyLine {
    private VehicleFactory vehicleFactory;

    public VehicleAssemblyLine(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void assembleVehicle() {
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.assembleVehicle();
        vehicle.showVehicleDetails();
    }
}
