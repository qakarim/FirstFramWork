package ProblemSlove;

import java.util.HashMap;

import com.github.javafaker.Faker;

public class ConvertHashMapToarrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	Faker fc=new Faker();
	
	for(int i=1;i<=6;i++) {
		hm.put(fc.name().firstName().toString(), i);
	}
	
	System.out.println(hm.get(1));
	}
	
	
	
}
