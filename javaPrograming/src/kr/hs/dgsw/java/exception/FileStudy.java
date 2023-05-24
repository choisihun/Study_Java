package kr.hs.dgsw.java.exception;

import java.io.*;

public class FileStudy {
    public String readFile(String path) {
        File file = new File(path);
        try {
            FileInputStream is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length = 0;
            String result = "";

            while ((length - is.read(buffer)) > 0) {
                result += new String(buffer, 0, length);
            }

            is.close();

            return result;

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        String str = study.readFile("/Users/choesihun/Desktop/cording/JavaPrograming/first/무제 폴더/무제.trf");
        System.out.println(str);
    }
}
