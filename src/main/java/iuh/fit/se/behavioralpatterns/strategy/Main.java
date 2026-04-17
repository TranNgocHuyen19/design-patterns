package iuh.fit.se.behavioralpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("airplane");
        VehicleSupervisor sv = new VehicleSupervisor(new InitialBehaviour());
        sv.displayDetail(v);
        sv.setVehicleBehaviour(new FlyBehaviour());
        sv.displayDetail(v);
    }
}
