package kr.hs.dgsw.java.inter;

public class Dog implements Sound {

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();

        Dog gang = new Dog();
        gang.makeSound();

        Sound pet = new Dog();
        pet.makeSound();


    }

}
