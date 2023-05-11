package kr.hs.dgsw.java.first;

public class School {
    String Name;
    String schoolName;
    int countOfStudents = 0;

    int getCountOfStudents;
    void teach() {
        System.out.println(schoolName + "에서는 " + countOfStudents + "명이 공부를 하고 있습니다");
    }

    void enroll() {
        countOfStudents++;

    }

    void graduate() {
        if (countOfStudents > 0) {
            countOfStudents--;
        }
    }


}