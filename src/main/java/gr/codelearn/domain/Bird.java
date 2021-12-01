package gr.codelearn.domain;

public class Bird extends Animal{

    public Bird() {
        System.out.println("bird default constructor");
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly(){
        System.out.println("*flies*");
    }

    @Override
    public void makeSound(){
        System.out.println("*random flap flap noises*");
    }
}
