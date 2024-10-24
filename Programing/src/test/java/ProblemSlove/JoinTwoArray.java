package ProblemSlove;

import java.util.Arrays;
import java.util.List;

public class JoinTwoArray {

	public static void main(String[] args) {
		String [] st1="TODO Auto-generated method stub".split(" ");
		String [] st2="TODO Auto-generated yuo".split(" ");
		joinArr(st1,st2);
	}
	
	public static void joinArr(String []expStr1,String[] expStr2) {
		//First Approach
		String [] res=Arrays.copyOf(expStr1,expStr1.length+ expStr2.length);
		System.out.println(res.length);
		int c=0;
		for(int i=expStr1.length;i<res.length;i++) {
			res[i]=expStr2[c];
			c=c+1;
		}
		
		for(int i=0;i<res.length;i++) {
		System.out.print(res[i]+" ");
		}
		
		//Second Approach
		System.out.println("New Approach");
		List<String> li1=Arrays.asList(expStr1);
		List<String> li2=Arrays.asList(expStr2);
		li1.addAll(li2);
		Object[] st=li1.toArray();
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}

	}
	
	}
