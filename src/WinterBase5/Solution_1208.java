package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//[S/W 문제해결 기본] 1일차 - Flatten
public class Solution_1208 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i <= 10; i++) {

			int nums = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[100];

			for (int p = 0; p < 100; p++) {
				arr[p] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			for (int k = 0; k < nums; k++) {
				arr[0]++;
				arr[99]--;
				Arrays.sort(arr);
			}
			System.out.println("#" + i + " " + (arr[99] - arr[0]));
		}
	}
}
