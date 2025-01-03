
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;





public class ObjectOutStream {
    public static void main(String[] args) throws FileNotFoundException {
        

        // try {
        //     ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("temp.txt"));
        //     String name = "Nik";
        //     int age = 22;
        //     writer.writeObject(name);
        //     writer.writeInt(age);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // }

        // try {
        //     ObjectInputStream reader = new ObjectInputStream(new FileInputStream("temp.txt"));
        //     String name = (String) reader.readObject();
        //     int age = (int) reader.readInt();
        //     System.out.println("name: " + name + " age: " + age);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // }

        File a = new File("temp.txt");
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


    System.out.println(fileContent);
System.out.println(Thread.currentThread().getName());

try {
    PrintWriter wr = new PrintWriter("temp.txt");
    wr.println("Hello There this is shit!");
                wr.printf("Formatted output: %d, %.2f\n", 42, 3.14159);
    wr.close();
    
} catch (FileNotFoundException e) {
    System.out.println("File not found !");
}

    }
}
