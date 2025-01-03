
abstract class Shape{
   abstract void printInfo();
}

class Rectangle extends Shape{

    void printInfo(){
        System.out.println("Its a rectangle");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
           Rectangle r = new Rectangle();
           r.printInfo();
    }
}


// output
// Its a rectangle