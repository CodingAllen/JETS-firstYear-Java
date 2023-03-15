package k07;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        // TODO 自動生成されたコンストラクター・スタブ
    }
    @Override
    public double getArea() {
        double area;
        area =3.14 *  Math.pow(radius, 2);
        return area;
    }


}

