package kr.hs.dgsw.java.Work;
import java.util.Scanner;


public class CalculatorFactorial {

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.close();

        int factorial = calculateFactorial(num);
        System.out.println(num + "! = " + factorial);
    }
}
