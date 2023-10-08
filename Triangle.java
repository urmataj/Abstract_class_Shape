package Abstract_class_Shape;

/**
 * Derived class
 * Represents a triangle.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 8.10.23
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Creates a triangle with specified parameters side1, side2 and side3.
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Gets the side1 of triangle.
     * @return A double representing the side1 of triangle.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Sets the side1 of triangle.
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Gets the side2 of triangle.
     * @return A double representing the side2 of triangle.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Sets the side2 of triangle.
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Gets the side3 of triangle.
     * @return A double representing the side3 of triangle.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Sets the side3 of triangle.
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * Gets the area of triangle.
     * @return A double representing the area of triangle.
     */
    @Override
    public double getArea() {
        return Math.round((0.5 * (getPerimeter() * (getPerimeter() - this.side1) * (getPerimeter() - this.side2) * (getPerimeter() - this.side3))) * 100.0)/100.0;
    }

    /**
     * Gets the perimeter of triangle.
     * @return A double representing the perimeter of triangle.
     */
    @Override
    public double getPerimeter() {
        return Math.round((side1 + side2 + side3) * 100.0)/100.0;
    }
}
