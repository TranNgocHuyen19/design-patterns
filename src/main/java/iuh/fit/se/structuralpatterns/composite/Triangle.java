package iuh.fit.se.structuralpatterns.composite;

public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Triangle.draw " + color);
    }
}
