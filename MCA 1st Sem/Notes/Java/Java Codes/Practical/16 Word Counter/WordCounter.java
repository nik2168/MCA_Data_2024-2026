import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println("Total words in String : " + s.trim().length());
    }
}


// output
// Hello there
// Total words in String : 11