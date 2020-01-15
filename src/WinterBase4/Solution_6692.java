package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//다솔이의 월급 상자
public class Solution_6692 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCases; i++) {
			int T = Integer.parseInt(br.readLine());
			double result = 0.0;
			for (int p = 1; p <= T; p++) {
				String[] value = br.readLine().split(" ");
				result += Double.parseDouble(value[0]) * Double.parseDouble(value[1]);
			}
			System.out.printf("#"+i+" "+result+"\n");
		}
	}
}
