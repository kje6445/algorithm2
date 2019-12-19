package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//알파벳을 숫자로 변환
public class Solution_2050 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] answer = br.readLine().toCharArray();

		for(int i=0; i<answer.length; i++){
			int a = answer[i];
			System.out.printf( a-64+" ");
		}
	}
}
