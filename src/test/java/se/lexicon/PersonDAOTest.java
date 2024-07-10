package se.lexicon;

import se.lexicon.dao.PersonDAO;
import se.lexicon.dao.PersonDAOCollection;

public class PersonDAOTest {
    public static void main(String[] args) {
        // Create an instance of PersonDAOCollection
       PersonDAO personDAO = new PersonDAOCollection();


        // Test persist method
        Person person1 = new Person(1, "Sergiu", "Niculescu", "sergiu@test.se");
        Person person2 = new Person(2, "Nicolae", "Niculescu", "nicolae@test.se");
        personDAO.persist(person1);
        personDAO.persist(person2);

        // Test findById method
        Person foundPerson = personDAO.findById(1);
        if (foundPerson != null) {
            System.out.println("Found person by ID: " + foundPerson.getId());
        } else {
            System.out.println("Person not found by ID");
        }

        // Test findByEmail method
        Person foundByEmail = personDAO.findByEmail("nicolae@test.se");
        if (foundByEmail != null) {
            System.out.println("Found person by email: " + foundByEmail.getEmail());
        } else {
            System.out.println("Person not found by email");
        }

        // Test remove method
        personDAO.remove(1);
        Person removedPerson = personDAO.findById(1);
        if (removedPerson == null) {
            System.out.println("Person with ID 1 was successfully removed");
        } else {
            System.out.println("Failed to remove person with ID 1");
        }
    }
}