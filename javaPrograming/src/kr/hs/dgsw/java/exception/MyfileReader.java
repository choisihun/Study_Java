package kr.hs.dgsw.java.exception;

import java.io.File;
import java.io.FileInputStream;

public class MyfileReader {
    public String readString(String filePath) {
        FileInputStream is = null;
        try {
            File file = new File(filePath);
            is = new FileInputStream(file);

            String result = "";
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                result += new String(buffer, 0, length);
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException("파일을 읽을 수 없습니다");
        } finally {
            try {
                if (is !=null) {
                    is.close();
                }
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        MyfileReader reader = new MyfileReader();
        String srt = reader.readString("/Users/choesihun/Documents/GitHub/LestsEatingTime_iOS/LetsEatingTime/LetsEatingTime/Resources/Object");

    }
}
