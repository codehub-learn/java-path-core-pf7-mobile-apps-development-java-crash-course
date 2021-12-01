package gr.codelearn.domain;

import gr.codelearn.domain.enumeration.Breed;
import gr.codelearn.domain.enumeration.Color;

public class Dog extends Animal {
    Color color;
    Breed breed;

    public Dog(Breed breed, Color color) {
        this.breed = breed;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
