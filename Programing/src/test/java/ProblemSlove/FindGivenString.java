package ProblemSlove;

import java.util.Arrays;
import java.util.List;

public class FindGivenString {

	public static void main(String[] args) {
		String st=" TODO Auto-generated method stub";
		String str="Auto";
		findString(st,str);
	}
	
	public static void findString(String searchStr,String expStr) {
		
		List<String> li=Arrays.asList(searchStr.split(" "));
		if (li.contains(expStr)) {
			System.out.println("Expected Text Exist"+ expStr);
		}
	}

}
