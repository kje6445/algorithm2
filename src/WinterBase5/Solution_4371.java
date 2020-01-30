package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//항구에 들어오는 배
public class Solution_4371 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//주기가 3인 배는 항구에 1일차, 4일차, 7일차, 10일차 등에 방문
		//배가 들어오는 최소의 값을 구하시오
		for (int i = 1; i <= testCase; i++) {
			int date = Integer.parseInt(br.readLine());
			int[] arr = new int[date];
			int[] gaps = new int[date];
			//즐거운 날의 정보
			for (int p = 0; p < date; p++) {
				arr[p] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(arr);
			int gap;
			int count = 0;
			for (int p = 0; p < date; p++) {
				System.out.printf(arr[p] + " ");
			}
	     	for (int p = date-1; p >=0; p--) {
	     		 gap = arr[p] - arr[p-1];
	     		 for(int k=0; k <gaps.length; k++){
				 }
			}
			System.out.println();
			for (int p = 0; p < date; p++) {
				System.out.printf(gaps[p] + " ");
			}
			System.out.println();
			System.out.println("#" + i + " "+count);


		}
	}
}