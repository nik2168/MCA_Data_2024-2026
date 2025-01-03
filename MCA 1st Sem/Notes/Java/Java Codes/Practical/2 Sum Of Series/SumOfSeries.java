import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

            int n;

    System.out.println("Enter the series count : ");

    Scanner a = new Scanner(System.in);
    n = a.nextInt();

    a.close();

    int sum = 0;

    for(int i = 1; i <= n; i++){
        sum += i;
    }

    System.out.println("The sum of series 1 to " + n + " is : "+ sum);
    }
}


// output
// Enter the series count : 
// 3
// The sum of series 1 to 3 is : 6