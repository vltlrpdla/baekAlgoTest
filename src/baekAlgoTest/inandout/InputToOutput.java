package baekAlgoTest.inandout;
import java.util.*;
import java.io.*;

//Scanner�� ����� ���ϳ�, ���⳪ ���๮��(����)�� ������ ���� �ٸ� ���ڷ� �ν�
//Scanner�� ����� ��� ������ ���ڰ� ������������ . ���� or \r\n �̳ķ� �б⶧���� ���������ʾƼ� ������ ���������� ������ BufferedReader ��� java������ null

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