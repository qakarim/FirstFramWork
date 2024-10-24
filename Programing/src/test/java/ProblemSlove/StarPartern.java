package ProblemSlove;

public class StarPartern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tringlePrint(6);
		//ReverseTringlePrint(5);
		AlphaPartern(4);
	}
	
	public static void tringlePrint(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
public static void ReverseTringlePrint(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
public static void AlphaPartern(int n) {
	int alph=65;
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print((char)(alph+j)+" ");
		}
		System.out.println();
	}
	
}


}
