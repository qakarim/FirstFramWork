package ProblemSlove;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6,7,9};
		findmiss(n);

	}
	
	public static void findmiss(int[] n) {
		int sum=0,sm=0;
		int ld=n[n.length-1];
		System.out.println(ld);
		sm=ld*(ld+1)/2;
		System.out.println(sm);
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
		}
		int mis=sm-sum;
		System.out.println("missing number is "+mis);
		
	}

}
