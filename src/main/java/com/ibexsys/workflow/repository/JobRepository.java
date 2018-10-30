package com.ibexsys.workflow.repository;

import java.util.List;

import com.ibexsys.workflow.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;



public interface JobRepository extends JpaRepository<Job,Long>{

}
