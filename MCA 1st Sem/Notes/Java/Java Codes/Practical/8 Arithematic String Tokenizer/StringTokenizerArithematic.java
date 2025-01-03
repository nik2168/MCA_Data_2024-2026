import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerArithematic {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression : Example : a + b");
        
       String input = sc.nextLine();

   StringTokenizer tokenizer = new StringTokenizer(input);
sc.close();

   try {
      double num1 = Double.parseDouble(tokenizer.nextToken().trim());
      String operator = tokenizer.nextToken().trim();
      double num2 = Double.parseDouble(tokenizer.nextToken().trim());

      double result = 0;

      switch(operator){

        case "+":
        result = num1 + num2;
        break;
        
        case "*":
        result = num1 * num2;
        break;
        
        case "/":
        result = num1 / num2;
        break;
        
        case "-":
        result = num1 - num2;
        break;

        default: 
        System.out.println("Please enter in correct format");
        return;
        
      }

      System.out.println("The result is " + result);
   } catch (Exception e) {
   }
         
     }
}


// output
// Enter the expression : Example : a + b
// 3 + 3
// The result is 6.0