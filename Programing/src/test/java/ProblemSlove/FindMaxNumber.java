package ProblemSlove;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> expNum=Arrays.asList(12,2,4,12,12,3,4,5,6);
		findMaxNumberUsingStream(expNum);
	}
	
	public static void findMaxNumberUsingStream(List<Integer> expNum) {
		System.out.println(expNum);
		System.out.println("\n After Distrinct");
		expNum.stream().distinct().sorted((a,b)->b.compareTo(a)).limit(1).forEach(s->System.out.print(s+" "));
		System.out.println("Use Reverse Order");
		expNum.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
		
	}
	
	public static void findMaxNum(int [] n) {
		
		
	}

}
