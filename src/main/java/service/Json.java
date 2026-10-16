package main.java.service;
import java.io.*;
import java.util.Scanner;

public class Json {
    public static class CreateFile {
        public static void main(String[] args) {
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

    public static class WriteToFile {
        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("data.json");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
        }
    }


    public static class ReadFile {
        public static void main(String[] args) {
            File data = new File("data.json");
            try (Scanner myReader = new Scanner(data)) {
                while (myReader.hasNextLine()) {
                    String info = myReader.nextLine();
                    System.out.println(info);
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
            }
        }
    }

    public static class DeleteFile {
        public static void main(String[] args) {
            File data = new File("data.json");
            if (data.delete()) {
                System.out.println("Deleted the file: " + data.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}