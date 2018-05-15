package baekAlgoTest.printstar;
import java.util.*;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		
		for ( int i = 1 ; i <= input ; i ++){
			for( int j = 1 ; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for ( int i = 1;  i <= input ; i++){
			for ( int j = 1 ; j <= input ; j++){
				if ( j <= (input - i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			/*처음 구현 할때 이렇게 함. 공간복잡도 뿐만 아니라 시간복잡도도 조금 손해보는 느낌
			for ( int k = 1; k <= i ; k++){
				System.out.print("*");
			}
			*/
			System.out.println();
		}
			
	}

}
