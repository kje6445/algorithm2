package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//숫자를 정렬하자
public class Solution_1966 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1;i<=testCase; i++){
			int N = Integer.parseInt(br.readLine());

			String[] arr = br.readLine().split(" ");
			int[] nums = new int[arr.length];

			for(int p=0; p<arr.length; p++){
				nums[p] = Integer.parseInt(arr[p]);
			}

			Arrays.sort(nums);
			System.out.printf("#"+i+" ");

			for(int k=0; k<nums.length; k++){
				System.out.printf(nums[k]+" ");
			}

			System.out.println("");
		}
	}
}
