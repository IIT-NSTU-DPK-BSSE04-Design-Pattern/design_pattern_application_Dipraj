package design_pattern_application_Dipraj.comdelta.vehicle;



public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        VehicleAssemblyLine assemblyLine = new VehicleAssemblyLine(carFactory);
        assemblyLine.assembleVehicle();  // Assembling Car

        assemblyLine = new VehicleAssemblyLine(truckFactory);
        assemblyLine.assembleVehicle();  // Assembling Truck

        assemblyLine = new VehicleAssemblyLine(motorcycleFactory);
        assemblyLine.assembleVehicle();  // Assembling Motorcycle
    }
}

