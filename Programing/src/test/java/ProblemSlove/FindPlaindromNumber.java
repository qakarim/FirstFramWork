package ProblemSlove;

public class FindPlaindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findPalindrom(343);
		findPalinWithReverse(424);

	}
	static void findPalindrom(int n) {
		StringBuffer st=new StringBuffer();
		String sr=st.append(n).reverse().toString();
		int temp=Integer.parseInt(sr);
		if(temp==n) {
			System.out.println("This Number Is Palindrom Number "+ n);
		}
		else {
			System.out.println(n+ " This Number Is Not Palindrom Number ");
		}
		
	}
	
	static void findPalinWithReverse(int n) {
		int res=0;
		int r=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			res=(res*10)+r;
			n=n/10;
		}
		if(temp==res) {
			System.out.println("Expeted Number Is Palindrom Number "+ temp);
		}
		else {
			System.out.println("Expeted Number Is Not Palindrom Number "+ res);
		}
	}

}
