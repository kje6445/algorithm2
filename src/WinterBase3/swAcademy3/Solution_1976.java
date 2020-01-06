package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//시각 덧셈
public class Solution_1976 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] times = new int[4];

			for (int p = 0; p < 4; p++) {
				times[p] = Integer.parseInt(st.nextToken());
			}

			int hour = 0;
			int minute;

			minute = times[1] + times[3];

			if (minute >= 60) {
				++hour;
				minute = minute - 60;
			}

			hour = hour + times[0] + times[2];

			if (hour > 12) {
				hour = hour - 12;
			}
			System.out.println("#" + i + " " + hour + " " + minute);
		}
	}
}
