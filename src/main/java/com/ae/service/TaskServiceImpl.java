package com.ae.service;

import java.util.List;

import com.ae.dao.TaskRepository;
import com.ae.model.Task;

public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTaskById(int id) {
		return taskRepository.getOne(id);
	}

	@Override
	public Task saveOrUpdateTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public void deleteTask(int id) {
		taskRepository.deleteById(id);
	}

}
