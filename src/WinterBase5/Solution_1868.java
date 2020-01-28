package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//파핑파핑 지뢰찾기
public class Solution_1868 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//지뢰를 ‘*’로, 지뢰가 없는 칸을 ‘.’로, 클릭한 지뢰가 없는 칸을 ‘c’
		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			char[][] landMind = new char[n][n];

			for(int k=0; k<n; k++){
				char[] arr = br.readLine().toCharArray();
				for(int j=0; j<n; j++) {
					landMind[k][j] = arr[j];
				}
			}
			System.out.println("#"+i);
		}
	}
}
