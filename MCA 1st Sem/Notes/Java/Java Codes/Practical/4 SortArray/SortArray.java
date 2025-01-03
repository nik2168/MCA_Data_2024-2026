


public class SortArray {


    static void sort(int arr[], int i, int m, int n){
          
     int n1 = (m - i) + 1;
     int n2 = (n - m);

     int l1[] = new int[n1];
     int l2[] = new int[n2];
     
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
         if(l1[x] <= l2[y]) arr[k++] = l1[x++];
         else arr[k++] = l2[y++];
     }

     while(x < n1){
       arr[k++] = l1[x++];
     }

     while(y < n2){ 
        arr[k++] = l2[y++];
     }

    }

       static void mergeSort(int arr [], int i, int n){

        if(i < n){

            int m = i + (n - i)/2;

            mergeSort(arr, i, m);
            mergeSort(arr, m + 1, n);

            sort(arr, i, m, n );
        }

    }

    public static void main(String[] args) {

        int arr [] = {3,1,5,2,9};

         mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("The sorted array in ascending order will be : ");


        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

// output
// The sorted array in ascending order will be : 
// 1
// 2
// 3
// 5
// 9