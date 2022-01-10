package Arrays_and_methods;

import java.util.Scanner;

public class find_max_two_dimensional_array {

	public static void main(String[] args) {
		int row, col,max,ind_row=0,ind_col=0;
	     
	    Scanner scanner = new Scanner(System.in);	         
	    System.out.println("Enter row: ");
	    row = scanner.nextInt();
	    System.out.println("Enter col: ");
	    col = scanner.nextInt();	         
	    int[][] A = new int[row][col];
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print("Element [" + i + ", " + j + "]: ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");   
	    }
	    max=A[0][0];
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            if(A[i][j]>max) {
	            	max=A[i][j];
	            	ind_row=i;
	            	ind_col=j;
	            }
	        }
	        System.out.println("\n");   
	    }
	    System.out.println("Max la "+max+" vi tri :"+ind_row+","+ind_col);

	}

}
