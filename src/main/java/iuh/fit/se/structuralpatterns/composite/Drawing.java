package iuh.fit.se.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    List<Shape> shapes;

    public Drawing(){
        shapes = new ArrayList<Shape>();
    }

    @Override
    public void draw(String color) {
        for(Shape s: shapes){
            s.draw(color);
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }
}
