package main.java.service;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TaskService {
    public static void add () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the task: ");
        String name = sc.nextLine();
        System.out.print("Task description: ");
        String description = sc.nextLine();

        try (FileWriter myWriter = new FileWriter("data.json", true)) {
            myWriter.write(name.trim() + (";") + description.trim());
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}