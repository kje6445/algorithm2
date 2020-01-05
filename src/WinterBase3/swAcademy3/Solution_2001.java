package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//파리 퇴치
public class Solution_2001 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] matrixN = new int[n][n];

			for(int p=0; p<n; p++){
				String[] arr = br.readLine().split("");
				for(int k=0; p<n; k++){
					matrixN[p][k] = Integer.parseInt(arr[k]);
				}
			}

			int sum =0;
			int maxSum=0;

			for(int p=0; p<m; p++){
				for(int k=0; k<m; k++){
					sum+=matrixN[p][k];
				}
			}
			//matrixM의 값에 대해서 sum을 maxSum와 비교해서 큰걸 적는다.

			System.out.println("#"+i+" "+maxSum);
		}
	}
}
