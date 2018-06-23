package kr.co.programmers.duplicate;

import java.util.Collection;
import java.util.Collections;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 3, 2, 1};
		
		boolean flag = solution(input);
		System.out.print(flag);
	}
	
	public static boolean solution(int[] arr){
		 boolean answer = true;
		 int arraySize = arr.length;
	     int[] checkedArr = new int[arraySize];

	        for(int i=0; i < arraySize; i++) {
	        		if(arr[i] > arraySize) {
	        			return false;
	        		}

	        		if(checkedArr[arr[i]-1] == arr[i]) {
	        			return false;
	        		}

	        		checkedArr[arr[i]-1] = arr[i];
	        }
		 return answer;
		 
	}
}
