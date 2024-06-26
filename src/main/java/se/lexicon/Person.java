package se.lexicon;

public class Person {
    //Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
//Constructor that does not allow the fields being null
    public Person(int id, String firstName, String lastName, String email) {
        if (firstName == null || lastName == null || email == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//Getters that pull the information declared in the application
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
//Logic behind the setters that you can use in the application
    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        this.email = email;
    }
//Logic behind the calling of person.getSummary() in the app which combines and types out in terminal all fields combined
    public String getSummary() {
        return String.format("{id: %d, name: %s %s, email: %s}", id, firstName, lastName, email);
    }
}