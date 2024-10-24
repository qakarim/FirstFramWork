package ProblemSlove;

public class PrintoneToHundred {

	public static void main(String[] args) {
		printNum(5,100);

	}
	
	public static void printNum(int startNum,int EndNum) {
		if(startNum<=EndNum) {
			System.out.print(startNum+" ");
			startNum++;
			printNum(startNum,EndNum);
		}
	}

}
