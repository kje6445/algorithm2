package WinterBase6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//간단한 압축 풀기_v2
public class Solution_1946_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine().trim());
			int cnt = 0;
			System.out.println("#"+test_case);
			for(int i = 0 ; i < N; i++) {
				st = new StringTokenizer(br.readLine().trim());
				char alp = st.nextToken().charAt(0);
				int num = Integer.parseInt(st.nextToken());
				for(int j = 0; j < num; j++) {
					System.out.print(alp);
					cnt++;
					if(cnt == 10) {
						System.out.println();
						cnt = 0;
					}
				}
			}
			System.out.println();
		}
	}
}
