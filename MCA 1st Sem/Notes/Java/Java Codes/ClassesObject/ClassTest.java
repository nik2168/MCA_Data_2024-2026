
class Animal{
    String name;
    
    Animal (String name){
        this.name = name;
    }

    void printInfo(){
        System.out.println(name);
    }
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    void printInfo(){
        System.out.println("Bird name is : " + name);
    }
    
}

public class ClassTest {
    public static void main(String[] args) {
        Animal a = new Animal("Lion");
        a.printInfo();
        Bird b = new Bird("Pheonix");
        b.printInfo();
    }
}
