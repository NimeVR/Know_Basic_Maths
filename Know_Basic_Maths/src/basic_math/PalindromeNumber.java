package basic_math;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4554;
		
		int pal=0,pp=n;
		while(n>0) {
			int rem=n%10;
			pal=pal*10+rem;
			n/=10;
		}
		System.out.println((pal==pp)?"Palindrome":"Not Palindrome");
	}

}
