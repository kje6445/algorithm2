package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//햄버거 다이어트
public class Solution_5215 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			String[] arr = br.readLine().split(" ");
			int foods = Integer.parseInt(arr[0]);
			int limitCalorie = Integer.parseInt(arr[1]);

			int[][] foodArr = new int[foods][2];
			int[][] maxFind = new int[1][2];

			//제한 칼로리 이하의 조합중에서 가장 맛에 대한 점수가 높은 햄버거의 점수를 출력
			for(int p=0; p<foods; p++){
				String[] arr2 = br.readLine().split(" ");
				//N개의 줄에는 재료에 대한 민기의 맛에 대한 점수
				foodArr[p][0] = Integer.parseInt(arr2[0]);
				//칼로리
				foodArr[p][1] = Integer.parseInt(arr2[1]);
			}

			for(int p=0; p<foods; p++){
				if(maxFind[0][1]<limitCalorie){

				}
			}

			System.out.printf("#"+i+" ");
		}
	}
}
