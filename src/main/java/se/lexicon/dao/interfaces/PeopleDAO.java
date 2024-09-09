package se.lexicon.dao.interfaces;

import Model.Person;

import java.util.Collection;

public interface PeopleDAO {
    /*Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    Collection<Person> findAll();
    void remove(int id);
     */

    Person create(Person person);
    Collection<Person> findAll();
    Person findById(int id);
    Collection<Person> findByName(String name);
    Person update(Person person);
    boolean deleteById(int id);
}
