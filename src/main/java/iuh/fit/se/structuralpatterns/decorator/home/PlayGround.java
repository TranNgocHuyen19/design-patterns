package iuh.fit.se.structuralpatterns.decorator.home;

public class PlayGround extends LuxuryDecorator{
    public PlayGround(Home home) {
        super(home);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}
