package k07;

public class Rectangle implements Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        super();
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        double area;
        area = side1 * side2;
        return area;
    }

}
