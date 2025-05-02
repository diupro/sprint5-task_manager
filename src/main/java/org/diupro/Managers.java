package org.diupro;

import org.diupro.taskmanager.HistoryManager;
import org.diupro.taskmanager.InMemoryTaskManager;

public class Managers {
    private TaskManager inMemoryTaskManager;
    private static HistoryManager inMemoryHistoryManager = null;

    public Managers() {
        this.inMemoryTaskManager = new InMemoryTaskManager();
        this.inMemoryHistoryManager = new InMemoryHistoryManager();
    }

    public TaskManager getDefault() {
        return inMemoryTaskManager;
    }

    public static HistoryManager getDefaultHistory() {
        return inMemoryHistoryManager; // возвращает историю просмотров
    }
}
