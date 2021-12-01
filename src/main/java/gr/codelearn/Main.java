package gr.codelearn;

import gr.codelearn.domain.*;
import gr.codelearn.domain.enumeration.Breed;
import gr.codelearn.domain.enumeration.Color;
import gr.codelearn.service.AnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        // Instantiating our animal service
        AnimalServiceImpl animalServiceImpl = new AnimalServiceImpl();

        // Hypothetical validation
        String name = "Abc";
        int age = 15;
        boolean result = animalServiceImpl.checkValidations(name, age);
        // ....

        // Showing different instances of the same class
        Animal animal1 = new Animal("Ioannis not the whale", 4);
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());

        Animal animal2 = new Animal();
        System.out.println(animal2.getAge());
        System.out.println(animal2.getAge());

        Animal animal = new Animal();
        animal.makeSound();

        // Inheritance examples
        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();

        Eagle eagle = new Eagle();
        eagle.makeSound();
        eagle.fly();
        eagle.fly(5);
        eagle.fly("4");
        eagle.eagleflies();

        System.out.println("--------------------");

        Bird bird2 = new Eagle();
        bird2.fly();

        Fish fish = new Fish();
        fish.makeSound();

        // "Business logic" should always be in services, not inside domain classes
        animalServiceImpl.executeFly(bird2);
        animalServiceImpl.increaseAgeByOne(eagle);

        // Showcasing toString()
        System.out.println(eagle);

        // Showcasing equals() when two objects have the same reference
        Bird bird3 = bird2;
        System.out.println(bird3.equals(bird2));

        // Showcasing equals() when business logic defines that two animals are equal when their age is the same
        // Check the equals() method inside the Animal class
        Animal animal3 = new Animal("Beaver", 5);
        Animal animal4 = new Animal("Horse", 5);
        System.out.println(animal3.equals(animal4));

        // Showcasing enums
        Dog dog = new Dog(Breed.HUSKY, Color.RGB);
        System.out.println(dog.getColor().getGreekName());

        // Showcasing interfaces, you can save classes in an "interface type"
        Vehicle car = new Car();
        Vehicle helicopter = new Helicopter();

        // Showcasing abstract classes, you can save classes in an "abstract class type"
        Human human1 = new HomoErectus();
        Human human2 = new HomoSapiens();

        human1.speak();
        human1.walk();

        human2.speak();
        human2.walk();
    }
}
