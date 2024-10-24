package ProblemSlove;

import java.util.HashMap;
import java.util.Set;

public class CountWord {

	public static void main(String[] args) {
		String st="TODO Auto-generated method stub,Auto";
		
		countWord(st);

	}
	
	static void countWord(String str) {
		String[] st=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String w:st) {
			if(hm.containsKey(w)) {
				hm.put(w, hm.get(w)+1);
				
			}
			else {
				hm.put(w,1);
			}
			
		}
		
		Set<String> ws=hm.keySet();
		
		for(String w:ws) {
			if(hm.get(w)>1) {
				System.out.println(w+" : "+hm.get(w));
			}
		}
	}

}
