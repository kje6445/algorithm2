package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//홀수일까 짝수일까
public class Solution_5549 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String[] nums = br.readLine().split("");
			int check = Integer.parseInt(nums[nums.length - 1]);

			System.out.printf("#" + i + " ");
			if (check % 2 == 1) {
				System.out.println("Odd");
			} else {
				System.out.println("Even");
			}
		}
	}
}
