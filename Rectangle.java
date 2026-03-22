// Rectangle is a child class of Shape - it inherits everything from Shape
public class Rectangle extends Shape {

    // a rectangle has a width and a length
    private double width;
    private double length;

    // constructor - we pass the position, width and length
    public Rectangle(Coordinates coord, double width, double length) {
        super(4, coord); // rectangle has 4 sides, we send this to Shape
        this.width = width;
        this.length = length;
    }

    // area of a rectangle is width multiplied by length
    @Override
    public double getArea() {
        return width * length;
    }

    // perimeter is 2 times width plus 2 times length
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    // scale multiplies or divides the size and position
    @Override
    public void scale(int factor, boolean sign) {
        getCoordinates().scale(factor, sign);
        if (sign == true) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }
    }

    // returns all the information about this rectangle as text
    @Override
    public String display() {
        return "Rectangle at " + getCoordinates().display()
                + " | Width: " + width
                + " | Length: " + length
                + " | Area: " + getArea()
                + " | Perimeter: " + getPerimeter();
    }
}