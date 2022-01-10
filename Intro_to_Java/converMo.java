package Intro_to_Java;

import java.util.Scanner;

public class converMo {

	public static void main(String[] args) {
		double usd;
		double ty_gia=23000;
		double vnd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so tien USD:");
		usd=sc.nextDouble();
		vnd=usd*ty_gia;
		System.out.println("VND: "+vnd);
		int a = 5; int b = 7; int c = a++ + ++b;
		System.out.println(c);
	}

}
