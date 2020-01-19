package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//현주의 상자 바꾸기
public class Solution_5789 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];

			for(int p=0; p<N; p++){
				arr[p] = 0;
			}

			for(int p=1; p<=Q; p++){
				st = new StringTokenizer(br.readLine());
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());

				for(int k =L-1; k<R; k++){
					arr[k] = p;
				}
			}

			String answer = String.valueOf(arr[0]);
			for(int p=1; p<N; p++) {
				answer = answer.concat(" ");
				answer = answer.concat(String.valueOf(arr[p]));
			}
			System.out.println("#"+i+" "+answer);

		}
	}
}