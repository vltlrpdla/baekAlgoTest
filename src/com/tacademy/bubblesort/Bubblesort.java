package com.tacademy.bubblesort;

public class Bubblesort {
	
	public static void main(String args[]){
		int arr[] = {2,3,1,5,4};
		
		bubbleSort(arr);
		
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]);
	}

	public static void bubbleSort(int[] arr){
		for ( int i = arr.length - 1; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if ( arr[j] > arr[j + 1]){ // 부등호의 위치만 바꿔주면 오름차 내림차가 바뀜.
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
