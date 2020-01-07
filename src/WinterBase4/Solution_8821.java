package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//적고 지우기
public class Solution_8821 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String[] arr = br.readLine().split("");
			int[] nums = new int[10];

			for (int p = 0; p < 10; p++) {
				nums[p] = 0;
			}

			for (int p = 0; p < arr.length; p++) {
				++nums[Integer.parseInt(arr[p])];
			}

			int count = 0;

			for (int p = 0; p < 10; p++) {
				if (nums[p] % 2 == 1) {
					++count;
				}
			}
			System.out.println("#" + i + " " + count);
		}
	}
}
