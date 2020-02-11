package WinterBase5;

import java.util.Scanner;

//햄버거 다이어트
public class Solution_5215 {

	public static int[][] ham;
	public static int N;
	public static int L;
	public static int result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for (int i = 1; i <= testCase; i++) {
			N = scan.nextInt();
			L = scan.nextInt();
			ham = new int[N][2];
			for (int j = 0; j < N; j++) {
				ham[j][0] = scan.nextInt();
				ham[j][1] = scan.nextInt();
			}//for j
			result = 0;
			hamburg(0, 0, 0);
			System.out.println("#" + i + " " + result);
		}//for i
	}//main

	public static void hamburg(int sum, int cnt, int star) {
		if (sum > L) {
			return;
		} else if (cnt == N) {
			if (result < star) {
				result = star;
			}
			return;
		} else {
			hamburg(sum + ham[cnt][1], cnt + 1, star + ham[cnt][0]);
			hamburg(sum, cnt + 1, star);
		}
	}
}//class

