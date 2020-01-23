package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//화섭이의 정수 나열
public class Solution_3809 {
	static  int[] nums, seive;
	static int N, result, NONE = 999999;
	static void find1() {
		for (int i = 0; i < 10; i++) {
			if (seive[i] == 0 && i < result) result = i;
		}
	}
		static void find2(){
			for(int i=0; i<N-1; i++){
				seive[nums[i]*nums[i+1]] = 1;
			}
			for(int i=10; i<100; i++){
				if(seive[i] == 0 && i<result)
					result =i;
			}
		}
		static void find3(){
			for(int i=0; i<N-2; i++){
				seive[nums[i]*100 + nums[i+1]*10+nums[i+2]] =1;
			}
			for(int i= 100; i<1000; i++){
				if(seive[i] == 0 && i<result)
					result = i;
			}
		}
		static void solve(){
			find1();
			if(result != NONE) return;
			find2();
			if(result != NONE) return;
			find3();
		}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int total = Integer.parseInt(br.readLine());
			String[] num = br.readLine().split(" ");
			int[] nums = new int[total];
			result = NONE;
			seive = new int[1000];
			for(int p=0; p<nums.length; p++) {
				nums[p] = Integer.parseInt(num[p]);
				seive[nums[p]] = 1;
			}
			solve();
			System.out.println("#"+i+" "+result);
		}
	}
}
