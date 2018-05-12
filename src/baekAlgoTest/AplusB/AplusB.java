package baekAlgoTest.AplusB;
import java.util.Scanner;

public class AplusB {
		
	// next와 nextLine의 차이는 공백 단위로 문자열을 읽느냐... Enter로 문자열을 읽느냐 \r\n << Enter			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		
		int A = 0,B = 0;
		
		while(flag){
			
			A = scn.nextInt();
			B = scn.nextInt();
			if ( A < 0 || B <0 )
				flag = true;
			else 
				flag = false;
		}
		
		System.out.println("A + B : " + (A + B));
		
		scn.close();
	}

}
