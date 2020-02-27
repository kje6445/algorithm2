package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//석찬이의 받아쓰기
public class Solution_9317 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			String[] rightArr =   br.readLine().split("");
			String[] wrightArr = br.readLine().split("");

			int cnt = 0;
			for(int k=0; k<n; k++){
				if(rightArr[k].equals(wrightArr[k]))
					cnt++;
			}

			System.out.println("#"+i+" "+cnt);
		}
	}
}
