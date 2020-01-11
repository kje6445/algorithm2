package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//연월일 달력
public class Solution_2056 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String nums = br.readLine();
			String year = nums.substring(0, 4);
			String month = nums.substring(4, 6);
			String date = nums.substring(6, 8);

			String answer = year;
			answer = answer.concat("/");
			answer = answer.concat(month);
			answer = answer.concat("/");
			answer = answer.concat(date);


			if (month.equals("02")) {
				if ((Integer.parseInt(date) > 28) && (Integer.parseInt(date) < 1)) {
					answer = "-1";
				}
			} else if ((month.equals("01")) || (month.equals("03")) || (month.equals("05")) || (month.equals("07")) || (month.equals("08")) || (month.equals("10")) || (month.equals("12"))) {
				if ((Integer.parseInt(date) > 31) && (Integer.parseInt(date) < 1)) {
					answer = "-1";
				}
			} else if ((month.equals("04")) || (month.equals("06")) || (month.equals("09")) || (month.equals("11"))) {
				if ((Integer.parseInt(date) > 30) && (Integer.parseInt(date) < 1)) {
					answer = "-1";
				}
			} else {
				answer = "-1";
			}


			System.out.println("#" + i + " " + answer);
		}
	}
}
