package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> done = new ArrayList<>();
        List<String> working = new ArrayList<>();
        List<String> todo = new ArrayList<>();

        menu();
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '1':
                System.out.print("Task name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("1.Done, 2.Working, 3.TODO: \n");
                System.out.print("Task status: ");
                char status = sc.next().charAt(0);
                if (status == '1') {
                    done.add(name);
                    System.out.printf("[%s] added to Done with success!\n", name);
                } else if (status == '2') {
                    working.add(name);
                    System.out.printf("[%s] added to Working with success!\n", name);
                } else if (status == '3') {
                    todo.add(name);
                    System.out.printf("[%s] added to TODO with success!\n", name);
                }
                break;
            case '4':
                System.out.println("All tasks: ");
                for (String s : done) {
                    System.out.printf("%s\n", s);
                }
                for (String s : working) {
                    System.out.printf("%s\n", s);
                }
                for (String s : todo) {
                    System.out.printf("%s\n", s);
                }
                break;
            case 'a':
                System.out.println("Shutting down...");
            default:
                System.out.println("Invalid choice");
                menu();
        }
    }

    public static void menu() {
        System.out.println("==========================");
        System.out.println("-----  Task Tracker  -----");
        System.out.println("--------------------------");
        System.out.println("- 1.ADD - 2.UPDATE - 3.DELETE -");
        System.out.println("- 4.List all taks -");
        System.out.println("- 5.List all tasks that are done -");
        System.out.println("- 6.List all tasks that are not done -");
        System.out.println("- 7.List all tasks that are in progress -");
        System.out.println("- 8.Exit -");
        System.out.println("--------------------------");
        System.out.print("Please enter your choice: ");
    }
}