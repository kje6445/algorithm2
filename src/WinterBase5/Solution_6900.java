package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주혁이의 복권 당첨
public class Solution_6900 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			// n개 만큼의 8크기의 배열 개수와 맞췄을 때 갖는 수를 get
			for(int p=0; p<n; p++){

			}

			//m개의 주혁이가 얻을 수 있는 수를 받는다.
		System.out.printf("#"+i+" ");
		}
	}
}
