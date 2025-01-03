import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        File f =  new File(name);

        if(f.exists()) {
        System.out.println("File exist,");

        if(f.canRead()) System.out.println("readable, ");
        else System.out.println("not readable, ");

        if(f.canWrite()) System.out.println("writable, ");
        else System.out.println("not writable, ");

        if(f.isDirectory()) System.out.println("directory, ");
        else if(f.isFile()) System.out.println("file, ");
        else System.out.println("other format file, ");

        if(f.isFile()) System.out.println("length " + f.length());
        else System.out.println("length : N/A");
        }  else System.out.println("File not exist, ");

        sc.close();

    }
}


// output
// file.txt
// File exist,
// readable, 
// writable, 
// file, 
// length 51
