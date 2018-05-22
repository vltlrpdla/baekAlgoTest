package baekAlgoTest.dayofmonth;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2007년 x월 y일의 요일을 출력하시오. 2007년 1월 1일은 월요일
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int totalDay = day;
		
		int[] dayInMonth ={31,28,31,30,31,30,31,31,30,31,30,31};
		String[]  dayOfWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		
		for(int i = 0 ; i < month -1; i++){
			totalDay+=dayInMonth[i];
		}
		
		System.out.println("X : " + month + "  Y : " +day + "  결과 : " + dayOfWeek[totalDay%7]);
		
		sc.close();

	}

}
