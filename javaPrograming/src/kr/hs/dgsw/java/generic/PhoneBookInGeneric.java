package kr.hs.dgsw.java.generic;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook<T> {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<T> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(T contact) {
        contacts.add(contact);
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.println("전화번호가 성공적으로 저장되었습니다.");
    }

    public void displayContacts() {
        System.out.println("전화번호 목록");
        System.out.println("===============");
        int count = 0;
        for (T contact : contacts) {
            System.out.println(contact);
            count++;
        }
        System.out.println("총 " + count + "개의 전화번호가 저장되어 있습니다.");
    }

    public void searchContacts(String query) {
        ArrayList<T> matchingContacts = new ArrayList<>();

        for (T contact : contacts) {
            if (contact.toString().contains(query)) {
                matchingContacts.add(contact);
            }
        }
        System.out.println("검색 결과");
        System.out.println("===============");

        int count = 0;

        for (T contact : matchingContacts) {
            System.out.println(contact);
            count++;
        }
        System.out.println("총 " + count + "개의 일치하는 전화번호가 검색되었습니다.");
    }

    private void addContactFromUserInput() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();
        // 원하는 방식으로 Contact 객체를 생성하고 전달합니다.
        // 예를 들어, Contact contact = new Contact(name, phoneNumber);와 같이 생성하면 됩니다.
        addContact(contact);
    }

    private void searchContactsFromUserInput() {
        System.out.print("검색할 이름 또는 일부분을 입력하세요: ");
        String query = scanner.nextLine();
        searchContacts(query);
    }

    private void printInstructions() {
        System.out.println("사용법");
        System.out.println("1. 전화번호 저장: 이름과 전화번호를 입력하여 저장할 수 있습니다.");
        System.out.println("2. 전화번호 목록 출력: 현재 저장된 모든 전화번호를 출력합니다.");
        System.out.println("3. 전화번호 검색: 이름의 일부분을 입력하여 전화번호를 검색합니다.");
        System.out.println("4. 프로그램 종료: 전화번호부 프로그램을 종료합니다.");
        System.out.println("5. 사용법 출력: 사용자 인터페이스와 기능 설명을 출력합니다.");
    }

    public void runPhoneBook() {
        System.out.println("전화번호부 프로그램");
        System.out.println("----------------");

        while (true) {
            System.out.println("1. 전화번호 저장");
            System.out.println("2. 전화번호 목록 출력");
            System.out.println("3. 전화번호 검색");
            System.out.println("4. 프로그램 종료");
            System.out.println("5. 사용법 출력");
            System.out.print("원하는 기능의 번호를 입력하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContactFromUserInput();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContactsFromUserInput();
                    break;
                case 4:
                    System.out.println("프로그램이 종료됩니다.");
                    scanner.close();
                    System.exit(0);
                case 5:
                    printInstructions();
                    break;
                default:
                    System.out.println("해당 번호는 없는 번호입니다. 다시 선택해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook<Contact> phoneBook = new PhoneBook<>();
        phoneBook.runPhoneBook();
    }
}