import java.util.Scanner;

class Salary{
// HRA: 20% of Basic Salary
// DA: 15% of Basic Salary

    int basicSalary ;
    int HRA;
    int DA;
    int bonus;
    int medicalAllowance;

    Salary(int basicSalary, int bonus, int medicalAllowance){
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
        this.DA = basicSalary * (20/100);
        this.HRA = basicSalary * (15/100);
    }

    void grossSalary(){
       System.out.println("Gross Salary : " + (basicSalary+HRA+DA+bonus+medicalAllowance));
    }

}


public class GrossSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic Salary, bonus and medicalAllowance");
        int basicSalary = sc.nextInt();
        int bonus = sc.nextInt();
        int medicalAllowance = sc.nextInt();
        sc.close();
        Salary temp = new Salary(basicSalary, bonus, medicalAllowance);

        temp.grossSalary();
    }
}


// output

// Enter the basic Salary, bonus and medicalAllowance
// 130000 20000 30000
// Gross Salary : 180000
