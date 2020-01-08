package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//민석이의 과제 체크하기
public class Solution_5431 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int doHomework = Integer.parseInt(st.nextToken());

			int[] people = new int[n];

			st = new StringTokenizer(br.readLine());

			for (int p = 0; p < doHomework; p++) {
				int person = Integer.parseInt(st.nextToken());
				for (int k = 0; k < n; k++) {
					if((person-1) == k) {
						people[person - 1] = 1;
					}
				}
			}

			System.out.printf("#" + i + " ");

			for (int p = 0; p < n; p++) {
				if (people[p] != 1) {
					System.out.printf((p + 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
