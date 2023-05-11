package kr.hs.dgsw.java.inter.phoneBook;

public class DummyPhoneNumberReader implements PhoneNumberReader {

    @Override
    public String read(String name) throws Exception {
        if ("천수인".equals(name)) {
            return "010-1234-1234";
        } else if ("정규민".equals(name)){
            return "010-1123-1234";
        } else {
            throw new Exception();
        }
    }
}
