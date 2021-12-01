package gr.codelearn.domain;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.Objects;

@Data
public class Animal {
    // fields/attributes
    private String name;
    private int age;

    //methods/functionalities

    public Animal() {
        System.out.println("animal default constructor");
    }

    public Animal(String name, int age) {
        //this();
        //this("John", 92);
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("*random animal noises*");
    }

    private void eat(){
        // empty
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
