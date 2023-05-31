package kr.hs.dgsw.java.filestudy;

import java.io.File;
import java.io.IOException;

public class FileClassStudy {

    public void basic() {
        File file1 = new File("/Users/choesihun/Desktop/무제 폴더/무제 폴더/자바수업.txt");
        File file2 = new File("/Users/choesihun/Desktop/무제 폴더/무제 폴더/자바수업.txt");
        File file3 = new File("/Users/choesihun/Desktop/무제 폴더/무제 폴더/hello.txt");


    }
    public void makeFile(String path, String fileName) {
        File file = new File(path, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileClassStudy study = new FileClassStudy();
        study.basic();
        study.makeFile("/Users/choesihun/Desktop/무제 폴더/무제 폴더/", "File.txt");
    }
}
