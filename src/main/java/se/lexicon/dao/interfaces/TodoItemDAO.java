package se.lexicon.dao.interfaces;

import se.lexicon.ToDoItem;
import java.time.LocalDate;
import java.util.ArrayList;

public interface TodoItemDAO {
    ToDoItem persist(ToDoItem todoItem);
    ToDoItem findById(int todoItemId);
    ArrayList<ToDoItem> findAllByDoneStatus(boolean done);
    ArrayList<ToDoItem> findByTitleContains(String title);
    ArrayList<ToDoItem> findByPersonId(int personId);
    ArrayList<ToDoItem> findByDeadlineBefore(LocalDate end);
    ArrayList<ToDoItem> findByDeadlineAfter(LocalDate start);

    void remove(int todoItemId);

}
