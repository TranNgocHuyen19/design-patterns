package iuh.fit.se.behavioralpatterns.strategy;

public class FlyBehaviour implements VehicleBehaviour {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println(vehicle.getVehicleType() + "can fly in the sky");
    }
}
