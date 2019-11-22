package com.ae.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ae.model.Task;
import com.ae.service.TaskService;
import com.ae.service.TaskServiceImpl;


public class TaskController {
	
	
	private TaskService taskService = new TaskServiceImpl();
	
	@CrossOrigin(origins = "http://localhost:4200/")
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@PostMapping("/tasks")
	public Task addTask(Task task) {
		return taskService.saveOrUpdateTask(task);
	}
	
	@GetMapping("/tasks/{taskId}")
	public Task getTaskById(@PathVariable("taskId") int id) {
		return taskService.getTaskById(id);
	}
	
	@PutMapping("/tasks/{taskId}")
	public Task updateTask(@PathVariable("taskId") int id) {
		Task t = taskService.getTaskById(id);
		return taskService.saveOrUpdateTask(t);
	}
	
	@DeleteMapping("/tasks/{taskId}")
	public void deleteTask(@PathVariable("taskId") int id) {
		taskService.deleteTask(id);
	}
	

}
