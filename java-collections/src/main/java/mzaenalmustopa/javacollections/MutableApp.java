package mzaenalmustopa.javacollections;

import mzaenalmustopa.javacollections.data.Person;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("topa");

        person.addHobby("Game");
        person.addHobby("Coding");

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }
}
