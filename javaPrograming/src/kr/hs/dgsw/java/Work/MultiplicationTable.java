package kr.hs.dgsw.java.Work;
import java.util.Scanner;

public class MultiplicationTable {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2에서 9까지의 수 중에서 정수를 입력해주세요: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Function to print multiplication table
    public static void printMultiplicationTable(int num) {
        if (num < 2 || num > 9) {
            System.out.println("2에서 9까지의 수 중에서 고르세요");
        } else {
            System.out.println("구구단" + num + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int num = getInput();
        printMultiplicationTable(num);
    }
}
