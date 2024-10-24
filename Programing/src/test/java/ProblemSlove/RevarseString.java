package ProblemSlove;

public class RevarseString {

	public static void main(String[] args) {
		String st="TODO Auto-generated method stub";
		revarsString(st);
	}
	
	public static void revarsString(String expStr) {
		for(int i=expStr.length()-1;i>=0;i--) {
			System.out.print(expStr.charAt(i));
		}
	}

}
