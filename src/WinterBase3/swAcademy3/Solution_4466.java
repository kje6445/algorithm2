package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//최대 성적표 만들기
public class Solution_4466 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int[] scores = new int[n];

			st = new StringTokenizer(br.readLine());
			for (int p = 0; p < n; p++) {
				scores[p] = Integer.parseInt(st.nextToken());
			}

			int sum = 0;

			Arrays.sort(scores);

			for (int p = 0; p < k; p++) {
				sum += scores[n - 1 - p];
			}

			System.out.println("#" + i + " " + sum);
		}
	}
}
