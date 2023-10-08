package Abstract_class_Shape;

/**
 * Abstract class
 * Represents a shape.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 8.10.23
 */


public abstract class Shape {
    private String name;

    /**
     * Gets the area of shape.
     * @return A double representing the area of shape.
     */
    public abstract double getArea();

    /**
     * Gets the perimeter of shape.
     * @return A double representing the perimeter of shape.
     */

    public abstract double getPerimeter();
}

