import java.util.Scanner;

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolume(int r) {
        return (4.0 / 3) * 3.14 * r * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Cube Volume: " + v.calculateVolume(side));

        System.out.print("\nEnter length, width, height: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Rectangular Cube Volume: " + v.calculateVolume(l, w, h));

        System.out.print("\nEnter radius of sphere: ");
        int r = sc.nextInt();
        System.out.println("Sphere Volume: " + v.calculateVolume(r));
    }
}
