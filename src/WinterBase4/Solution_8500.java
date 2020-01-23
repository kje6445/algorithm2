package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//극장 좌석
public class Solution_8500 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];

			for (int p = 0; p < n; p++) {
				arr[p] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			int seat = 0;
			for(int p=0;p<n; p++){
				seat += arr[p];
			}
			seat += arr[n-1]+n;

			System.out.println("#" + i + " "+seat);
		}
	}
}
