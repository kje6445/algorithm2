package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//달팽이 숫자
public class Solution_1954 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			int n = Integer.parseInt(br.readLine());

			int[][] arr = new int[n][n];
			int num = 0;
			for(int p=n;p>=3;--p) {
				for (int k = 0; k < n; k++)
					arr[0][k] = ++num;

				for (int k = 1; k < n; k++)
					arr[k][n - 1] = ++num;

				for (int k = n - 2; k >= 0; --k)
					arr[n - 1][k] = ++num;

				for (int k = n - 2; k > 0; --k)
					arr[k][0] = ++num;
				--p;
				n=p;
			}

			System.out.println("#"+i);
			for(int p=0; p<n; p++){
				for(int k=0; k<n; k++){
					System.out.printf(arr[p][k]+" ");;
				}
				System.out.println();
			}
		}
	}
}
