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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
    public String toString() {
        return "TodoItemTask{" +
                "todoItem=" + ToDoItem +
                ", assigned=" + assigned +
                ", id=" + id +
                '}';
    }
}
