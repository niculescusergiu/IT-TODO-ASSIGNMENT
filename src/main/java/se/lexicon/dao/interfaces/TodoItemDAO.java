package se.lexicon.dao.interfaces;

import Model.Person;
import Model.ToDoItem;

import java.util.Collection;

public interface TodoItemDAO {
    /*ToDoItem persist(ToDoItem todoItem);
    ToDoItem findById(int todoItemId);
    ArrayList<ToDoItem> findAllByDoneStatus(boolean done);
    ArrayList<ToDoItem> findByTitleContains(String title);
    ArrayList<ToDoItem> findByPersonId(int personId);
    ArrayList<ToDoItem> findByDeadlineBefore(LocalDate end);
    ArrayList<ToDoItem> findByDeadlineAfter(LocalDate start);
    void remove(int todoItemId);*/

    ToDoItem create(ToDoItem todoItem);
    Collection<ToDoItem> findAll();
    ToDoItem findById(int todoItemId);
    Collection<ToDoItem> findByDoneStatus(boolean done);
    Collection<ToDoItem> findByAssignee(int assigneeId);
    Collection<ToDoItem> findByAssignee(Person assignee);
    Collection<ToDoItem> findByUnassignedTodoItems();
    ToDoItem update (ToDoItem todoItem);
    boolean deleteById(int todoItemId);


}
