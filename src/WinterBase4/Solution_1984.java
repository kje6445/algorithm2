package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1984 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());
		int[] arr = new int[10];

		for (int i = 1; i <= testCases; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int p = 0; p < 10; p++) {
				arr[p] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);

			int sum = 0;
			int first = arr[0];
			int find = arr[0];
			int count = 0;

			for (int p = 1; p < 9; p++) {
				if ((first != arr[p]) || (find != arr[p])) {
					sum += arr[p];
					++count;
				}
			}
			double avg =sum / count;
			System.out.println("avg "+avg);
			System.out.println("#" + i + " " + Math.round(avg));
		}
	}
}
