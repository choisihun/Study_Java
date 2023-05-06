package kr.hs.dgsw.java;

public class SchoolJob {
    public static void main(String[] args) {
        School dgsw = new School();
        School bssw = new School();

        dgsw.schoolName = "대구 소프트웨어 마이스터 고등학교";
        dgsw.enroll();
        dgsw.enroll();
        dgsw.teach();
        dgsw.graduate();
        dgsw.teach();

        bssw.schoolName = "부산 소프트웨어 마이스터 고등학교";
        dgsw.enroll();
        dgsw.enroll();
        dgsw.teach();
        dgsw.graduate();
        dgsw.teach();
    }
}
