package kr.hs.dgsw.java.exception;

import java.util.Scanner;

public class WordChecker extends InvalidWordException {
        static Scanner scanner = new Scanner(System.in);
    public void chackWord() {
        String str = scanner.next();

        if (isAlphabetword(str)) {
            System.out.println(str);
        } else {
            throw new InvalidWordException();
        }
    }
    boolean isAlphabetword(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch <'A' || (ch > 'Z' && ch < 'a') || ch >'z') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws InvalidWordException {
        WordChecker wordChecker = new WordChecker();

        try {
            wordChecker.chackWord();
        } catch (Exception e) {
            System.out.println("잘못된 단여를 입력하였습니다");
        }
    }
}
