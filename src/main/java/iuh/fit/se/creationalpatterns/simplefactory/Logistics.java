package iuh.fit.se.creationalpatterns.simplefactory;

public class Logistics {
    public void planDelivery(String type) {
        if(type.equals("road")) {
            Transport transport = new Truck();
            transport.deliver();
        } else if (type.equals("sea")) {
            Transport transport = new Ship();
            transport.deliver();
        }
    }
}
