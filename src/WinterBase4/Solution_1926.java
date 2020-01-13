package WinterBase4;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//간단한 369게임
public class Solution_1926 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		String[] arr = new String[testCase];
		for (int i = 1; i <= testCase; i++) {
			arr[i - 1] = String.valueOf(i);
		}

		for (int i = 0; i < testCase; i++) {
			int length = arr[i].length();
			int[] arrNum = new int[length];
			String[] arrString = arr[i].split("");

			for (int p = 0; p < length; p++) {
				arrNum[p] = Integer.parseInt(arr[i]);
			}
			int count = 0;
			for (int j = 0; j < length; j++) {
				if ((arrNum[j]==3)||(arrNum[j]==6)||(arrNum[j]==9)) {
					++count;
					for (int k = 0; k < count; k++) {
						System.out.printf("-");
					}
					System.out.printf(" ");
				}
			}
			System.out.printf((i + 1) + " ");

			count = 0;
		}
	}
}
