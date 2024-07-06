package se.lexicon;

import java.time.LocalDate;

/**
 * TODO: Add a Test class to test the classes in this package.
 */
public class App
{
    public static void main( String[] args )
    {
        AppRole user = AppRole.ROLE_APP_USER;
        AppRole admin = AppRole.ROLE_APP_ADMIN;
        // Create an AppUser object
        AppUser credentials = new AppUser("sergiu.niculescu", "sergiu123", admin);
        // Create a Person object
        Person sergiu = new Person(1, "Sergiu", "Niculescu", "niculescusergiu00@gmail.com");
        // Set the credentials for the person
        sergiu.setCredentials(credentials);

        // print the person object using the overridden toString method
        System.out.println("Person:");
        System.out.println(sergiu);

        // Print the credentials of the person
        System.out.println("\nCredentials:");
        System.out.println(sergiu.getCredentials());

        // Create a TodoItem object
        ToDoItem todoItem = new ToDoItem(1, "TODO-IT", "Workshop", LocalDate.of(2024, 07, 20), false, sergiu);
        System.out.println("\nTodoItem:");
        System.out.println(todoItem);
        // Create a TodoItemTask object
        ToDoItemTask todoItemTask = new ToDoItemTask(1, todoItem, sergiu);
        System.out.println("\nTodoItemTask:");
        System.out.println(todoItemTask);

        // Create another person object
        Person julian = new Person(2, "Nicolae", "Niculescu", "nicolaeniculescu@gmail.com");
        // Assign credentials to the new person
        credentials = new AppUser("nicolae.niculescu", "nicolae123", user);
        julian.setCredentials(credentials);

        // Create another todoItem object and assign it to the same person
        ToDoItem todoItem2 = new ToDoItem(1, "Todo-IT Workshop","workshop test", LocalDate.of(2024,07,20), false, sergiu);
        // Compare todoItem and todoItem2
        System.out.println("\nComparing todoItem and todoItem2:");
        System.out.println(todoItem.equals(todoItem2)); // Should return false
    }
}