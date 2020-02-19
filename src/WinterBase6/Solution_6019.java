package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//기차 사이의 파리
public class Solution_6019 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//죽기 전 파리가 움직이는 거리
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());

			int timeGap = A+B;
			double fly = ((double) D/(double)timeGap);

			System.out.printf("#%d %.6f\n",i,fly*F);
		}
	}
}
