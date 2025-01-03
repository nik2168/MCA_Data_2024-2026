import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffereReaderEmployeesDetails {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the employes details");

        try {
            System.out.print("name : ");
            String name = br.readLine();

            System.out.print("designation : ");
            String designation = br.readLine();

            System.out.print("salary : ");
            String salary = br.readLine();

            System.out.println("Employee " + name + " details are :");
            System.out.println("Name : " + name);
            System.out.println("Designation : " + designation);
            System.out.println("Salary : " + salary);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


// output

// Please enter the employes details
// name : Nik
// designation : Software Engineer
// salary : 130000

// Employee Nik details are :
// Name : Nik
// Designation : Software Engineer
// Salary : 130000