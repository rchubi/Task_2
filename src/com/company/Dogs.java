package com.company;

/**
 * Created by Roman on 28.10.2018.
 */
public class Dogs {
    String name;
    int age;
    Breed breed;

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dogs(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    enum Breed{
        Buldog,
        Vivcharka,
        Labrador
    }
}
