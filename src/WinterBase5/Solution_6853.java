package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//직사각형과 점
public class Solution_6853 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//각각의 상태인 점이 몇 개씩 있는지 구하는 프로그램
		for (int i = 1; i <= testCase; i++) {
			String[] xys = br.readLine().split(" ");
			int aX = Integer.parseInt(xys[0]);
			int aY = Integer.parseInt(xys[1]);
			int bX = Integer.parseInt(xys[2]);
			int bY = Integer.parseInt(xys[3]);

			int num = Integer.parseInt(br.readLine());

			System.out.printf("#"+i+" ");

		}
	}
}
