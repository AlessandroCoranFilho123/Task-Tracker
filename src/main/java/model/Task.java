package main.java.model;

import main.java.service.Json;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task () {

    public TaskStatus getId() {
        return id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public enum status {
        DONE,
        IN_PROGRESS,
        TODO
    }

    public class add () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Task name: ");
        String name = sc.nextLine();

        System.out.print("1.DONE, 2.IN-PROGRESS, 3.TODO: \n");
        System.out.print("Task status: \n");
        int status = sc.nextInt();

        if (status == 1) {
            Json.WriteToFile().toString();
            name.DONE;
        } else if (status == 2) {
            Json.WriteToFile();
            add.IN_PROGRESS;
        } else if (status == 3) {
            Json.WriteToFile();
            add.TODO;
        }

        try {
            File data = new File("data.json");
            if (data.createNewFile()) {
                System.out.println("File created: " + data.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

