package kr.co.programmers.palindrome;



public class Palindrome {

	public static void main(String[] args) {
		
		String s = "abcdcbadd";
		
		System.out.print("answer  : "  + solution(s));
		
		
	}
	// 성능 상의 문제 왜 재귀 호출은 성능상의 문제를 안고 있을까 ? 함수의 변경 --> 콘텍스트 스위치 메모리 공간이 그만큼 더 필요함 
	public static int solution(String s){
		int answer = s.length();
		
		if( isPalindrome(s) || answer == 1 ){
			return s.length();
		}else{
			return Math.max(solution(s.substring( 0 , answer - 1)), solution(s.substring( 1 , answer )));
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
