package week8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1932 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int lines = Integer.parseInt(br.readLine());

		int[][] tree = new int[lines][lines];
		System.out.println("lines: " + lines);

		for (int i = 0; i < lines; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i + 1; j++) {
				tree[i][j] = Integer.parseInt(st.nextToken());
				System.out.printf("%d ", tree[i][j]);
			}
			System.out.println();
		}

		for (int i = 1; i < lines; i++) {
			for (int j = 0; j < i + 1; j++) {
				tree[i][j] += Math.max((j == 0) ? 0 : tree[i - 1][j - 1], tree[i - 1][j]);
			}
		}

		Arrays.sort(tree[lines - 1]);

		System.out.println(tree[lines - 1][lines - 1]);

	}
}
