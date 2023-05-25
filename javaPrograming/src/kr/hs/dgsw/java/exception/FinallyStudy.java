package kr.hs.dgsw.java.exception;

public class FinallyStudy {
    public String method1() {
        try {
            System.out.println("point1");
            method2();
            System.out.println("point3");
            return "hello";
        } catch (Exception e) {
            System.out.println("method2");
            throw new RuntimeException();
        } finally {
            System.out.println("point3");
        }
    }
    public void method2() throws Exception {
        throw new Exception();
    }
}
