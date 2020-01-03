package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//홀수만 더하기
public class Solution_2072 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] nums = new int[10];
			int sum=0;
			for(int k=0; k<10; k++)
				nums[k] = Integer.parseInt(st.nextToken());

			for(int k=0; k<10; k++){
				if(nums[k]%2==1){
					sum += nums[k];
				}
			}
			System.out.println("#"+i+" "+sum);
		}
	}
}
