package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//콩 많이 심기
public class Solution_4301 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[][] field = new int[1000][1000];

			// 콩들의 거리가 2가 넘지 않으면서 최대한 많이 콩을 심으려고 한다.
			// 먼저 콩을 심어놓는다고 생각
			for (int p = 0; p < M; p++) {
				for (int k = 0; k < N; k++) {
					field[p][k] = 0;
				}
			}

			// 거리비교해서 거리가 2면 1로 바꾸기
			for (int p = 0; p < M; p++) {
				for (int k = 0; k < N; k++) {
					if (field[p][k] == 0) {
						field[p + 2][k] =1;
						field[p][k + 2] = 1;
					}
				}
			}

			int cnt = 0;
			//0인건만 카운트
			for (int p = 0; p < M; p++) {
				for (int k = 0; k < N; k++) {
					if (field[p][k] == 0) {
						cnt++;
					}
				}
			}
			System.out.printf("#" + i + " " + cnt);
		}
	}
}
