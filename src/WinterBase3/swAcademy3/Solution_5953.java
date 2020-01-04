package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
//수의 새로운 비교 기준
public class Solution_5953 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = parseInt(br.readLine());

		for(int i=1;i<=testCase;i++) {
			System.out.printf("#"+i);
		}

	}
}
