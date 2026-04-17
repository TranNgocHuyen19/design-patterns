package iuh.fit.se.factorymethod;

public class Main {
    public static void main(String[] args) {
        Logistics logistics1 = new RoadLogistics();
        logistics1.planDelivery();

        Logistics logistics2 = new SeaLogistics();
        logistics2.planDelivery();
    }
}
