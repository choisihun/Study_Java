package kr.hs.dgsw.java;

public class Human {
    int studentAge = 0;
    double studentHeight = 0;
    String studentName = "";

    void aged() {
        //나이가 1 증가하고 키는 8.4cm 증가한다
        //단 나이가 20살이 넘으며 키는 증가하지 않는다.
        studentAge++;

        if (studentAge <= 20) {
            studentHeight = studentHeight + 8.4;
        }

    }
    void print() {
        //홍길동님의 나이는 15세이고, 키는 190.3cm입니다.
        System.out.println(studentName + "의 나이는 " + studentAge + "세이고 키는 " + studentHeight + "cm입니다.");
        System.out.printf("%s님의 나이는 %d세이고, 키는 %f입니다");
    }
    public static void main(String[] args) {
        Human choisihun = new Human();
        choisihun.studentName = "최시훈";
        for (int i = 0; i < 25; i++) {
            choisihun.aged();
            choisihun.print();
        }

    }
}
