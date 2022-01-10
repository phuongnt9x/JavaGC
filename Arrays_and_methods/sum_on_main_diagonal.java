package Arrays_and_methods;

import java.util.Scanner;

public class sum_on_main_diagonal {

	public static void main(String[] args) {
		int row, max, sum = 0, ind_col = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row: ");
		row = scanner.nextInt();
//		System.out.println("Enter col: ");
//		row = scanner.nextInt();
		int[][] A = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i==j) {
					sum+=A[i][j];
				}
			}
		}
		System.out.println("Sum : " + sum);

	}

}
