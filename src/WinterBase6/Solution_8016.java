package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//홀수 피라미드
public class Solution_8016 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			long n = Long.parseLong(br.readLine());

			long frist = 2*n*n-4*n+3;
			long countN = 2*n-1;
			long last = 2*(countN-1)+frist;

			System.out.println("countN "+countN);
			System.out.println("#"+i+" "+frist+" "+last);
		}
	}
}
