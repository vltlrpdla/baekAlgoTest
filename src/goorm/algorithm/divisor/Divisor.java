package goorm.algorithm.divisor;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positiveValue = sc.nextInt();
		int divide = 0;
	
		for(int i = 1 ; i <= positiveValue ; i++ ) {
				divide = positiveValue % i;
				
				if ( divide  == 0 ) {
					System.out.print(i +" ");
				}
		}
		
		sc.close();
	}
}

