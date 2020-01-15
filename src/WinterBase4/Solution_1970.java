package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//쉬운 거스름돈
public class Solution_1970 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());
		int[] moneyAccount = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] dp = new int[8];

		for (int i = 1; i <= testCases; i++) {
			int money = Integer.parseInt(br.readLine());

			for (int p = 0; p < 8; p++) {
				if (moneyAccount[p] > money) {
					dp[p] = 0;
					continue;
				}

				int n = money / moneyAccount[p];

				for (int k = 1; k <= n; k++) {
					money -= moneyAccount[p];
					dp[p]++;
				}
			}

			String answer = String.valueOf(dp[0]);
			for (int p = 1; p < 8; p++) {
				answer = answer.concat(" ");
				answer = answer.concat(String.valueOf(dp[p]));
			}
			System.out.println("#" + i);
			System.out.println(answer);

		}
	}
}
