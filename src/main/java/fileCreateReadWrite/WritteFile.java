package fileCreateReadWrite;

import java.util.Formatter;
import java.util.Scanner;

public class WritteFile {
    public static void main(String[] args) {
        int id;String name;
        try {
            try (Formatter formatter = new Formatter("E:\\Java\\persone\\student.txt")) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number of students : ");
                int num = input.nextInt();
                for (int i = 1; i <= num; i++) {
                    System.out.print("Enter Student ID: ");
                    id = input.nextInt();
                    System.out.print("Enter Student Name: ");
                    name = input.next();
                    formatter.format("%d  %s\r\n", id, name);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
