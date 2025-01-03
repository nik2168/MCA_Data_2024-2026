 import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokenizerDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringTokenizer t = new StringTokenizer(sc.nextLine());

        while(t.hasMoreTokens()){
      String tok = t.nextToken();

            try {
                int i = Integer.parseInt(tok);
                System.out.println("int : "+ i);
            } catch (NumberFormatException e1) {
                try {
                  double j = Double.parseDouble(tok);
                System.out.println("double : "+ j);
                } catch (NumberFormatException e2) {
                    System.out.println("string : "+ tok);
                }

            }
        }
        
        sc.close();
    }
}

// output
// 33 536.34563 Nik
// int : 33
// double : 536.34563
// string : Nik
