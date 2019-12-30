package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//다양성 측정
public class Solution_7728 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int count = 0;

		for(int i=1; i<=testCase; i++){
			String numbers = br.readLine();
			char[] numchecks = numbers.toCharArray();
			count =0;


			System.out.println("#"+i+count);
		}
	}
}
