package main.java;

import main.java.model.Task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu();
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '1':
                add();
                break;
            case '8':
                System.out.print("Shutting down...");
                break;
            default:
                System.out.println("Invalid choice");
                menu();
                choice = sc.next().charAt(0);
        }
    }

    public static void menu() {
        System.out.println("==========================");
        System.out.println("-----  Task Tracker  -----");
        System.out.println("--------------------------");
        System.out.println("- 1.ADD - 2.UPDATE - 3.DELETE -");
        System.out.println("- 4.List all tasks -");
        System.out.println("- 5.List all tasks that are done -");
        System.out.println("- 6.List all tasks that are not done -");
        System.out.println("- 7.List all tasks that are in progress -");
        System.out.println("- 8.Exit -");
        System.out.println("--------------------------");
        System.out.print("Please enter your choice: ");
    }
}