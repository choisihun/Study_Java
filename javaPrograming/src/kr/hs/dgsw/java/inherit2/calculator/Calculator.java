package kr.hs.dgsw.java.inherit2.calculator;

import java.util.Scanner;

public class Calculator {
    protected final Scanner scanner = new Scanner(System.in);

    protected int op1;

    protected int op2;
    public void excute() {
        while (true) {
            input();

            if (op1 == 0 && op2 == 0) {
                break;
            }
            printResult();
        }
        scanner.close();
        System.out.println("프로그램을 종료합니다");
    }
    public void input() {
        System.out.println("\n두개의 의 정수를 입력하세요");
        op1 = scanner.nextInt();
        op2 = scanner.nextInt();

    }

    public int calculate() {

        return op1 + op2;
    }

    public void printResult() {
                System.out.printf("%d + %d = %d", op1, op2, calculate());
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.excute();
    }


}
