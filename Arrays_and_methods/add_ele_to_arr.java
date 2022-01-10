package Arrays_and_methods;

import java.util.Arrays;
import java.util.Scanner;

public class add_ele_to_arr {

	public static void main(String[] args) {
		int[] arr = { 4, 12, 7, -8, 1, 6, 9 };
		int x,ind;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to insert: ");
		x = sc.nextInt();
		System.out.println("Enter index to insert: ");
		ind = sc.nextInt();
		if(ind<=-1 || ind>=arr.length-1) {
			System.out.println("can't insert");
		}else {
			arr = Arrays.copyOf(arr, arr.length + 1);
			for (int i = arr.length-1; i >ind; i--) {
				arr[i]=arr[i-1];
			}
			arr[ind]=x;
			
		}
		
		for (int j = 0; j < arr.length; j++) {
		    System.out.print(arr[j] + "\t");
		}
		
	}

}