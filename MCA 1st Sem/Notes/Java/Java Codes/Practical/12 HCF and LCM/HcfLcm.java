import java.util.Scanner;

public class HcfLcm {

        // Function to calculate HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b, int hcf) {
        return Math.abs(a * b) / hcf;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        sc.close();

     int hcf = findHCF(num1, num2);
     int lcm = findLCM(num1, num2, hcf);


     System.out.println("LCM : " + lcm);
     System.out.println("HCF : " + hcf);

    }
}


// output

// Enter first number: 12
// Enter second number: 18
// LCM : 36
// HCF : 6