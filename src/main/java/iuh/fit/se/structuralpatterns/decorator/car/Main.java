package iuh.fit.se.structuralpatterns.decorator.car;

public class Main {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car = new CarDecorator(new LuxuryCar(new SportsCar(car)));
        car.assemble();
    }
}
