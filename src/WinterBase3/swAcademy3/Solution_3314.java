package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//보충학습과 평균
public class Solution_3314 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] arrA = new String[5];
			for(int k=0; k<5; k++)
				arrA[k] = st.nextToken();

			int[] score = new int[5];

			for(int k=0; k<5; k++)
				score[k] = Integer.parseInt(arrA[k]);

			for(int k=0; k<5; k++){
				if(score[k]<40)
					score[k] = 40;
				sum += score[k];
			}
			System.out.println("#"+i+" "+sum/5);
		}
	}
}
