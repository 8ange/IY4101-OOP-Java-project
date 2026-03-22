// abstract means we cannot create a Shape object directly
// it is a parent class - all shapes inherit from this
public abstract class Shape {

    // every shape has a position and a number of sides
    private Coordinates position;
    private int sides;

    // constructor saves the sides and position
    public Shape(int sides, Coordinates coord) {
        this.sides = sides;
        this.position = coord;
    }

    // returns where the shape is
    public Coordinates getCoordinates() {
        return position;
    }

    // returns how many sides the shape has
    public int getSides() {
        return sides;
    }

    // changes the position of the shape
    public void setCoordinates(Coordinates newCoord) {
        this.position = newCoord;
    }

    // moves the shape by moving its position
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    // these are abstract - each shape must write its own version
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void scale(int factor, boolean sign);
    public abstract String display();
}