package baekAlgoTest.inandout;
import java.util.*;
import java.io.*;

//Scanner는 사용은 편리하나, 띄어쓰기나 개행문자(엔터)를 만나면 서로 다른 글자로 인식
//Scanner를 사용할 경우 마지막 문자가 일정하지않음 . 공백 or \r\n 이냐로 읽기때문에 일정하지않아서 일정한 종료조건을 가지는 BufferedReader 사용 java에서는 null

public class InputToOutput{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=in.readLine())!=null){
			System.out.println(line);
		}
		in.close();
	}
}