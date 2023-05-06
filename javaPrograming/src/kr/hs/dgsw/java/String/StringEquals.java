package kr.hs.dgsw.java.String;

public class StringEquals {
    void study() {
        String name1 = "paul";
        String name2 = "Peter";
        String name3 = "paul";
        String name4 = new String("paul");
        String name5 = new String("paul");

        showEquivalent(name1, name2);
        showEquivalent(name1, name3);
        showEquivalent(name1, name4);
        showEquivalent(name1, name5);
    }
    void showEquivalent(String str1, String str2) {
        boolean result = (str1 == str2);
        System.out.printf("\"%s\"와 \"%s\"는 \"%s\". \n", str1, str2, (result ? "같습니다" :"다릅니다"));
    }
    void showEquals(String str1, String str2) {
        boolean result = str1.equals(str2);
        result = str2.equals(str1);
        System.out.printf("\"%s\"와 \"%s\"는 \"%s\". \n", str1, str2, (result ? "같습니다" :"다릅니다"));
    }

    public static void main(String[] args) {
        StringEquals stringEquals = new StringEquals();
        stringEquals.study();
    }
}
