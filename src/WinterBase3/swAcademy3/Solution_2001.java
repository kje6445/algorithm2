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

		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] matrixN = new int[n][n];

			for (int p = 0; p < n; p++) {
				st = new StringTokenizer(br.readLine());
				String[] arr = new String[st.countTokens()];

				for (int k = 0; k < n; k++)
					arr[k] = st.nextToken();

				for (int k = 0; k < n; k++) {
					matrixN[p][k] = Integer.parseInt(arr[k]);
				}
			}

			int sum, max = 0;

			for(int p=0; p<n-m+1; p++) {
				for(int j=0; j<n-m+1; j++) {
					sum = 0;
					for(int k=0; k<m; k++) {
						for(int l=0; l<m; l++) {
							sum += matrixN[p+k][j+l];
						}
					}
					if( sum > max ) max = sum;
				}
			}



			System.out.println("#" + i + " " + max);
		}
	}

}
