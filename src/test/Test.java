package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,2,1};
		int[] output = solution(input);
		for(int i = 0 ;  i < output.length ; i ++){
			System.out.print(output[i]);
		}
	}

	 public static int[] solution(int[] grade) {
	        int[] answer = {};
	        answer = new int[grade.length];
	        int indexValue = 0;
	        int count;
	        for( int i = 0 ; i < grade.length ; i++){
	        	indexValue = grade[i];
	        	count = 1;
	        	for( int j = 0 ; j < grade.length ; j ++){
	        		if ( indexValue < grade[j]){
	        			count++;
	        		}
	        	}
	        	answer[i] = count;
	        }
	        
	        return answer;
	 }
}
