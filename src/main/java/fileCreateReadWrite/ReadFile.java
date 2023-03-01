package fileCreateReadWrite;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        
        try{        
        File file =new File("E:\\Java\\persone\\student.txt");
            try (Scanner scanner = new Scanner(file)) {
                while(scanner.hasNext()){
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    System.out.print("Student Name : " + name +" And ID : " +id);
                }
            }
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
