package day34_abstraction;

import day34_abstraction.animalTask.Playable;
import day34_abstraction.animalTask.Swimable;

public class Person implements Playable, Swimable {
    @Override
    public void play() {
        System.out.println("Person is playing");
    }

    @Override
    public void swim() {

    }
}

