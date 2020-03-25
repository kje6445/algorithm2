package SpringBase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//한빈이와 Spot Mart
public class Solution_9229 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			String str = br.readLine();
			int num = str.charAt(0);
			int maxWeight = str.charAt(1);

			String[] snacks = br.readLine().split(" ");
			int[] snackArr = new int[snacks.length];

			for(int k=0; k<snackArr.length; k++){
				snackArr[k] = Integer.parseInt(snacks[k]);
			}

			Arrays.sort(snackArr);
			int idx;
			int ableWeight = -1;
			for(int k=0; k<snackArr.length; k++){
				System.out.println(snackArr[k]+" ");
				if(maxWeight<snackArr[k]){ //maxWeight보다 작은 것들만 비교할 수 있도록 idx 체크
					idx = k;
				}
			}
			//어떤 합을 정했을 때 가장 클 지에 대해서 생각해보기
			System.out.println("#"+i+" "+ableWeight);
		}
	}
}
