package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//간단한 압축 풀기
public class Solution_1946 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());

			System.out.println("#"+i);
			String[] balance = new String[10];
			int idx;

			for(int p=0; p<n; p++){
				StringTokenizer st = new StringTokenizer(br.readLine());

				String alphabet = st.nextToken();
				int check = Integer.parseInt(st.nextToken());

				for(int k = 0; k<check; k++){
					 balance[k] = alphabet;
				}

			}
		}
	}
}
