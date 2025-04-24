package org.diupro.model;

import org.diupro.taskmanager.InMemoryTaskManager;
import java.util.Objects;

public class Task {
    private final int id;
    private final String name;
    private String description;
    private Statuses status;

    public Task(String name, String description) {
        this.id = InMemoryTaskManager.getId(); // сквозной код на все задачи
        this.name = name;
        this.description = description;
        this.status = Statuses.NEW;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", description='" + this.description + '\'' +
                ", status='" + this.status + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Task task = (Task) obj;
        // return Objects.equals(getId(), task.getId());
        return getId() == task.getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Statuses getStatus() {
        return status;
    }

    public void setStatus(Statuses status) {
        this.status = status;
    }

    public static void getTask(int id) {

    }
}
