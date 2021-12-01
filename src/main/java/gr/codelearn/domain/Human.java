package gr.codelearn.domain;

public abstract class Human {
    int age;

    public void speak(){
        System.out.println("ouga bouga. My age is: " + age);
    }

    public abstract void walk();
}
