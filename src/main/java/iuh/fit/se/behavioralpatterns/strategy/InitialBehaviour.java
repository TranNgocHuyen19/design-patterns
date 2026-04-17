package iuh.fit.se.behavioralpatterns.strategy;

public class InitialBehaviour implements VehicleBehaviour {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("Vehicle type: " + vehicle.getVehicleType());
    }
}
