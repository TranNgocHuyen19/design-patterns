package iuh.fit.se.structuralpatterns.decorator.home;

public class AdvancedHome extends Home{
    public AdvancedHome() {
        super(200);
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
