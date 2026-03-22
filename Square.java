// Square is a child of Shape - all sides are equal
public class Square extends Shape {

    // a square only needs one measurement - the side
    private double side;

    // constructor - we pass the position and the side length
    public Square(Coordinates coord, double side) {
        super(4, coord); // square has 4 sides
        this.side = side;
    }

    // area is side multiplied by side
    @Override
    public double getArea() {
        return side * side;
    }

    // perimeter is 4 times the side
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // scale changes the size of the square
    @Override
    public void scale(int factor, boolean sign) {
        getCoordinates().scale(factor, sign);
        if (sign == true) {
            side = side * factor;
        } else {
            side = side / factor;
        }
    }

    // returns all information about this square as text
    @Override
    public String display() {
        return "Square at " + getCoordinates().display()
                + " | Side: " + side
                + " | Area: " + getArea()
                + " | Perimeter: " + getPerimeter();
    }
}