package se.lexicon;

public class ToDoItemTaskTest {

    public static void main(String[] args) {
        testToDoItemTask();
    }

    public static void testToDoItemTask() {
        // Create a ToDoItemTask with basic data
        ToDoItemTask task1 = new ToDoItemTask(1, "Finish homework", "John Doe");

        // Test getters
        System.out.println("ID: " + task1.getId());
        System.out.println("Is assigned? " + task1.isAssigned());
        System.out.println("ToDoItem: " + task1.getToDoItem());
        System.out.println("Assignee: " + task1.getAssignee());

        // Test setters
        task1.setAssigned(false);
        task1.setToDoItem("Clean house");
        task1.setAssignee("Jane Smith");

        // Test updated state
        System.out.println("After updates:");
        System.out.println("Is assigned? " + task1.isAssigned());
        System.out.println("ToDoItem: " + task1.getToDoItem());
        System.out.println("Assignee: " + task1.getAssignee());

        // Test getSummary method
        System.out.println("Summary: " + task1.getSummary());
    }

    static class ToDoItemTask {
        private int id;
        private boolean assigned;
        private String toDoItem;
        private String assignee;

        public ToDoItemTask(int id, String toDoItem, String assignee) {
            if (toDoItem == null) {
                throw new IllegalArgumentException("ToDoItem cannot be null");
            }
            this.id = id;
            this.toDoItem = toDoItem;
            this.assignee = assignee;
            this.assigned = (assignee != null && !assignee.isEmpty());
        }

        public int getId() {
            return id;
        }

        public boolean isAssigned() {
            return assigned;
        }

        public String getToDoItem() {
            return toDoItem;
        }

        public String getAssignee() {
            return assignee;
        }

        public void setAssigned(boolean assigned) {
            this.assigned = assigned;
        }

        public void setToDoItem(String toDoItem) {
            if (toDoItem == null) {
                throw new IllegalArgumentException("ToDoItem cannot be null");
            }
            this.toDoItem = toDoItem;
        }

        public void setAssignee(String assignee) {
            this.assignee = assignee;
            this.assigned = (assignee != null && !assignee.isEmpty());
        }

        public String getSummary() {
            return String.format(
                    "{id: %d, assigned: %b, todoItem: %s, assignee: %s}",
                    id, assigned, toDoItem, assignee != null ? assignee : "None");
        }
    }
}