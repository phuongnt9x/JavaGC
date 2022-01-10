package Loops_in_Java;

public class prime_num_less_than_100 {

	public static void main(String[] args) {
		for(int i=2;i<100;i++) {
			if(is_prime(i))
				System.out.printf("%4d",i);
		}

	}

	public static boolean is_prime(int n) {
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
