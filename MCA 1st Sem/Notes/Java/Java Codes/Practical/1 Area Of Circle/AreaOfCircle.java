import java.util.Scanner;

public class AreaOfCircle{

public static void main(String arg []){
    
    int radius;

    System.out.println("Enter the radius : ");

    Scanner a = new Scanner(System.in);
    radius = a.nextInt();

    a.close();

    double area = 2 * 3.14 * radius;

    System.out.println("Area of circle is "+ area);
}

}

// output
// Enter the radius : 
// 3
// Area of circle is 18.84