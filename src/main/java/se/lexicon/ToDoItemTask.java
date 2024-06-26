package se.lexicon;

public class ToDoItemTask {
    //Fields
    private int id;
    private boolean assigned;
    private ToDoItem ToDoItem;
    private Person assignee;
//Constructor
    public ToDoItemTask(int id, se.lexicon.ToDoItem toDoItem, Person assignee) {
        if (toDoItem == null) {
    throw new IllegalArgumentException("TodoItem cannot be null");
        }
        this.id = id;
        this.ToDoItem = toDoItem;
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }
//Getters
    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public ToDoItem getToDoItem() {
        return ToDoItem;
    }

    public Person getAssignee() {
        return assignee;
    }
    //Setters
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setToDoItem(se.lexicon.ToDoItem toDoItem) {
        if (toDoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }

        this.ToDoItem = toDoItem;

    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }
    //Summary
    public String getSummary() {
        return String.format(
                "{id: %d, assigned: %b, todoItem: %s, assignee: %s}",
                id, assigned, ToDoItem.getSummary(), assignee != null ? assignee.getSummary() : "None");
    }
}
