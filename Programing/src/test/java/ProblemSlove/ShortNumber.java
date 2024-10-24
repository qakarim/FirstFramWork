package ProblemSlove;

import java.util.Arrays;
import java.util.List;

public class ShortNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> expList=Arrays.asList(2,12,3,4,5,12);
		shortNumberByStream(expList);

	}

	
	public static void shortNumberByStream(List<Integer> expList) {
		//Sorted By Desending Order
		expList.stream().sorted((a,b)->b.compareTo(a)).forEach(s->System.out.print(s+" "));
		System.out.println("\nShorted By assending Order");
		expList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println("");
		
	}
}
