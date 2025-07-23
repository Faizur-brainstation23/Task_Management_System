package com.yourcompany.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Method to get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll(); // Fetches all tasks from the repository
    }

    // Method to add a task with validation logic
    public String addTask(Task task) {
        if (task == null || task.getName() == null || task.getName().isEmpty()) {
            return "Task name is required!";
        }
        taskRepository.save(task);
        return "Task added successfully!";
    }
}
