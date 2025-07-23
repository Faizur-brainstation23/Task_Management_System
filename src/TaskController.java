package com.yourcompany.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Mapping for GET request to fetch all tasks
    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks(); // Returns all tasks
    }

    // Mapping for POST request to add a new task
    @PostMapping("/api/tasks")
    public String addTask(@RequestBody Task task) {
        return taskService.addTask(task); // Adds the task and returns a message
    }
}
