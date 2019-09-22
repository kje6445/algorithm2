package Semester_2;

import java.util.Scanner;

public class C_11057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int mod = 10007;

		int dp[][] = new int[n + 1][10];

		//우선 초기화
		//1자리 수인 경우 각 숫자가 들어갈 경우의 수 저장

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					dp[i][j] += dp[i - 1][k];
					dp[i][j] %= mod;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}

		System.out.println(ans % mod);
	}
}
