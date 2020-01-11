package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//연월일 달력
public class Solution_2056 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int lim[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int i = 1; i <= testCase; i++) {
			int ymd = Integer.parseInt(br.readLine());

			int year = ymd / 10000;
			int month = (ymd - year * 10000) / 100;
			int day = ymd % 100;

			if ((month < 1 || month > 12) || (day < 1 || day > lim[month - 1])) {
				System.out.println("#" + i + " -1");
			} else {
				System.out.printf("#%d %04d/%02d/%02d \n", i, year, month, day);
			}
		}
	}
}
