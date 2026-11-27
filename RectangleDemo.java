//RECTANGLE WITH OVERLOAD CONSTRUCTOR

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        this(1.0, 1.0);
    }

    Rectangle(double side) {
        this(side, side);
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(3, 4);

        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(r3.calculateArea());
    }
}
