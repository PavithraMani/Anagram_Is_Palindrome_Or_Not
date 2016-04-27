import java.util.*;

public class Anagram_Is_Palindrome_Or_Not {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		String s = myScan.nextLine();
		String ans;
		Hashtable<Character, Integer> counter = new Hashtable<Character, Integer>();
		int count = 0;
		int ct=0;
		int even=0,odd=0;
		for(int i=0;i<s.length();i++){
			if(!counter.keySet().contains(s.charAt(i))){
				counter.put(s.charAt(i), 1);
			} else {
				count = counter.get(s.charAt(i));
				counter.put(s.charAt(i), ++count);
			}
		}

		for(char c:counter.keySet()) {
			ct=counter.get(c)%2;
			if(ct==0)
				even++;
			else
				odd++;
		}
		if(even>=0 && odd>=0 && odd<=1){
			ans="YES";
		}
		else
			ans="NO";

		System.out.println(ans);
		myScan.close();
	}
}

