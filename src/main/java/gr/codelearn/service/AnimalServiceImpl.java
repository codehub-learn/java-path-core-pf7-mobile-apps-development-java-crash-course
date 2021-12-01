package gr.codelearn.service;

import gr.codelearn.domain.Animal;
import gr.codelearn.domain.Bird;

public class AnimalServiceImpl implements AnimalService {

    // this should be in its own BirdService class
    public void executeFly(Bird bird) {
        bird.fly();
    }

    @Override
    public boolean checkValidations(String name, int age) {
        if (name.length() < 4) {
            return false;
        }
        return true;
    }

    public void increaseAgeByOne(Animal animal) {
        if(animal.getAge() + 1 >= 100) {
            return;
        }
        System.out.println("Before increase: " + animal.getAge());
        int age = animal.getAge();
        animal.setAge(age + 1);
        System.out.println("After increase: " + animal.getAge());
    }


}
