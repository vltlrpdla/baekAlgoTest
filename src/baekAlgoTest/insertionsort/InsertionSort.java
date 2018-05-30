package baekAlgoTest.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,4,5,3,1,2};	
		int temp,j;	
		
		System.out.println("" + a.length);
		
		for(int i = 1 ; i < a.length ; i ++) {
			temp = a[i];
			for(j = i-1 ; j >= 0 && a[j] > temp; j --) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}

	}

}
