package NHN;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class NHN_ex {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		String[][] names = new String[n+1][n+1];

		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++){
				names[i][j] = st.nextToken();
			}
		}
/*
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.printf(names[i][j]+" ");
			}
			System.out.println();
		}*/
		int checkW = w%(4*(n-1));//n*2+(n-2)*2 -> 4*(n-1)

		String store1;
		String store2;
		String temp = null;

		for(int i=0; i<n; i++){
			if(i==0) {
				for (int j = 0; j < n; j++) {
					temp = names[i][j];
					System.out.println("temp : " + temp);
					names[i][j] =names[i][j+1];
					System.out.printf(names[i][j] + " ");
				}
			}
			if(i==1){
				for(int k=n; k<0; k--){
					names[i][n] = temp;
					System.out.println("temp : " + temp);
					temp = names[i+1][k];
					System.out.printf(names[i][n] + " ");
				}
			}
			System.out.println();
		}

	}
}
