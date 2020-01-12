package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//성수의 프로그래밍 강좌 시청
public class Solution_6719 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] ability = new int[n];

			st = new StringTokenizer(br.readLine());
			for (int p = 0; p < n; p++) {
				ability[p] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(ability);

			float answer = 0;

			for (int p = 0; p < ability.length; p++) {
				if(p==0){
					answer = (answer + ability[p]) / 2;
				}
				if ((p != 0) && (ability[p - 1] != ability[p])) {
					answer = (answer + ability[p]) / 2;
					System.out.println("answer "+answer);
				}
			}

			System.out.printf("#%d  %.6f \n", i, answer);
		}
	}
}
