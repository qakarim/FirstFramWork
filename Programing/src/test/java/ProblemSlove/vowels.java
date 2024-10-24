package ProblemSlove;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ext="artei";
		countVowel(ext);
	}

	
	public static void countVowel(String expSt) {
		char [] ch=expSt.toCharArray();
		int count=0;
		for(Character c:ch) {
			if("aeiou".contains(c.toString().toLowerCase())) {
				count=count+1;
			}
		}
		System.out.println("total vowel Is " + count);
	}
}
