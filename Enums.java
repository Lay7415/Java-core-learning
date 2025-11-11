public class Enums {
    public static void main(String[] args) {
        Task task1 = new Task("buy milk", "Buy milk");
        task1.getStatus();
        TaskMethodEnum taskMethodEnum = TaskMethodEnum.IN_PROGRESS;
        taskMethodEnum.mark(task1);
        taskMethodEnum = TaskMethodEnum.COMPLETED;
        taskMethodEnum.mark(task1);

        TaskStatus[] statuses = TaskStatus.values();

        for (TaskStatus status : statuses) {
            System.out.println(status.getClass());
            System.out.println(status.ordinal());
        }
    }
}

enum TaskStatus {
    NEW_TASK("Новая задача"),
    IN_PROGRESS("В Прогрессе"),
    COMPLETED("Завершенно");

    private String translate;

    TaskStatus(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

}

enum TaskMethodEnum {
    NEW_TASK {
        @Override
        void mark(Task task) {
            task.setStatus(TaskStatus.NEW_TASK);
        }
    },
    IN_PROGRESS {
        @Override
        void mark(Task task) {
            task.setStatus(TaskStatus.IN_PROGRESS);
        }
    },

    COMPLETED {
        @Override
        void mark(Task task) {
            task.setStatus(TaskStatus.COMPLETED);
        }
    };

    abstract void mark(Task task);
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

    public void setStatus(TaskStatus status) {
        this.status = status;
        System.out.println(this.title + " in status " + this.getStatus().getTranslate());
    }
}