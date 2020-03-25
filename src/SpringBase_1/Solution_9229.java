package SpringBase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//한빈이와 Spot Mart
public class Solution_9229 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//배열이 같거나 증가하는 오름차순이 같거나 감소하는 내림차순으로 정렬
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
			for(int k=0; k<snackArr.length; k++){
				System.out.println(snackArr[k]+" ");
				if(maxWeight<snackArr[k]){ //maxWeight보다 작은 것들만 비교할 수 있도록 idx 체크
					idx = k;
				}
			}
			System.out.println("#"+i+" ");
		}
	}
}
