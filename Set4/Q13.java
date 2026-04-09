import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        t.getData(b, h);
        System.out.println("Triangle Area: " + t.getArea());

        Rectangle r = new Rectangle();
        System.out.print("\nEnter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        r.getData(l, w);
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
