package basic_math;

public class PrintAllDivisorOfAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=36;
		int[] a= new int[n/2];
		int index=1;
		a[0]=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				a[index++]=i;
			}
		}
		a[index++]=n;
		
		for(int i=0;i<index;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
