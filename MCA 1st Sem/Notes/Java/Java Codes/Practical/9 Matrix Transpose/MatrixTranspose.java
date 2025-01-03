import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);

       System.out.println("Enter row and coloumn size of matrix : ");
       int row = sc.nextInt();
       int col  = sc.nextInt();

       int matrix[][] = new int[row][col];  
       int matrixTranspose[][] = new int[col][row];
       
       System.out.println("Enter the metrix elements : ");
      
       for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            matrix[i][j] = sc.nextInt();
            matrixTranspose[j][i] = matrix[i][j];
        }
       }

       sc.close();

       System.out.println("The transpose of matrix is : ");

       for(int i = 0; i < col; i++){
        for(int j = 0; j < row; j++){
            System.out.print(matrixTranspose[i][j] + " ");
        }
        System.out.println();
       }

    }
}


// output

// Enter row and coloumn size of matrix : 
// 3 
// 3

// Enter the metrix elements : 
// 1 2 3
// 4 5 6
// 7 8 9

// The transpose of matrix is : 
// 1 4 7 
// 2 5 8 
// 3 6 9 