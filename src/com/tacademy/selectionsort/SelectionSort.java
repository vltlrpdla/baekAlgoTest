package com.tacademy.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {3,2,4,1,5,6};
		
		SelectionSort selSort = new SelectionSort();
		
		selSort.selectionSort(inputArray);

	}
	
	public void selectionSort(int[] inputArray){
		int minValue;
		int minValueIndex;
		
		for(int i = 0; i < inputArray.length; i ++){		
			minValue = inputArray[i];
			minValueIndex = i;
			for(int j = i + 1; j < inputArray.length; j++){
				if ( minValue > inputArray[j]){
					minValue = inputArray[j];
					minValueIndex = j;
				}				
			}
			inputArray[minValueIndex] = inputArray[i];
			inputArray[i] = minValue;
			/* 인덱스 넘버도 초기화 해줘야 값이 같을 경우 오류가 안생기더라.. Init swap variable before change 
			for(int q = 0 ; q < inputArray.length; q ++){
				System.out.print(inputArray[q]+ " ");
			}
			System.out.println("");
			*/
		}
		
		for(int i = 0; i < inputArray.length; i++){
			System.out.print(" " + inputArray[i]);
		}
	}

}
