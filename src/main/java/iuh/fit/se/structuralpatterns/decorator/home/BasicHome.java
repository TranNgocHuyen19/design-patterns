package iuh.fit.se.structuralpatterns.decorator.home;

public class BasicHome extends Home {
    public BasicHome(double basePrice) {
        super(100);
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
