package kr.hs.dgsw.java.first;

public class Accumulator {
    int sum = 0;
// 정수를 입력받아서 계속 더한다.
    void add(int value) {
        sum += value;
    }
    // 현제까지 누적된 값을 리턴해준다
    int getSum() {
        return sum;

    }
// 누적된 값을 초기화 한다.
    void reset() {
        sum = 0;
    }
    public static void main(String[] args) {
        Accumulator object = new Accumulator();
        object.add(3);
        object.add(8);
        object.add(11);

        int value1 = object.getSum();
        System.out.println(value1);
        object.add(-5);
        int value2 = object.getSum();
        System.out.println(value2);
        object.reset();
        int value3 = object.getSum();
        System.out.println(value3);
    }
}
