package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//파도반 수열
public class Solution_3376 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		long[] length = new long[101];
		length[1] = length[2] = length[3] = 1;
		for (int i = 4; i <= 100; i++) {
			length[i] = length[i - 2] + length[i - 3];
		}
		for (int i = 1; i <= testCase; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println("#" + i+" "+length[num]);
		}
	}
}
