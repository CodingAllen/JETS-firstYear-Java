package k07;


public class Triangle implements Figure {
    private double bottom;
    private double height;

    public Triangle(double bottom, double height) {
        super();
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area;
        area = (bottom * height) / 2;
        return area;
    }

}
