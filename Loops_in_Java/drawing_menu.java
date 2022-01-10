package Loops_in_Java;

import java.util.Scanner;

public class drawing_menu {

	public static void main(String[] args) {
		int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the retangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                	draw_retangle(3,2);
                    break;
                case 2:
                	draw_triangle_top(5);
                	draw_triangle_top_r(5);
                	draw_triangle_bt(5);
                    draw_triangle_bt_r(5);
                    break;
                case 3:
                	draw_triangle_bt(5);
                	draw_isosceles_triangle(5);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
	}
	public static void draw_retangle(int h,int w) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.printf("%4s","*");
			}
			System.out.println();
		}
	}
	public static void draw_triangle_bt(int h) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("%4s","*");
			}
			System.out.println();
		}
	}
	public static void draw_triangle_top(int h) {
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%4s","*");
			}
			System.out.println();
		}
	}
	public static void draw_isosceles_triangle(int h) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<h;j++) {
				if((j+i)<h) 
					System.out.printf("%4s","*");
				else
					System.out.printf("%4s","");
			}
			System.out.println();
		}
	}
	public static void draw_triangle_top_r(int h) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<h;j++) {
				if(j>=i) 
					System.out.printf("%4s","*");
				else
					System.out.printf("%4s","");
			}
			System.out.println();
		}
	}
	public static void draw_triangle_bt_r(int h) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<h;j++) {
				if((j+i)>=h-1) 
					System.out.printf("%4s","*");
				else
					System.out.printf("%4s","");
			}
			System.out.println();
		}
	}

}
