package kr.hs.dgsw.java.inherit2.polygon;

public class Sircle extends Polygon {
    protected final double radius;

    @Override
    public double getArea() {
        return (radius * radius) * 3.14 ;
    }


    public Sircle(double radius) {
        super("원");
        this.radius = radius;
    }

    public static void main(String[] args) {
        Polygon rect1 = new Sircle(7);
        System.out.printf("%s의 면적 : %f\n", rect1.getName(), rect1.getArea());
    }
}
