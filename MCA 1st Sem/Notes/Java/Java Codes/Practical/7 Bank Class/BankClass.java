
class Bank{

    int amount;
    int accountNumber;
    String name;

    Bank(int amount, int accountNumber, String name){
      this.amount = amount;
      this.accountNumber = accountNumber;
      this.name = name;
    }

    void diposit(int depositeAmount){
        amount += depositeAmount;
        System.out.println("Deposit of " + depositeAmount + " successfull, total balance is : "+ amount);
    }

    void withdraw(int withdrawAmount){
        amount -= withdrawAmount;
        System.out.println(withdrawAmount + " withdrawn successfull, new balance is "+ amount);
    }

    void display(){
        System.out.println("Account details of " + name+ " :" );
        System.out.println("Name: "+ name);
        System.out.println("Accound Number: "+ accountNumber);
        System.out.println("Balance: "+ amount);
    }

}


public class BankClass {
    public static void main(String[] args) {
        
        Bank person = new Bank(0, 252134, "Nik");
       
        person.diposit(130000);
        person.withdraw(300);
        person.display();
        
    }
}


// output

// Deposit of 130000 successfull, total balance is : 130000

// 300 withdrawn successfull, new balance is 129700

// Account details of Nik :
// Name: Nik
// Accound Number: 252134
// Balance: 129700