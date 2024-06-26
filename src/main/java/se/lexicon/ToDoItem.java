package se.lexicon;

import java.time.LocalDate;

public class ToDoItem {
    //Fields
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;
//Constructor not allowing input to be null for deadline and ToDoItem
    public ToDoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (deadLine == null) {
            throw new IllegalArgumentException("Deadline cannot be null.");
        }
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }
//Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public Person getCreator() {
        return creator;
    }
//Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            throw new IllegalArgumentException("Deadline cannot be null.");
        }
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    //isOverdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadLine);
    }
    //Summary
    public String getSummary() {
        return String.format(
                "{id: %d, title: %s, description: %s, deadline: %s, done: %b, creator: %s}",
                id, title, taskDescription, deadLine, done, creator.getSummary());
    }
}
