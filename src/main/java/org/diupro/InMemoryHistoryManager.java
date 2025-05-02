package org.diupro;

import org.diupro.model.Task;
import org.diupro.taskmanager.HistoryManager;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    private final List<Task> listTaskHistory;

    public InMemoryHistoryManager() {
        this.listTaskHistory = new ArrayList<>();
    }

    @Override
    public <T extends Task> void add(T task) { // добавляет задаыи в историю
        if (task != null) {
            if (listTaskHistory.size() == 10) {
                listTaskHistory.removeFirst();
            }
            listTaskHistory.add(task);
        }
    }

    @Override
    public List<Task> getHistory() { // получает список истории
        //return List.of();
        return new ArrayList<>(listTaskHistory);
    }
}
