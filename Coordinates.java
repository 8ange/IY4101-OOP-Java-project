public class Coordinates {

    // these store the x and y position of a point on screen
    private int x;
    private int y;

    // this runs when we create a new point, it saves x and y
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns the x value
    public int getX() {
        return x;
    }

    // returns the y value
    public int getY() {
        return y;
    }

    // calculates how far this point is from another point p
    // uses the standard distance formula from the specification
    public double distance(Coordinates p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // moves the point by adding dx to x and dy to y
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    // if sign is true we multiply, if false we divide
    public void scale(int factor, boolean sign) {
        if (sign == true) {
            x = x * factor;
            y = y * factor;
        } else {
            x = x / factor;
            y = y / factor;
        }
    }

    // returns the coordinates as a readable string
    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}