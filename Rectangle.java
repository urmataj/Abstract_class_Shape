package Abstract_class_Shape;

/**
 * Derived class
 * Represents a rectangle.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 8.10.23
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Creates a rectangle with specified parameters width and height.
     * @param width
     * @param height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle without any parameters.
     */

    public Rectangle() {}

    /**
     * Gets the width of rectangle.
     * @return A double representing the width of rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of rectangle.
     * @return A double representing the height of rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the area of rectangle.
     * @return A double representing the area of rectangle.
     */
    @Override
    public double getArea() {
        return Math.round((this.width * this.height) * 100.0)/100.0;
    }

    /**
     * Gets the perimeter of rectangle.
     * @return A double representing the perimeter of rectangle.
     */
    @Override
    public double getPerimeter() {
        return Math.round(((this.width + this.height) * 2) * 100.0)/100.0;
    }
}
