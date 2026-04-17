package iuh.fit.se.behavioralpatterns.strategy;

public class FloatBehaviour implements VehicleBehaviour {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println(vehicle.getVehicleType() + " can float on water");
    }
}
