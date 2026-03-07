package basic_math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=371;
		int nn=n;
		int armstrong=0;
		while(n>0) {
			int s=n%10;
			armstrong+=Math.pow(s, 3);
			n/=10;
		}
		if(armstrong==nn) {
			System.out.println("TRUE");
		}else {
			System.out.println("False");
		}
	}

}
