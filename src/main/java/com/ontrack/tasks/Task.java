package com.ontrack.tasks;

public class Task {
    private String name;
    private String status;
    private String submissionDate;
    
    // Constructor
    public Task(String name, String status, String submissionDate) {
        this.name = name;
        this.status = status;
        this.submissionDate = submissionDate;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getSubmissionDate() {
        return submissionDate;
    }
}