class StringClass {
    private String str;

    public StringClass(String str){
        this.str = str;
    }

    public void equals(StringClass other){
        if(this.str.equals(other.str)) System.out.println("Equals");
        else System.out.println("Not Equal");
    }

    public void changeCase(){
        System.out.println(str.toUpperCase());
    }

    public void trimString(){
        System.out.println(str.trim());
    }


}

public class StringOperations {

    public static void main(String[] args) {
        
      StringClass a = new StringClass("Tree");
     StringClass b = new StringClass("Branch");

      a.equals(b);
      a.changeCase();
      a.trimString();

   }
}

// output
// Not Equal
// TREE
// Tree