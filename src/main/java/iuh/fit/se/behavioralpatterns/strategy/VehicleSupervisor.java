package iuh.fit.se.behavioralpatterns.strategy;

public class VehicleSupervisor {
    private VehicleBehaviour vehicleBehaviour;

    public VehicleSupervisor(VehicleBehaviour vehicleBehaviour) {
        this.vehicleBehaviour = vehicleBehaviour;
    }

    public void setVehicleBehaviour(VehicleBehaviour vehicleBehaviour) {
        this.vehicleBehaviour = vehicleBehaviour;
    }

    public void displayDetail(Vehicle vehicle) {
        vehicleBehaviour.showDetail(vehicle);
    }
}
