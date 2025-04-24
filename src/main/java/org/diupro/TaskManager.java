package org.diupro;

import org.diupro.model.Epic;
import org.diupro.model.Statuses;

public interface TaskManager {
    void addTask(String name, String description);
    void addEpic(String name, String description);
    void addSubTask(String name, String description, int epic_id);
    void changeTask(int num, String newDescription, String newStatus);
    void changeEpic(int num, String newDescription);
    void changeSubTask(int num, String newDescription, String newStatus);
    Statuses defineEpicStatus(Epic epic);
    void deleteTask(int num);
    void deleteEpic(int num);
    void deleteSubTask(int num);
    void printTasks();
    void printEpics();
    void printAllTasks();
    void clearAllTasks();
    void getHistory();
}
