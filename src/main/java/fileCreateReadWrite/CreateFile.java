package fileCreateReadWrite;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File directory = new File("E:\\Java\\persone");
        directory.mkdir();
        
        File file = new File("E:\\Java\\persone\\student.txt");
        
        try{
        file.createNewFile();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
   
}
