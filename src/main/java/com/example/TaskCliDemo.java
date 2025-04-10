package com.example;

import com.ga2a4j.model.Task;
import java.util.Scanner;

/**
 * A command-line interface to showcase the functionality of the Task model
 * and other related models from the com.ga2a4j project.
 */
public class TaskCliDemo {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the GA2A4J Task Model Demo");
        System.out.println("======================================\n");
        
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    // Additional functionality can be added here
                    System.out.println("This feature is not implemented yet.");
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using the Task Model Demo!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void printMenu() {
        System.out.println("\nTask Model Demo Menu:");
        System.out.println("1. Create a new Task");
        System.out.println("2. List all Tasks");
        System.out.println("0. Exit");
    }
    
    private static void createTask() {
        System.out.println("\nCreating a new Task:\n");
        
        String taskId = getStringInput("Enter Task ID: ");
        String taskName = getStringInput("Enter Task Name: ");
        String taskDescription = getStringInput("Enter Task Description: ");
        
        // Create a Task object using the builder pattern
        Task task = Task.builder()
                .id(taskId)
                .name(taskName)
                .description(taskDescription)
                .build();
        
        System.out.println("\nTask created successfully!");
        System.out.println("Task details: " + task);
    }
    
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}