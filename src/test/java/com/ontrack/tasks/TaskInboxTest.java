// TDD implementation for SIT333 Task 9.1P - CI setup in progress
package com.ontrack.tasks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskInboxTest {
    
    private TaskInbox inbox;
    
    @BeforeEach
    void setUp() {
        inbox = new TaskInbox();
    }
    
    @Test
    void testGetTasksForValidStudentIdReturnsTasks() {
        // Act - call the method
        Task[] tasks = inbox.getTasksForStudent("STUDENT001");
        
        // Assert - verify the result
        assertNotNull(tasks, "Should return an array, not null");
        assertEquals(2, tasks.length, "Student should have 2 submitted tasks");
        assertEquals("5.1P - Unit Test Standards", tasks[0].getName());
        assertEquals("Submitted", tasks[0].getStatus());
    }
    
    @Test
    void testInvalidStudentIdThrowsException() {
        // Act & Assert - verify exception is thrown for null ID
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> inbox.getTasksForStudent(null)
        );
        
        assertTrue(exception.getMessage().contains("Invalid student ID"));
    }
}