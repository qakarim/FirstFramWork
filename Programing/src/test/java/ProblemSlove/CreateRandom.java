package ProblemSlove;

import java.util.Random;

public class CreateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createRandomNumber(5,6);
	}
	
	public static void createRandomNumber(int expStart,int expDecimal) {
		
		Random rn=new Random();
		float num=rn.nextFloat(expStart, expDecimal);
		System.out.println(num);
		
	}

}
