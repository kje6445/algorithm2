package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3142 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCases; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int unicon; //뿔이 1개
			int twincon; //뿔이 2개

			twincon = n / 2;
			unicon = m - twincon;

			int sum = twincon * 2 + unicon;


			while (sum != n) {
				--twincon;
				++unicon;
				sum = twincon * 2 + unicon;
			}

			System.out.println("#" + i + " " + unicon + " " + twincon);
		}
	}
}
