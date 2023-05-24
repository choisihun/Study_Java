package kr.hs.dgsw.java.exception;

public class ExceptionStudy {

    public void method1() {
        String str = null;
        int length = str.length();
    }
    public  int divide(int op1, int op2) {
        try {
            System.out.println("location 1");
            int result = op1 / op2;
            System.out.println("location 2");
            return result;
        } catch(Exception e) {
            System.out.println("location3");
            return 0;
        }

    }



    public static void main(String[] args) {
        ExceptionStudy study = new ExceptionStudy();
         int value = study.divide(3, 5);
        System.out.println("main");
//        study.method1();
    }
}
