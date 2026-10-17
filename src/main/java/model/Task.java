package main.java.model;
import main.java.service.TaskService;

import java.util.Scanner;
import java.util.UUID;

public class Task {
    public record Save (UUID id, String name, String description, int status) {
        public Save {
            if (id == null) id = UUID.randomUUID();
            if (description == null) description = "";
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("-----  Task Tracker  -----");
        System.out.println("--------------------------");
        System.out.println("- 1.ADD - 2.UPDATE - 3.DELETE -");
        System.out.println("- 4.List all tasks -");
        System.out.println("- 5.List all tasks that are done -");
        System.out.println("- 6.List all tasks that are not done -");
        System.out.println("- 7.List all tasks that are in progress -");
        System.out.println("- 8.Exit -");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            TaskService.add();
        }
    }
}

