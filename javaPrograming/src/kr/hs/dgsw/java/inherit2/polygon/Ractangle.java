package kr.hs.dgsw.java.inherit2.polygon;


public class Ractangle extends Polygon {
    protected final double width;

    protected final double heigth;

    @Override
    public double getArea() {
        return width * heigth;
    }


    public Ractangle(double width, double heigth) {
        super("직각사각형");
        this.width = width;
        this.heigth = heigth;
    }

    public static void main(String[] args) {
        Polygon rect1 = new Ractangle(15, 8);
        System.out.printf("%s의 면정: %f\n", rect1.getName(), rect1.getArea());
    }

}
