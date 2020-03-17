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

			for(int k=0; k<n; k++){
				System.out.printf(" "+arr[k]); // 제대로 입력 받아짐
			}
			System.out.println("");
		//	int preNum;
			int count = 0;
			int check =0;
			for(int k=0; k<n-1; k++) {
				int preNum = arr[k];
				int p = k+1;
				int postNum = arr[p];

			//	System.out.println("k "+k+" preNum "+preNum +" postNum "+ postNum);

				if(preNum == postNum){ //다음 수랑 값이 같을 경우

				}else if(preNum < postNum){//다음 수가 증가
					if(check != 1){
						count++;
					}
					System.out.println("k "+k+" check "+check);
					check = 1;
					System.out.println("After k1 "+k+" check "+check);
				}else{//다음 수가 감소
					if(check != 3){
						count++;
					}
					System.out.println("k "+k+" check "+check);
					check = 3;
					System.out.println("After k2 "+k+" check "+check);
				}
				System.out.println("k "+k+" count "+count);
			}

			if(count ==0)
				count++;

			System.out.printf("#"+i+" "+count);
		}
	}
}
