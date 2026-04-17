package iuh.fit.se.structuralpatterns.decorator.home;

public class SwimmingPool extends LuxuryDecorator{
    public SwimmingPool(Home home) {
        super(home);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }
}
