package Semester_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2983 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		char[] pattern = br.readLine().toCharArray();


		for(int i=0; i<k; i++){
			switch (pattern[i]){
				case 'A':

				case 'B':
				case 'C':
				case 'D':
			}
		}
	}
}
