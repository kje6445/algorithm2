package SpringBase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//배열의 분할
public class Solution_9015 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//배열이 같거나 증가하는 오름차순이 같거나 감소하는 내림차순으로 정렬
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			String[] numArr = br.readLine().split(" ");
			for(int k=0; k<n; k++){
				arr[k] = Integer.parseInt(numArr[k]);
			}
		//	int preNum;
			Arrays.sort(arr);
			int count = 0;
			int check =0;
			for(int k=0; k<n; k++) {
				int preNum = arr[k];
				//다음 수랑 값이 같을 경우
				if(preNum == arr[k+1]){
				//	++count;
				}else if(preNum < arr[k+1]){//다음 수가 증가
					check = 1;
				}else{//다음 수가 감소
					check = 2;
				}
			}

			System.out.printf("#"+i+" "+count);
		}
	}
}
