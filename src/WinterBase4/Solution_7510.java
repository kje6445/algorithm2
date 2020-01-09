package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//상원이의 연속 합
public class Solution_7510 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int num = Integer.parseInt(br.readLine());
			//연속 합은 어떻게 쪼개서 답을 내야할까
			int count = 0;

			for (int p = 0; p <= num; p++) {
				int A = 2 * num - p * p - p; //분자
				int B = 2 * p + 2;//분모

				if (A <= 0) {
					break;
				}

				if (A % B == 0) {
					++count;
				}
			}
			System.out.println("#" + i + " " + count);
		}
	}
}
