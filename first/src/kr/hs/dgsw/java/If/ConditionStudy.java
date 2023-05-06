package kr.hs.dgsw.java.If;

public class ConditionStudy {
//    boolean flag1 = true;
//    boolean flag2 = false;
//
//    int value = 0;
//    if (flag1)
//        value = 1;
//    if (flag2)
//        value = 2;
//    else
//        value = 3;
//
//    public static void main(String[] args) {
//
//        StudyIf
//    }

//    void studyWhile() {
//        String str = null;
//
//        while (!"Q".equals(str)) {
//            str = scanner.next();
//        }
//    }

//    void studyFor() {
//        int sum = 0;
//        for ( int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 100 ; ++i) {
//                sum += i;
//        }

//        System.out.println(sum);
//    }
void studyFor2() {
    String[] colors = new String[]{"red", "yellow", "green", "blue", "purple"};

    for (int i = 0; i < colors.length; i++) {
        System.out.println(colors[i]);
    }

    for (String color : colors) {
        System.out.println(colors);
    }
}

    public static void main(String[] args) {
        ConditionStudy study = new ConditionStudy();
        study.studyFor2();
    }
}



