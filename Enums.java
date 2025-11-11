public class Enums {
    public static void main(String[] args) {
        Task task1 = new Task("buy milk", "Buy milk");
        task1.getStatus();
        task1.setStatusInProgress();
        task1.setStatusCompleted();
    }
}

enum TaskStatus {
    NEW_TASK,
    IN_PROGRESS,
    COMPLETED
}

class Task {
    private TaskStatus status;
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = TaskStatus.NEW_TASK;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setStatusInProgress() {
        this.setStatus(TaskStatus.IN_PROGRESS);
        System.out.println(this.title + " in status " + this.getStatus());
    }

    public void setStatusCompleted() {
        this.setStatus(TaskStatus.COMPLETED);
        System.out.println(this.title + " in status " + this.getStatus());

    }
}