package kr.hs.dgsw.java.inherit2.polygon;

public class Triangle extends Polygon {
    protected final double width;

    protected final double heigth;

    @Override
    public double getArea() {
        return width * heigth / 2.0;
    }


    public Triangle(double width, double heigth) {
        super("삼각형");
        this.width = width;
        this.heigth = heigth;
    }

    public static void main(String[] args) {
        Polygon rect1 = new Triangle(15, 8);
        System.out.printf("%s의 면적 : %f\n", rect1.getName(), rect1.getArea());
    }
}
