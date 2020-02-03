package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//진용이네 주차타워
public class Solution_9280 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//하루 벌어들일 총 수입을 계산하는 프로그램을 작성하라.
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[] fare = new int[n];
			for(int p=0; p<n; p++)
				fare[p] = Integer.parseInt(br.readLine());

			int[] weight = new int[m];
			for(int p=0; p<m; p++)
				weight[p] = Integer.parseInt(br.readLine());


		}
	}
}
