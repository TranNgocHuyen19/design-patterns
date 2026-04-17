package iuh.fit.se.structuralpatterns.decorator.home;

public class Main {
    public static void main(String[] args) {
        Home home = new AdvancedHome();
        home = new SwimmingPool(new PlayGround(home));
        System.out.println(home.getPrice());
    }
}
