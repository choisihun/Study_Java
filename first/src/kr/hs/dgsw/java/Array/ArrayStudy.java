package kr.hs.dgsw.java.Array;

import kr.hs.dgsw.java.String.StringLength;

public class ArrayStudy {
    void study() {
        double[] doubleArray = new double[100];
        String[] strArray = new String[20];
        boolean[] boolArry = null;
        strArray[2] = "Lion";
        strArray[5] = "Rabbit";
        doubleArray[0] = 3.14;

        String str = null;
        str = strArray[5];

        System.out.println(strArray[3]);
        System.out.println(strArray[2]);
        System.out.println(doubleArray[1]);
        System.out.println(boolArry[0]);
    }
    void studyInit() {
        int[] values = new int[] {5, 4, 9, 3, 1};

        System.out.println(values[0]+"  " +values[1]);
        int lengthOfArray = values.length;
        System.out.printf("배열의 길이 : %d\n", lengthOfArray);
        for (int i = 0; i<values.length; i++) {
            System.out.printf("%d - %d", i, values[i]);
        }
    }
    // 4월 13일 코드
//    int sum() {
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        ArrayStudy study = new ArrayStudy();
        study.studyInit();
    }

}
