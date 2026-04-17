package iuh.fit.se.structuralpatterns.decorator.home;

public abstract class LuxuryDecorator extends Home {
    protected Home home;

    public LuxuryDecorator(Home home) {
        super(0);
        this.home = home;
    }

    @Override
    public double getPrice() {
        return this.home.getPrice();
    }
}
