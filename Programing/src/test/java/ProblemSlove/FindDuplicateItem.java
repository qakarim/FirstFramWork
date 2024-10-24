package ProblemSlove;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateItem {

	public static void main(String[] args) {
		String st=" TODO Auto-generated method stub TODO Auto-generated";
		String []sr=st.split(" ");
		findDuplicateWord(sr);
	}

	public static void findDuplicateWord(String [] expStr) {
		
		String st[]=expStr;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<st.length;i++) {
			if(hm.containsKey(st[i])) {
				hm.put(st[i], hm.get(st[i])+1);
			}else {
				hm.put(st[i],1);
			}
		}
		System.out.println(hm);
		System.out.println(hm.size());

		Set<java.util.Map.Entry<String, Integer>> entrySet=hm.entrySet();
		
		
	}
	
	public static void findduplicateByNoHashMap(String expSt) {
		
		
	}
	
}
