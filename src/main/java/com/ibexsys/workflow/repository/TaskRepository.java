package com.ibexsys.workflow.repository;

import com.ibexsys.workflow.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
