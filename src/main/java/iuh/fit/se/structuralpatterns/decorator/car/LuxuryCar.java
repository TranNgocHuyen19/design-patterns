package iuh.fit.se.structuralpatterns.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxury features");
    }
}
