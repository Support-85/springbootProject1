package com.yuvrajprojects.projects;
import java.util.Scanner;

public class PortfolioWebsite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for portfolio details
        System.out.println("Welcome to Your Portfolio Website");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Please enter your profession:");
        String profession = scanner.nextLine();
        
        System.out.println("Please enter a brief bio:");
        String bio = scanner.nextLine();
        
        // Display portfolio details
        System.out.println("\n--- Portfolio ---");
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Bio: " + bio);
        
        // Prompt user to view projects
        System.out.println("\nDo you want to view your projects? (Y/N)");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("Y")) {
            viewProjects();
        } else {
            System.out.println("Thank you for visiting your portfolio website!");
        }
        
        scanner.close();
    }
    
    public static void viewProjects() {
        // Display projects
        System.out.println("\n--- Projects ---");
        System.out.println("1. Project A");
        System.out.println("2. Project B");
        System.out.println("3. Project C");
        // Add more projects or retrieve them from a database
        
        // Prompt user to select a project or exit
        System.out.println("\nPlease enter the project number to view details (0 to exit):");
        Scanner scanner = new Scanner(System.in);
        int projectChoice = scanner.nextInt();
        
        switch (projectChoice) {
            case 0:
                System.out.println("Thank you for visiting your portfolio website!");
                break;
            case 1:
                viewProjectDetails("Project A");
                break;
            case 2:
                viewProjectDetails("Project B");
                break;
            case 3:
                viewProjectDetails("Project C");
                break;
            default:
                System.out.println("Invalid project number. Exiting...");
                break;
        }
        
        scanner.close();
    }
    
    public static void viewProjectDetails(String projectName) {
        // Retrieve and display project details
        System.out.println("\n--- Project Details ---");
        System.out.println("Project: " + projectName);
        // Fetch and display additional project details from a database or external source
        
        // Prompt user to go back or exit
        System.out.println("\nPress 0 to go back to projects or any other key to exit:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        if (choice == 0) {
            viewProjects();
        } else {
            System.out.println("Thank you for visiting your portfolio website!");
        }
        
        scanner.close();
    }
}
