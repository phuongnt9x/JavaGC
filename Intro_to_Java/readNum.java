package Intro_to_Java;

import java.util.Scanner;

public class readNum {

	public static void main(String[] args) {
		int num;
		String out = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();
		if(num<10 && num>=0) {
			out=rd1(num);
			
		}
		else if(num>=10 && num<20) {
			out=rd2(num);

		}
		else if(num<100 && num>=20) {
			out=rd3(num);			
		}
		else if(num<1000 && num>=100) {
			int od=num/100;
			int os=num%100;
			out=rd1(od)+ " hundred";
			if(os<10 && os>0) {
				out+=" " +rd1(os);
				
			}
			else if(os>=10 && os<20) {
				out+=" " +rd2(os);

			}
			else if(os<100 && os>=20) {
				out+=" " +rd3(os);			
			}
			
		}
		System.out.println(out);

	}
	public static String rd2(int num) {
		String out="";
		num%=10;
		switch(num) {
		case 0:
			out="ten";break;
		case 1:
			out="eleven";break;
		case 2:
			out="twele";break;
		case 3:
			out="thirteen";break;
		case 4:
			out="fourteen";break;
		case 5:
			out="fifteen";break;
		case 6:
			out="sixteen";break;
		case 7:
			out="seventeen";break;
		case 8:
			out="eighteen";break;
		case 9:
			out="nineteen";break;
		}
		return out;
	}
	public static String rd3(int num) {
		String out="";
		int tens=num/10;
		String strTens;
		int ones=num%10;
		String strOnes;
		switch(tens) {
		case 2:
			out="twenty";break;
		case 3:
			out="thirty";break;
		case 4:
			out="forty";break;
		case 5:
			out="fifty";break;
		case 6:
			out="sixty";break;
		case 7:
			out="seventy";break;
		case 8:
			out="eighty";break;
		case 9:
			out="ninety";break;
		}
		switch(ones) {
		case 0:
			out+="";break;
		case 1:
			out+=" one";break;
		case 2:
			out+=" two";break;
		case 3:
			out+=" three";break;
		case 4:
			out+=" four";break;
		case 5:
			out+=" five";break;
		case 6:
			out+=" six";break;
		case 7:
			out+=" seven";break;
		case 8:
			out+=" eight";break;
		case 9:
			out+=" snine";break;
		
		}
		return out;
	}
	public static String rd1(int num) {
		String out="";
		switch(num) {
		case 0:
			out="zero";break;
		case 1:
			out="one";break;
		case 2:
			out="two";break;
		case 3:
			out="three";break;
		case 4:
			out="four";break;
		case 5:
			out="five";break;
		case 6:
			out="six";break;
		case 7:
			out="seven";break;
		case 8:
			out="eight";break;
		case 9:
			out="nine";break;
			
		}
		return out;
	}

}
