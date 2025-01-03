
public class WordCount {
    public static void main(String[] args) {

        String s = "Diabloic";
        int arr[] = new int[200];

        for(int i = 0; i < s.length(); i++){
           arr[s.charAt(i) - 'A']++;
        }
       
        for(int i = 0; i < arr.length; i++){
        if(arr[i]!= 0) System.out.println((char)(i+'A')+ " -> "+ arr[i]);
        }

    }
}


// output 
// D -> 1
// a -> 1
// b -> 1
// c -> 1
// i -> 2
// l -> 1
// o -> 1