import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

      System.out.println("Enter any year you want to check if its a leap year or not ");

      int year = sc.nextInt();

       if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println(year + " is a leaps year");
       }
       else System.out.println(year + " is not a leap year");

      sc.close();
    }
}


// output

// Enter any year you want to check if its a leap year or not 
// 2023
// 2023 is not a leap year
