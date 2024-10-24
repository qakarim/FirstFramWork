package ProblemSlove;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(findPrime(6));
		printSerisPrimeNumber(99);
	}
	
	static  boolean findPrime(int n) {
		boolean findPrime=true;
		if(n<=1) {
			findPrime=false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					findPrime=false;
				}
			}
			
		}
		return findPrime;
	}
	
	static void printSerisPrimeNumber(int n) {
		
		for(int i=2;i<=n;i++) {
			if(findPrime(i)==true) {
				System.out.print(i+ " ");
			}
		}
	}

}
