package Semester_2;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] wine = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			wine[i] = Integer.parseInt(st.nextToken());
		}

		int[] sumWine = new int[n];
		sumWine[0] = wine[0];

		if (n > 2) {
			sumWine[1] = wine[0] + wine[1];
			sumWine[2] = Math.max(sumWine[1], Math.max(wine[0] + wine[2], wine[1] + wine[2])); //잔이 3잔일 경우

			for (int j = 3; j < sumWine.length; j++) {
				sumWine[j] = Math.max(wine[j] + sumWine[j - 2], wine[j] + wine[j - 1] + sumWine[j - 3]);
				sumWine[j] = Math.max(sumWine[j], sumWine[j - 1]);
			}
			bw.write(String.valueOf(sumWine[n - 1]));
		} else if (n == 2) { // 잔이 2잔일 경우
			bw.write(String.valueOf(wine[0] + wine[1]));
		} else if (n == 1) { // 잔이 1잔일 경우
			bw.write(String.valueOf(wine[0]));
		}
		bw.flush();


	}
}
