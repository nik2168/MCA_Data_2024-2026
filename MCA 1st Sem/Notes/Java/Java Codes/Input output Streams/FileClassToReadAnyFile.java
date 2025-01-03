import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// here we are creating files and reading them using the File class & FileWrtier class in java

// buffer reading file read and write programms
@SuppressWarnings("unused")
public class FileClassToReadAnyFile{


    public static void main(String[] args) {
       File a = new File("./data.txt");
        String fileContent = "";

        
       try {
        Scanner sc = new Scanner(a);
   while(sc.hasNextLine()){
     fileContent = fileContent.concat(sc.nextLine() + "\n");
   }
        sc.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("File not found mr.");
    }


    
       try {
        FileWriter w = new FileWriter("./data2.txt");
        w.write(fileContent);
        w.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    }
}