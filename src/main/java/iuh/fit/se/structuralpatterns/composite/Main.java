package iuh.fit.se.structuralpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape triangle1 = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(circle1);
        drawing.add(triangle1);

        Drawing subDrawing = new Drawing();
        subDrawing.add(new Circle());

        drawing.add(subDrawing);

        drawing.draw("Red");
    }
}
