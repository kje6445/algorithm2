package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2016년 요일 맞추기
public class Solution_5515 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String[] nums = br.readLine().split(" ");
			int month = Integer.parseInt(nums[0]);
			int date = Integer.parseInt(nums[1]);

			int[] dates = new int[13];

			for(int p=1; p<dates.length; p++){
				if(p==2){
					dates[p] = 29;
				}else if((p%2==1)||(p==8)){
					dates[p] = 31;
				}else{
					dates[p] = 30;
				}
			}

			int sum=0;
			int mod = 0;

			if(month==1){
				sum = date;
				mod=(sum-1)%7+4;
			}else {
				for (int p = 2; p <= month; p++) {

				}
				sum+=dates[1];
			}
			System.out.println("#"+i+" "+mod);
		}
	}
}
