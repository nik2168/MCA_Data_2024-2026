

class NegativeRadiusException extends Exception{
    
    public String toString(){
        return "Radius can't be negative !";
    }

    public String getMessage() {
            return "Radius can't be negative !";
    }

}

 class ExceptionHandling {

    public static double area(int r) throws NegativeRadiusException{

        if(r < 0) throw new NegativeRadiusException();

        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException{ 
                return a/b;
    }


 public static void main(String[] args) {

    try {
        double res2 = area(-6);
        System.out.println(res2);
    } catch (Exception e) {
        System.out.println(e);
    }
    
 }    
}

// output
// Radius can't be negative !
