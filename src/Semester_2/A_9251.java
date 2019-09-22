package Semester_2;

import java.util.Scanner;

public class A_9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		sc.close();
		;

		int[][] dp = new int[st1.length() + 1][st2.length() + 1];

		for (int x = 1; x <= st1.length(); x++) {

			char c1 = st1.charAt(x - 1);

			for (int y = 1; y <= st2.length(); y++) {
				char c2 = st2.charAt(y - 1);

				if (c1 == c2) { //값이 같으면 좌측 대각선 위의 값 +1
					dp[x][y] = dp[x - 1][y - 1] + 1;
				} else { //값이 다르면 좌측(x-1), 상단(y-1)의 값 중 더 큰 값
					dp[x][y] = Math.max(dp[x - 1][y], dp[x][y - 1]);
				}
			}
		}

		System.out.println(dp[st1.length()][st2.length()]);
	}
}
