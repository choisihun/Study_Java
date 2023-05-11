package kr.hs.dgsw.java.inter;

public class Cat implements Sound, Eatable {

    @Override
    public void makeSound() {
        System.out.println("미이이야옹");
    }

    @Override
    public void eat() {
        System.out.println("츄르");
    }


    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();
        tom.eat();

        Sound pet = new Cat();
        pet.makeSound();

    }


}
