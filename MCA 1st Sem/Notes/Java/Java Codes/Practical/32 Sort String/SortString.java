
public class SortString {

 static void sort(char arr[], int i, int m, int n){
          
     int n1 = (m - i) + 1;
     int n2 = (n - m);

     char l1[] = new char[n1];
     char l2[] = new char[n2];
     
     for(int j = 0; j < n1; j++){
        l1[j] = arr[j+i];
     }

     for(int j = 0; j < n2; j++){
        l2[j] = arr[j+m+1];
     }

     int x = 0;
     int y = 0;
     int k = i;

     while(x < n1 && y < n2){
         if(l1[x] - 'A' <= l2[y]-'A') arr[k++] = l1[x++];
         else arr[k++] = l2[y++];
     }

     while(x < n1){
       arr[k++] = l1[x++];
     }

     while(y < n2){ 
        arr[k++] = l2[y++];
     }

    }

       static void mergeSort(char arr [], int i, int n){

        if(i < n){

            int m = i + (n - i)/2;

            mergeSort(arr, i, m);
            mergeSort(arr, m + 1, n);

            sort(arr, i, m, n );
        }

    }

    public static void main(String[] args) {
        String s = "STRING";
        char arr[] = new char[s.length()];
           arr = s.toCharArray();

           mergeSort(arr, 0 ,arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}


// output
// GINRST