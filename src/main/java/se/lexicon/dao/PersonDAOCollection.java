package se.lexicon.dao;

import se.lexicon.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDAOCollection implements PersonDAO {
private Collection<Person> persons;

    public PersonDAOCollection() {
        this.persons = new ArrayList<>();
    }
    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(persons);
    }

    @Override
    public void remove(int id) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}
