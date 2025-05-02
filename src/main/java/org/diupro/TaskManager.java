package org.diupro;

import org.diupro.model.Epic;
import org.diupro.model.Statuses;

public interface TaskManager {
    // Добавить
    void addTask(String name, String description);
    void addEpic(String name, String description);
    void addSubTask(String name, String description, int epic_id);
    // Изменить
    void changeTask(int num, String newDescription, String newStatus);
    void changeEpic(int num, String newDescription);
    void changeSubTask(int num, String newDescription, String newStatus);
    // Удалить
    void deleteTask(int num);
    void deleteEpic(int num);
    void deleteSubTask(int num);
    void clearAllTasks();
    // Печать
    void printTasks();
    void printEpics();
    void printAllTasks();

    Statuses defineEpicStatus(Epic epic);
    void getHistory();
}
