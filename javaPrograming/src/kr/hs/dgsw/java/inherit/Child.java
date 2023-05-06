package kr.hs.dgsw.java.inherit;

public class Child extends Perent {

    String job;

    int getSalary() {


        return 100000000;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.job = "iOS개발자";
        child.name = "아들";
        child.sayHello();
    }
}
