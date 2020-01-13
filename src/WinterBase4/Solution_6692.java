package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다솔이의 월급 상자
public class Solution_6692 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCases; i++) {
			int T = Integer.parseInt(br.readLine());
			double[][] persnet= new double[T][2];

			for(int p =0; p<=T; p++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				persnet[p][0] = Double.parseDouble(st.nextToken());
				persnet[p][1] = Double.parseDouble(st.nextToken());
			}
			System.out.printf("#"+i);
		}
	}
}
