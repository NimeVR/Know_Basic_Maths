package basic_math;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=29,found=0;
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i == 0) {
				found=1;
				break;
			}
		}
		
		System.out.print((found==1)?"FALSE":"TRUE");
		
	}

}
