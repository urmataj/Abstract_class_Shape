package Abstract_class_Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a shape type: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("Rectangle")) {
                System.out.println("Width: ");
                double width = scanner.nextDouble();
                System.out.println("Height: ");
                double height = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println(rectangle.getArea());
                System.out.println(rectangle.getPerimeter());
            }
            else if (name.equalsIgnoreCase("Circle")) {
                System.out.println("Radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println(circle.getArea());
                System.out.println(circle.getPerimeter());
            }
            else if (name.equalsIgnoreCase("Triangle")) {
                System.out.println("Side1: ");
                double side1 = scanner.nextDouble();
                System.out.println("Side2: ");
                double side2 = scanner.nextDouble();
                System.out.println("Side3: ");
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle.getArea());
                System.out.println(triangle.getPerimeter());
            }
            else if (name.equalsIgnoreCase("Square")) {
                System.out.println("Length: ");
                double length = scanner.nextDouble();
                Square square = new Square(length);
                System.out.println(square.getArea());
                System.out.println(square.getPerimeter());
            }
            else if (name.equalsIgnoreCase("Finish")) {
                break;
            }
            else {
                System.out.println("Invalid shape!");
            }
        }
    }
}