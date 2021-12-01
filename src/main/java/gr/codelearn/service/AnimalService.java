package gr.codelearn.service;

import gr.codelearn.domain.Animal;

public interface AnimalService {
    boolean checkValidations(String name, int age);
    void increaseAgeByOne(Animal animal);
}
