// Circle is a child of Shape
public class Circle extends Shape {

    // a circle only has a radius
    private double radius;

    // constructor - we pass position and radius
    public Circle(Coordinates coord, double radius) {
        super(0, coord); // circle has no straight sides so we use 0
        this.radius = radius;
    }

    // area = pi times radius squared
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // perimeter = 2 times pi times radius
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // scale changes the radius and position
    @Override
    public void scale(int factor, boolean sign) {
        getCoordinates().scale(factor, sign);
        if (sign == true) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }
    }

    // returns all information about this circle as text
    @Override
    public String display() {
        return "Circle at " + getCoordinates().display()
                + " | Radius: " + radius
                + " | Area: " + getArea()
                + " | Perimeter: " + getPerimeter();
    }
}