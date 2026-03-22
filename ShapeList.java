import java.util.ArrayList;

// this class stores all our shapes in a list
public class ShapeList {

    // ArrayList is like a box that can hold many shapes
    private ArrayList<Shape> listOfShapes;

    // constructor creates an empty list
    public ShapeList() {
        listOfShapes = new ArrayList<>();
    }

    // adds a shape to the list
    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    // returns how many shapes are in the list
    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    // returns a shape at a given position
    // checks first that the position exists
    public Shape getShape(int pos) {
        if (pos < 0 || pos >= listOfShapes.size()) {
            System.out.println("Error: no shape at position " + pos);
            return null;
        }
        return listOfShapes.get(pos);
    }

    // removes and returns a shape at a given position
    public Shape removeShape(int pos) {
        if (pos < 0 || pos >= listOfShapes.size()) {
            System.out.println("Error: no shape at position " + pos);
            return null;
        }
        return listOfShapes.remove(pos);
    }

    // returns the area of a shape at a given position
    public double area(int pos) {
        Shape s = getShape(pos);
        if (s == null) return 0;
        return s.getArea();
    }

    // returns the perimeter of a shape at a given position
    public double perimeter(int pos) {
        Shape s = getShape(pos);
        if (s == null) return 0;
        return s.getPerimeter();
    }

    // moves all shapes in the list
    public void translateShapes(int dx, int dy) {
        for (Shape s : listOfShapes) {
            s.translate(dx, dy);
        }
    }

    // scales all shapes in the list
    public void scale(int factor, boolean sign) {
        for (Shape s : listOfShapes) {
            s.scale(factor, sign);
        }
    }

    // returns information about all shapes
    public String display() {
        String result = "";
        for (int i = 0; i < listOfShapes.size(); i++) {
            result = result + "Shape " + i + ": "
                    + listOfShapes.get(i).display() + "\n";
        }
        return result;
    }
}