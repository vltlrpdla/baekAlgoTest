package baekAlgoTest.printcharacter;

import java.util.Scanner;

public class PrintCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("아무글자나 입력 : ");
		String inputString = sc.nextLine();
		char[] charset = new char[10];
		
		int endOfinputString = inputString.length();
				//10으로 나눠 떨어질때랑 안떨어질떄 구분 
		//올림에 대한 개념
		
		for ( int i = 0; i < (endOfinputString/10) + 1 ; i++){
			for ( int j = 0 ; j < 10  ; j++){
				if ( (i== (endOfinputString/10))&& ( j >= (endOfinputString%10))){
					charset[j] = ' ';					
				}else{
					charset[j] = inputString.charAt(i*10 + j);					
				}
			}
			System.out.println(charset);
		}
	}

}
