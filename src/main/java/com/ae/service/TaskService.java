package com.ae.service;

import java.util.List;

import com.ae.model.Task;

public interface TaskService {

	public List<Task> getAllTasks();
	
	public Task getTaskById(int id);
	
	public Task saveOrUpdateTask(Task task);
	
	public void deleteTask(int id);
	
}
