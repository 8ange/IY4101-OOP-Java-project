import java.util.Scanner;

// this is the main class - it shows a menu and lets the user manage shapes
public class ShapeManagement {

    public static void main(String[] args) {

        ShapeList list = new ShapeList(); // our list of shapes
        Scanner sc = new Scanner(System.in); // reads input from user
        int choice = -1;

        // keep showing the menu until user types 0
        while (choice != 0) {

            System.out.println("\n--- Shape Management ---");
            System.out.println("1: Add a shape");
            System.out.println("2: Remove a shape");
            System.out.println("3: Get info about a shape");
            System.out.println("4: Area and perimeter of a shape");
            System.out.println("5: Display all shapes");
            System.out.println("6: Translate all shapes");
            System.out.println("7: Scale all shapes");
            System.out.println("0: Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1:Triangle 2:Rectangle 3:Square 4:Circle");
                int type = sc.nextInt();

                if (type == 1) {
                    System.out.print("P1 x y: ");
                    int x1 = sc.nextInt(); int y1 = sc.nextInt();
                    System.out.print("P2 x y: ");
                    int x2 = sc.nextInt(); int y2 = sc.nextInt();
                    System.out.print("P3 x y: ");
                    int x3 = sc.nextInt(); int y3 = sc.nextInt();
                    list.addShape(new Triangle(
                            new Coordinates(x1, y1),
                            new Coordinates(x2, y2),
                            new Coordinates(x3, y3)));

                } else if (type == 2) {
                    System.out.print("Position x y: ");
                    int x = sc.nextInt(); int y = sc.nextInt();
                    System.out.print("Width: "); double w = sc.nextDouble();
                    System.out.print("Length: "); double l = sc.nextDouble();
                    list.addShape(new Rectangle(new Coordinates(x, y), w, l));

                } else if (type == 3) {
                    System.out.print("Position x y: ");
                    int x = sc.nextInt(); int y = sc.nextInt();
                    System.out.print("Side: "); double s = sc.nextDouble();
                    list.addShape(new Square(new Coordinates(x, y), s));

                } else if (type == 4) {
                    System.out.print("Position x y: ");
                    int x = sc.nextInt(); int y = sc.nextInt();
                    System.out.print("Radius: "); double r = sc.nextDouble();
                    list.addShape(new Circle(new Coordinates(x, y), r));
                }
                System.out.println("Shape added successfully!");

            } else if (choice == 2) {
                System.out.print("Enter position to remove: ");
                int pos = sc.nextInt();
                Shape removed = list.removeShape(pos);
                if (removed != null) {
                    System.out.println("Removed: " + removed.display());
                }

            } else if (choice == 3) {
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                Shape s = list.getShape(pos);
                if (s != null) {
                    System.out.println(s.display());
                }

            } else if (choice == 4) {
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                System.out.println("Area: " + list.area(pos));
                System.out.println("Perimeter: " + list.perimeter(pos));

            } else if (choice == 5) {
                System.out.println(list.display());

            } else if (choice == 6) {
                System.out.print("Enter dx: "); int dx = sc.nextInt();
                System.out.print("Enter dy: "); int dy = sc.nextInt();
                list.translateShapes(dx, dy);
                System.out.println("All shapes translated!");

            } else if (choice == 7) {
                System.out.print("Enter factor: "); int f = sc.nextInt();
                System.out.print("Multiply? true/false: ");
                boolean s = sc.nextBoolean();
                list.scale(f, s);
                System.out.println("All shapes scaled!");
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}