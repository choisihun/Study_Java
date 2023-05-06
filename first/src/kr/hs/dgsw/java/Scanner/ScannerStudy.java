package kr.hs.dgsw.java.Scanner;
import java.util.Scanner;
public class ScannerStudy {
    Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }
    public void studyScanner() {
        String str = this.scanner.next();
        System.out.println("읽어온 값 : " + str);

        str = this.scanner.next();
        System.out.println("읽어온 값 : " + str);

    }
    public void closeScanner() {
        if (this.scanner != null) {
            this.scanner.close();
        }
    }

    public static void main(String[] args) {
        ScannerStudy study = new ScannerStudy();
        study.prepareScanner();
        study.studyScanner();
        study.closeScanner();
    }
}
