package kr.hs.dgsw.java.list;

public interface List {
    // 추가;
    public void add(String value);

    // 삭제
    public void remove(int index);

    // 신규
    public String get(int index);

    // 크기
    public int size();


}
