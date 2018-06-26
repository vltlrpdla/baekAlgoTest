package test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String rule = "zothf";
		String output = solution(rule,"otz","hh");
		
		System.out.print("" + output);

	}
	 public static String solution(String rule, String A, String B) {
	        String answer = "";
	        answer = changeToInt(rule,A);
	        return answer;
	    }
	 
	 public static String changeToInt(String rule, String str){
		 String output = "";
		 for(int i = 0 ; i < str.length() ; i ++){
			 output += "" + rule.indexOf(str.charAt(i));
		 }
		 return output;
	 }
	 
	 public static String chageToRule(int input, String output){
		 String str = "" ;
		 return str;
	 }
}
