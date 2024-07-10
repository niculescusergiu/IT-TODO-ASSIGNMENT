package se.lexicon.dao.interfaces;


import se.lexicon.ToDoItemTask;

import java.util.ArrayList;

public interface TodoItemTaskDAO {
    ToDoItemTask persist(ToDoItemTask todoItemTask);
    ToDoItemTask findById(int todoItemTaskId);
    ArrayList<ToDoItemTask> findAll();
    ArrayList<ToDoItemTask> findByAssignedStatus(boolean done);
    ArrayList<ToDoItemTask> findByPersonId(int personId);
    void remove(int todoItemTaskId);
}
