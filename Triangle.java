// Triangle is a child of Shape - it has 3 vertices instead of a simple position
public class Triangle extends Shape {

    // a triangle is defined by 3 points
    private Coordinates p1;
    private Coordinates p2;
    private Coordinates p3;

    // constructor takes 3 points as the vertices
    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(3, p1); // triangle has 3 sides, we use p1 as the main position
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // perimeter = sum of distances between the 3 vertices
    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    // area uses Heron's formula as given in the specification
    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2; // s is the semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // triangle overrides translate because we must move all 3 points
    @Override
    public void translate(int dx, int dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);
    }

    // scale also moves all 3 points
    @Override
    public void scale(int factor, boolean sign) {
        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);
    }

    // returns all information about this triangle as text
    @Override
    public String display() {
        return "Triangle"
                + " | P1: " + p1.display()
                + " | P2: " + p2.display()
                + " | P3: " + p3.display()
                + " | Area: " + getArea()
                + " | Perimeter: " + getPerimeter();
    }
}