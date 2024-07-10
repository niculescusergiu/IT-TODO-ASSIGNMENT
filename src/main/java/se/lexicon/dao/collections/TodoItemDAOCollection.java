package se.lexicon.dao.collections;
import se.lexicon.ToDoItem;
import se.lexicon.dao.interfaces.TodoItemDAO;
import se.lexicon.dao.sequencers.TodoItemSequencer;

import java.time.LocalDate;
import java.util.ArrayList;

public class TodoItemDAOCollection implements TodoItemDAO {

    ArrayList<ToDoItem> todoItems;
    // Constructor
    public TodoItemDAOCollection() {
        todoItems = new ArrayList<>();
    }
    @Override
    public ToDoItem persist(ToDoItem todoItem) {
        todoItem.setId(TodoItemSequencer.nextId());
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public ToDoItem findById(int todoItemId) {
        if (todoItemId < 0) {
            throw new IllegalArgumentException("Invalid todoItemId: " + todoItemId);
        }
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.getId() == todoItemId) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public ArrayList<ToDoItem> findAllByDoneStatus(boolean done) {
        ArrayList<ToDoItem> doneTodoItems = new ArrayList<>();
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.isDone() == done) {
                doneTodoItems.add(todoItem);
            }
        }
        return doneTodoItems;
    }

    @Override
    public ArrayList<ToDoItem> findByTitleContains(String title) {
        ArrayList<ToDoItem> todoItemsWithTitle = new ArrayList<>();
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.getTitle().contains(title)) {
                todoItemsWithTitle.add(todoItem);
            }
        }
        return todoItemsWithTitle;
    }

    @Override
    public ArrayList<ToDoItem> findByPersonId(int personId) {
        if (personId < 0) {
            throw new IllegalArgumentException("Invalid personId: " + personId);
        }
        ArrayList<ToDoItem> todoItemsByPersonId = new ArrayList<>();
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.getCreatorId() == personId) {
                todoItemsByPersonId.add(todoItem);
            }
        }
        return todoItemsByPersonId;
    }

    @Override
    public ArrayList<ToDoItem> findByDeadlineBefore(LocalDate end) {
        ArrayList<ToDoItem> todoItemsBeforeDeadline = new ArrayList<>();
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.getDeadLine().isBefore(end)) {
                todoItemsBeforeDeadline.add(todoItem);
            }
        }
        return todoItemsBeforeDeadline;
    }
    @Override
    public ArrayList<ToDoItem> findByDeadlineAfter(LocalDate start) {
        ArrayList<ToDoItem> todoItemsAfterDeadline = new ArrayList<>();
        for (ToDoItem todoItem : todoItems) {
            if (todoItem.getDeadLine().isAfter(start)) {
                todoItemsAfterDeadline.add(todoItem);
            }
        }
        return todoItemsAfterDeadline;
    }

    @Override
    public void remove(int todoItemId) {
        if (todoItemId < 0) {
            throw new IllegalArgumentException("Invalid todoItemId: " + todoItemId);
        }
        todoItems.removeIf(todoItem -> todoItem.getId() == todoItemId);
    }
}