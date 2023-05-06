package kr.hs.dgsw.java.datatype2;

public class DataTypeStudy {
    void studyInteger() {
        byte bytevalue = 1;
        bytevalue = 127;
        bytevalue = -128;

        short shortValue = 1;
        System.out.printf("byte type의 범위 : %d ~ %d \n",
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short type의 범위 : %d ~ %d \n",
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int type의 범위 : %d ~ %d \n",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long type의 범위 : %d ~ %d \n",
                Long.MIN_VALUE, Long.MAX_VALUE);

        int value1 = 1500000000;
        int value2 = 1800000000;
        System.out.printf("%d + %d = %d \n", value1, value2,  (value2 + value1));


        shortValue = bytevalue;
//        byteValue = shortValue;

    }
    void studyFloat() {
        float floatValue = 3.1415926535F;
        double doubleValue = 3.14;

        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
void studyBoolean() {
        boolean success = true;
        success = false;
        int value = 1;
        if (value == 0) {

        }
}
    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();
        dataTypeStudy.studyInteger();
    }
}
