package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//[S/W 문제해결 기본] 1일차 - Flatten
public class Solution_1208 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int nums = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[nums];

			for(int p=0; p<nums; p++){
				arr[p] = Integer.parseInt(st.nextToken());
			}


		}
	}
}
