package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C_1149 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		// 빨강, 초록, 파랑
		int[][] houseColor = new int[n][3];
		int[][] dp = new int[n][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				houseColor[i][j] = Integer.parseInt(st.nextToken());
				System.out.printf("%d ", houseColor[i][j]);
			}
			System.out.println();
		}

		dp[0][0] = houseColor[0][0];
		dp[0][1] = houseColor[0][1];
		dp[0][2] = houseColor[0][2];

		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + houseColor[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + houseColor[i][1];
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + houseColor[i][2];
			System.out.println("dp[i][0] "+ dp[i][0]+ " dp[i][1] "+dp[i][1]+ " dp[i][2] "+dp[i][2]);
		}

		Arrays.sort(dp[n - 1]);

		System.out.println(dp[n - 1][0]);

	}
}
