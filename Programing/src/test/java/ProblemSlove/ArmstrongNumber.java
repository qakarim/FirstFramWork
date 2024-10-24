package ProblemSlove;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Each digit multiple with same digit then sum that number it will be same number 
		findArmastrongNum(370);
		
	}
	
	static void findArmastrongNum(int n) {
		
		int r=0,res=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			res=res+r*r*r;
			n=n/10;
		}
		if(temp==res) {
			System.out.println("Expected Number Is armastrong Number "+ temp);
		}
		else {
			System.out.println("Your Number Is Not Armstrong Number " + temp);
		}
	}

}
