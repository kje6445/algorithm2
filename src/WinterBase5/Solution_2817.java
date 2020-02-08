package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//부분 수열의 합
public class Solution_2817 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			String[] nums = br.readLine().split(" ");
			int n = Integer.parseInt(nums[0]);
			int k = Integer.parseInt(nums[1]);

			String[] arr = br.readLine().split(" ");
			int[] arrNum = new int[n];
			for (int p = 0; p < n; p++) {
				arrNum[p] = Integer.parseInt(arr[p]);
			}

			//arr의 합이 k가 되어야 한다.
			Arrays.sort(arrNum); //배열 정리해

			int count = 0;
			//큰수로 해서 쪼개서 나눠가는 것이 문제 풀이에 좋을 것
			System.out.println("#" + i + " "+count);
		}
	}
}
