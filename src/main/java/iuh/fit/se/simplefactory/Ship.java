package iuh.fit.se.simplefactory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivered");
    }
}
