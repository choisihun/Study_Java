package kr.hs.dgsw.java.Work;
import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int lcm = findLCM(num1, num2);
        System.out.println("최소공배수 " + num1 + " 그리고 " + num2 + " 는: " + lcm);
    }

    public static int findLCM(int num1, int num2) {
        int lcm = 0;
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        return lcm;
    }
}
