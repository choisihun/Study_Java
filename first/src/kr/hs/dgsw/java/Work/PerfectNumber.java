package kr.hs.dgsw.java.Work;
import java.util.Scanner;

public class PerfectNumber {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("임의의 정수를 입력하세요 : ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void printResult(int num, boolean isPerfect) {
        if (isPerfect) {
            System.out.println(num + " 이 수는 완전수 입니다.");
        } else {
            System.out.println(num + " 이 수는 완전수가 아닙니다.");
        }
    }
    public static void main(String[] args) {
        int num = getInput();
        boolean isPerfect = isPerfectNumber(num);
        printResult(num, isPerfect);
    }
}

