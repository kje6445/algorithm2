package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두가지 빵의 딜레마
public class Solution_5162 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String[] arr = br.readLine().split(" ");
			int A = 0, B = 0, C = 0;

			for (int p = 0; p < 3; p++) {
				if (p == 0) {
					A = Integer.parseInt(arr[p]);
				} else if (p == 1) {
					B = Integer.parseInt(arr[p]);
				} else {
					C = Integer.parseInt(arr[p]);
				}
			}

			int check = C / Math.min(A, B);

			System.out.println("#" + i + " " + check);
		}
	}
}
