package week1.home_practice;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chk_prime_num=887;
		if (chk_prime_num<2)
		{
			System.out.println("No... It is not a prime number");
		}
		
		
		if (chk_prime_num<=14)
		{
			if(chk_prime_num%2==0) {
				System.out.println("No... it is not a prime number");
			}
			else {
				System.out.println("Yes..It is Prime Number");
			}
						
		}
		
		if (chk_prime_num>14) {
			
			if(chk_prime_num%2==0 || chk_prime_num%3==0 || chk_prime_num%5==0) {
				System.out.println("No... it is not a prime number");
			}
			else {
				System.out.println("Yes..It is Prime Number");
			}
			
			
		}
		
		
	}

}
