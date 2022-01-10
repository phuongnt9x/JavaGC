package Arrays_and_methods;

import java.util.Scanner;

public class del_ele_in_arr {

	public static void main(String[] args) {
		int[] arr = { 4, 12, 7, -8, 1, 6, 9 };
		int del;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to del: ");
		del = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==del) {
				delValue(arr,i);
			}
		}
		for (int j = 0; j < arr.length; j++) {
		    System.out.print(arr[j] + "\t");
		}
		
	}

	public static void delValue(int[] a,int index) {
		for (int i = index; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
	}
}