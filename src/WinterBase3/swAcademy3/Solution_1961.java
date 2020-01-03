package WinterBase3.swAcademy3;

import java.util.Scanner;

//숫자 배열 회전
public class Solution_1961 {

	static int[][] rotate(int a[][]){
		int i,j,n = a.length;
		int z[][] = new int[n][n];
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				z[i][j] = a[n-1-j][i];
			}
		}
		return z;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int num = sc.nextInt();
			int a[][] = new int[num][num];
			int i, j;
			for(i=0; i<num; i++) {
				for(j=0; j<num; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int b[][] = rotate(a);
			int c[][] = rotate(b);
			int d[][] = rotate(c);

			System.out.println("#"+t);

			for(i=0; i<num; i++) {
				for(j=0; j<num; j++) System.out.print(b[i][j]);
				System.out.print(" ");
				for(j=0; j<num; j++) System.out.print(c[i][j]);
				System.out.print(" ");
				for(j=0; j<num; j++) System.out.print(d[i][j]);
				System.out.println();
			}

		}
	}
}
