package kr.co.programmers.palindrome2;

//select branch_id, sum(salary) as total from employee group by branch_id order by branch_id asc;
//subString end 인덱스는 포함 안한다 !
public class Palindrome2 {

	public static void main(String[] args) {
		
		String s = "abcdcba";
		int answer = solution(s);
		System.out.println("answer :" + answer);
	
	}
	
	public static int solution(String s){
		int answer = 0;
		int length = s.length();
		
		for(int i = length ; i >= 0 ; i-- ){
			for (int j = 0; j <= length - i ; j++){
				if ( isPalindrome(s.substring(j, j + i )) ){
					answer = i;
					return answer;
				}
			}
		}
		return answer;
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
