package se.lexicon;

import Model.Person;

public class PersonTest{
    public static void main(String[] args) {
        Person person = new Person(1, "Sergiu", "Niculescu", "niculescusergiu00@gmail.com");
        System.out.println(person);

        person.setLastName("Nicolaescu");
        person.setEmail("sergiu00niculescu@gmail.com");
        System.out.println(person);

    }
}