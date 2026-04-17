package iuh.fit.se.structuralpatterns.decorator.home;

public abstract class Home {
    protected double basePrice;

    public Home(double basePrice) {
        this.basePrice = basePrice;
    }
    public abstract double getPrice();
}
