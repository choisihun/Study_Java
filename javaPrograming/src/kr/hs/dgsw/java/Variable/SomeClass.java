package kr.hs.dgsw.java.Variable;

public class SomeClass {
    int count = 5;
    String name = "대소고";
    void someMethod1() {
        int value = 8;
        if (true) {
            int age = 19;
//            int value = 9;
        }
        if (true) {
            int age = 20;
        }
        count = count + 1;

    }
    void someMethod2(int parma) {
        name = "대구소프트웨어";
        System.out.println("pos1: " + count);
        int count = 8;
        count = count + 4;
        System.out.println("pos2: " + count);
        this.count = 120;
    }

    public static void main(String[] args) {
        SomeClass SomeClass = new SomeClass();
        SomeClass.someMethod2(1);
    }
}
