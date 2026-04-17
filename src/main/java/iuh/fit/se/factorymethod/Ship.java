package iuh.fit.se.factorymethod;

//Concrete Product
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivered");
    }
}
