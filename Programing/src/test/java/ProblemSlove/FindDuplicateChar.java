package ProblemSlove;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String st=" TODO TODO Auto-generated method stub";
		fnDuplicateChar(st);
	}
	
	public static void fnDuplicateChar(String expStr) {
		if(expStr.isBlank() || expStr.isEmpty() || expStr.trim().length()<1) {
			System.out.println("There Is No String Avilable");
		}
		else {
			char[] ch=expStr.toCharArray();
			HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
			for(Character c:ch) {
				if(hm.containsKey(c)) {
					hm.put(c,hm.get(c)+1);
				}
				else {
					hm.put(c,1);
				}
			}
			System.out.println(hm);
			Set<Map.Entry<Character,Integer>> entrySet=hm.entrySet();
			for(Entry<Character,Integer> entry : entrySet) {
				if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}}
		}
		
	}

}
