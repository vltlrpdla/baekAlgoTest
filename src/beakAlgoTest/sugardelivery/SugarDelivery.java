package beakAlgoTest.sugardelivery;
import java.util.*;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int amountOfSugar = scn.nextInt();
		int remainDivBy5 = remainderDivByN(amountOfSugar,5);
		int amount_plasticBag_5Kg = shareDivByN(amountOfSugar, 5);
		int amount_plasticBag_3Kg = 0;
		
		if( remainDivBy5 == 0 ){
			System.out.print("5kgºÀÁö:" + amount_plasticBag_5Kg);
		}else if(remainDivBy5 == 3){
			System.out.print("5kgºÀÁö:" + amount_plasticBag_5Kg + "\n3kgºÀÁö:" + 1);
		}else if(amount_plasticBag_5Kg > 0){
			
			while(amount_plasticBag_5Kg >= 0){
				
				amount_plasticBag_5Kg = amount_plasticBag_5Kg - 1;
				amount_plasticBag_3Kg = shareDivByN(amountOfSugar - (5 * amount_plasticBag_5Kg ),3);
				
				if (amount_plasticBag_5Kg == -1){
					System.out.print("-1");
				}else if( remainderDivByN(amountOfSugar - (5 * amount_plasticBag_5Kg ), 3) == 0 ){
					System.out.print("5kgºÀÁö:" + amount_plasticBag_5Kg + "\n3kgºÀÁö:" + amount_plasticBag_3Kg);
					break;
				}
				
			}		
			
		}else{		
				System.out.print("-1");
		}
		
	}

	
	public static int remainderDivByN(int inputData, int num){
		return inputData%num;
	}
	
	public static int shareDivByN(int inputData,int num){
		return inputData/num;
	}

}
