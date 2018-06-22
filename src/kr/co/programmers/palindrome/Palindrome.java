package kr.co.programmers.palindrome;



public class Palindrome {

	public static void main(String[] args) {
		
		String s = "abcdcbadd";
		
		solution(s);
		
		
	}
	
	public static void solution(String s){
		int answer = s.length();
		
		if ( (answer % 2) == 0) {
			solution(s.substring(0, answer - 1 ));
			solution(s.substring(1,answer));
		}else if ( (answer >= 3) && isPalindrome(s)){
			System.out.println(answer + "길이의 펠린드롬");
		}else if ( answer > 3){
			solution(s.substring(0, answer - 2 ));
			solution(s.substring(1, answer - 1 ));
			solution(s.substring(2, answer ));
		}else{
			System.out.println("없다 !");
		}
		
	}
	
	public static boolean isPalindrome(String param){
		int last = param.length() - 1;
		int center = param.length() / 2;
		for ( int start = 0 ; start < center ; start ++){
			if ( param.charAt(start) != param.charAt(last - start)){
				return false;
			}
		}
		return true;
	}
}
