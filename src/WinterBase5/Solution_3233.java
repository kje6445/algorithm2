package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//정삼각형 분할 놀이
public class Solution_3233 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//정삼각형의 최소의 개수를 구하여라 -> 규칙을 찾는 것이 관건
		for (int i = 1; i <= testCase; i++) {
			String[] arr = br.readLine().split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);

			//A의 한변의 길이에 B가 들어갈 수 있는 길이
			int oneSide = A / B;
			//등차수열로 값이 커진다.
			int count = 0;

			System.out.printf("#" + i + "");

		}
	}
}
