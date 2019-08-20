package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1932 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int lines = sc.nextInt();

		int[][] tree = new int[lines][lines];
		System.out.println("lines: "+lines);
		int sum = 0;
		int fixX = 0, fixY = 0;

		for (int i = 0; i < lines; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; i <= i; j++) {
				tree[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < lines; i++) {
				if (i == 0) {
					sum = tree[0][0];
					fixX = 0;
					fixY = 0;
				} else {
					sum += Math.max(tree[fixX + 1][fixY], tree[fixX + 1][fixY + 1]);
					System.out.println("sum1 : "+sum);
					if (tree[fixX + 1][fixY] == Math.max(tree[fixX + 1][fixY], tree[fixX + 1][fixY + 1])) {
						++fixX;
					} else {
						++fixX;
						++fixY;
					}
				}

		}
			System.out.println(sum);

		}
	}
