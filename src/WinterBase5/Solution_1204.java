package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//[S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class Solution_1204 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int caseNum = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());

			int[] arr = new int[1000];
			int[] idxArr = new int[101];

			for (int p = 0; p <= 100; p++) {
				idxArr[p] = 0;
			}

			for (int p = 0; p < 1000; p++) {
				arr[p] = Integer.parseInt(st.nextToken());
				int check = arr[p];
				++idxArr[check];
			}

			/*int modNum = 0;
			for (int p = 0; p <= 100; p++) {
				if (idxArr[modNum] < idxArr[p]) {
					modNum = p;
				}
			}*/
			int maxIdx = 0;
			int maxVal = 0;
			for (int p = 100; p >= 0; p--) {
				if (idxArr[p] > maxVal) {
					maxIdx = p;
					maxVal = idxArr[p];
				}
			}
			System.out.println("#" + caseNum + " " + maxIdx);
		}
	}
}
