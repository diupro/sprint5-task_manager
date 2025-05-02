package org.diupro.taskmanager;

import org.diupro.model.Task;

import java.util.List;

public interface HistoryManager {
    <T extends Task> void add(T task);
    List<Task> getHistory();
}
