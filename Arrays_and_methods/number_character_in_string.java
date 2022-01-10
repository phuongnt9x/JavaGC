package Arrays_and_methods;

import java.util.Scanner;

public class number_character_in_string {

	public static void main(String[] args) {
		String s="sabcassand";
	    char kyTu = 'a';
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == kyTu) {
	            count++;
	        }
	    }
	         
	    System.out.println("number of occurrences of a character: " + kyTu +
	        " in string: " + s + " = " + count);
	}

}
