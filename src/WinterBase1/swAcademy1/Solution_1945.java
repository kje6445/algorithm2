package WinterBase1.swAcademy1;

import java.io.IOException;
import java.util.Scanner;

//간단한 소인수분해
public class Solution_1945 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		for (int i = 1; i <= testcase; i++) {
			int num = sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;

			while (num % 2 == 0) {
				num = num / 2;
				a++;
			}

			while (num % 3 == 0) {
				num = num / 3;
				b++;
			}
			while (num % 5 == 0) {
				num = num / 5;
				c++;
			}
			while (num % 7 == 0) {
				num = num / 7;
				d++;
			}
			while (num % 11 == 0) {
				num = num / 11;
				e++;
			}
			System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e);
		}
	}
}

