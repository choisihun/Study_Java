package kr.hs.dgsw.java.operation2;

import java.net.SocketOption;

public class BitwiseStudy {
void studyAnd() {
    int op1 = 0b0111;
    int op2 = 0b0011;
    int result = op1 & op2;
    System.out.printf("%d & %d = %d\n", op1, op2, result);
}
void studyNot() {
    int value = 0b0101;
    int not = ~value;
    System.out.printf("~%d = %d\n", value, not);
}
    public static void main(String[] args) {
        BitwiseStudy object = new BitwiseStudy();
        object.studyAnd();
    }
}
