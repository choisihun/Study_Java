package kr.hs.dgsw.java.inter.phoneBook;

import java.io.File;
import java.util.Scanner;

public class PhoneBook {


    private final Scanner scanner = new Scanner(System.in);

    private PhoneNumberReader phoneNumberReader;

    public PhoneBook(PhoneNumberReader phoneNumberReader) {
        this.phoneNumberReader = phoneNumberReader;
    }

    public void execute() {
        while (true) {
            String name = inputName();
            if("quit".equals(name)) {
                break;
            }
            try {
                String phoneNumber = phoneNumberReader.read(name);
                printPhoneNumber(name, phoneNumber);

            } catch (Exception e) {
                printNotRegistered(name);
            }
        }
        scanner.close();
    }
    public String inputName() {
        System.out.println("이름 : ");
        return scanner.next();
    }

    public void printPhoneNumber(String name, String phoneNumber) {
        System.out.printf("%s님의 전화번호는 '%s'입니다\n", name, phoneNumber);

    }
    public void printNotRegistered(String name) {
        System.out.printf("%s님의 전화번호는 없습니다\n", name);
    }

    public static void main(String[] args) {
        PhoneNumberReader phoneNumberReader = new DummyPhoneNumberReader();
        PhoneBook phoneBook = new PhoneBook(phoneNumberReader);
        phoneBook.execute();
    }
}
