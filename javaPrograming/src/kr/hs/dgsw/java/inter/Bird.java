package kr.hs.dgsw.java.inter;

public class Bird implements Sing{

    @Override
    public void makeSound() {
        System.out.println("쨱쨱");
    }


    @Override
    public void sing() {
        System.out.println("꾀꼴꾀꼴");
    }

}
