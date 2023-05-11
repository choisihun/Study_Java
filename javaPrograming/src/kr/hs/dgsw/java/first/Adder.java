package kr.hs.dgsw.java.first;

public class Adder {


    int plus(int operand1, int operand2) {
        int sum = operand1 + operand2;

        return sum;
    }
    int pluses(int operand1, int operand2, int operand3) {
        int sum = operand1 + operand2 + operand3;

        return sum;
    }

    public static void main(String[] args) {
        Adder calc = new Adder();
        int result = calc.pluses(123443, 12341, 12341);
        System.out.println(result);

    }
}
