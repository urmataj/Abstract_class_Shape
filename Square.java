package Abstract_class_Shape;

/**
 * Derived class of classes Shape and Rectangle
 * Represents a square.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 8.10.23
 */
public class Square extends Rectangle{
    private double length;

    /**
     * Creates a square with specified parameter length.
     * @param length
     */
    public Square(double length) {
        this.length = length;
    }

    /**
     * Gets the length of square.
     * @return A double representing the length of square.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of square.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Gets the area of sqyare.
     * @return A double representing the area of square.
     */
    @Override
    public double getArea() {
        return Math.round((length * length) * 100.0)/100.0;
    }

    /**
     * Gets the perimeter of square.
     * @return A double representing the perimeter of square.
     */
    @Override
    public double getPerimeter() {
        return Math.round(((length * 4) * 100.0)/100.0);
    }
}
