package basic_math;

public class CountDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,s=0;
		int count=0;
		while(n>0) {
			s=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
