package Arrays_and_methods;

import java.util.Scanner;

public class merge_array {

	public static void main(String[] args) {
		int[]  arr1,arr2,arr3;
		int N1,N2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of array elements 1:");
		N1=scanner.nextInt();
		arr1=new int[N1];
		for(int i=0;i<N1;i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
		    arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the number of array elements 2:");
		N2=scanner.nextInt();
		arr2=new int[N2];
		for(int i=0;i<N2;i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
		    arr2[i] = scanner.nextInt();
		}
		arr3=new int[N1+N2];
		for (int j = 0; j < arr1.length; j++) {
		   arr3[j]=arr1[j];
		}
		for (int j = arr1.length,i=0; j < arr3.length; j++,i++) {
			   arr3[j]=arr2[i];
			}
		for (int j = 0; j < arr3.length; j++) {
		    System.out.print(arr3[j] + "\t");
		}
		

	}

}
