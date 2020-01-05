package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//평균값 구하기
public class Solution_2071 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			double avg;
			double sum =0;

			String[] nums = br.readLine().split(" ");
			int[] numArr = new int[10];
			for(int p=0; p<10; p++){
				numArr[p] = Integer.parseInt(nums[p]);
				sum+=numArr[p];
			}

			avg = sum/10;
			System.out.println("#"+i+" "+Math.round(avg));
		}
	}
}
