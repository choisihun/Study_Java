package kr.hs.dgsw.java.Work;
import java.util.Scanner;

public class CurrencyCalculator {
    public static int[] calculateCurrencyCounts(int amount, int[] denominations) {
        int[] currencyCounts = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            currencyCounts[i] = amount / denominations[i];
            amount %= denominations[i];
        }
        return currencyCounts;
    }
    public static void printCurrencyCounts(int[] currencyCounts, int[] denominations) {
        for (int i = 0; i < denominations.length; i++) {
            if (currencyCounts[i] > 0) {
                System.out.println(denominations[i] + "원권" + " " + currencyCounts[i] + "장");

            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("한국 돈 넣으세요: ");
        int amount = scanner.nextInt();
        scanner.close();

        int[] denominations = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] currencyCounts = calculateCurrencyCounts(amount, denominations);

        printCurrencyCounts(currencyCounts, denominations);
    }
}
