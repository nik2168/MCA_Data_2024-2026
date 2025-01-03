import first.Rectangle;

public class MainStuff {
     String here = "Main function string";

     void getInfo(){
          System.out.println(here);
     }
public static void main(String[] args) {
     Rectangle a = new Rectangle();
     MainStuff b = new MainStuff();

     a.printInfo();
     b.getInfo();
}    
}

// output
// Some Info of Rectangle
// Main function string