package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1948 {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			String[] date = br.readLine().split(" ");

			int[] dates = Arrays.stream(date).mapToInt(Integer::parseInt).toArray();

			//dates[2]와 date[0]의 차이를 구해야한다.
			int distanceMon = dates[2] - dates[0];
			int checkMon = 0;
			int distanceDate = dates[3];

			int answer = 0;

			if(distanceMon>1) {
				for (int p = 1; p <= distanceMon; p++) {

				}
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
