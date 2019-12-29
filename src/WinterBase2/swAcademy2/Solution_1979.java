package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//어디에 단어가 들어갈 수 있을까
public class Solution_1979 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int N, K;

		for(int i=1; i<=testCase; i++){
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			int[][] matrix= new int[N][N];
			for(int p=0; p<N; p++){
				st = new StringTokenizer(br.readLine());
				for(int tt=0; tt<N; tt++){
					matrix[p][tt] = Integer.parseInt(st.nextToken());
				}
			}
			System.out.println("#"+i);
		}
	}
}
