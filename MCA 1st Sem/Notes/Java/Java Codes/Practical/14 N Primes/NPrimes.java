import java.util.Scanner;

public class NPrimes {

    static Boolean printPrime(int n){
            if(n == 0 || n == 1) return false;
            for(int j = 2; j <= Math.sqrt(n); j++){
                if(n % j == 0) return false;
            }
            return true;
    }

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       sc.close();

        int c = 0;
        int i = 1;
       while(c < n){
        if(printPrime(i)){
        System.out.print(i + " ");
        c++;
       }
       i++;
       }
    }
}


// output
// 7
// 2 3 5 7 11 13 17                                                                 