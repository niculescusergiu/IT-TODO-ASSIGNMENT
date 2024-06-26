package se.lexicon;

import java.time.LocalDate;
public class ToDoItemTest {
    public static void main(String[] args) {
        Person creator = new Person(1, "Sergiu", "Niculescu", "niculescusergiu00@gmail.com");
        ToDoItem ToDoItem = new ToDoItem(1, "Change stove", "Change the old stove with the new one", LocalDate.of(2024, 10, 15), false, creator);
        System.out.println(ToDoItem.getSummary());
        System.out.println(ToDoItem.isOverdue());
    }
}
