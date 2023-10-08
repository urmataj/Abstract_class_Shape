package Abstract_class_Shape;
import java.lang.Math;

/**
 * Derived class
 * Represents a circle.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 8.10.23
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Creates a circle with specified parameter radius.
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of rectangle.
     * @return A double representing the radius of rectangle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of rectangle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the area of circle.
     * @return A double representing the area of circle.
     */
    @Override
    public double getArea() {
        return Math.round((Math.PI * (radius * radius)) * 100.0)/100.0;
    }

    /**
     * Gets the perimeter of circle.
     * @return A double representing the perimeter of circle.
     */
    @Override
    public double getPerimeter() {
        return Math.round((2 * Math.PI * radius) * 100.0)/100.0;
    }
}
