package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//가랏! RC카!
public class Solution_1940 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i=1; i<=testCase; i++){
			int N = Integer.parseInt(br.readLine());

			int length = 0;
			st = new StringTokenizer(br.readLine());
			int[] first = new int[2];
			for(int p=0; p<2; p++)
				first[p] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int[] second = new int[2];
			for(int p=0; p<2; p++)
				second[p] = Integer.parseInt(st.nextToken());

			length = first[0]*first[1];

			System.out.println("#"+i+" "+length);
		}
	}
}
