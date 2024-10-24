package ProblemSlove;

import java.util.HashMap;
import java.util.Set;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumOccarance(12326531);
	}
	
	public static void countNumOccarance(int n) {
		int oc,r;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		while(n!=0) {
			oc=n%10;
			if(hm.containsKey(oc)) {
				hm.put(oc,hm.get(oc)+1);
			}
			else {
				hm.put(oc, 1);
			}
			n=n/10;
		}
		
	Set<Integer> entry=hm.keySet();
	for(Integer e:entry) {
		System.out.println(e+" Expted Value :="+hm.get(e));
	}
	}

}
