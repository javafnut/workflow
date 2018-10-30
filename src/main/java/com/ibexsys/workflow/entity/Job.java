package com.ibexsys.workflow.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass

public abstract class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;


    @Column(name = "name", nullable = false)
    private String name;


    @UpdateTimestamp
    private LocalDateTime modifiedDate;

    @UpdateTimestamp
    private LocalDateTime createdDate;

//    @OneToMany
//    private List<Task> taskList = new ArrayList<Task>();

//    protected Job(){ }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Task> getTaskList() {
//        return taskList;
//    }
//
//    public void setTaskList(List<Task> taskList) {
//        this.taskList = taskList;
//    }
//
//    public void addTask(Task task){
//        this.taskList.add(task);
//    }


    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreateedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }


    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", createedDate=" + createdDate +
                '}';
    }
}
