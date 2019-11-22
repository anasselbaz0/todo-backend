package com.ae.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ae.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
