package Loops_in_Java;

public class first_20_prime {

	public static void main(String[] args) {
		int numbers=20,count=0,N=2;
		while(count<numbers){
			if(is_prime(N)) {
				System.out.println(N);
				count++;
			}
			N++;			
		}
	}
	public static boolean is_prime(int n) {
		if(n<2) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}
