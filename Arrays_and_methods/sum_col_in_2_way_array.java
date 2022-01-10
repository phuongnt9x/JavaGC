package Arrays_and_methods;

import java.util.Scanner;

public class sum_col_in_2_way_array {

	public static void main(String[] args) {
		int row, col,max,sum_col=0,ind_col=0;
	     
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
	    do {
	    	System.out.println("Enter column to calculator sum:");
	    	ind_col=scanner.nextInt();
	    }while(ind_col>=col);
	    for(int i=0;i<row;i++) {
	    	sum_col+=A[i][ind_col];
	    }
	    System.out.println("Sum col: "+sum_col);

	}

}
