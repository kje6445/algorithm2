package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_7576 {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());

		 int m = Integer.parseInt(st.nextToken());
		 int n = Integer.parseInt(st.nextToken());
		 System.out.println();
		 System.out.println("m: "+m+" n: "+n);
		 int[][] tomatoBox = new int[n][m];
		 System.out.println();
		 System.out.println("!m: "+m+" n: "+n);

		 for(int i=0; i<=n; i++){
		 	st = new StringTokenizer(br.readLine());
		 	for(int j=0; j<m; j++){
		 		tomatoBox[i][j] = Integer.parseInt(st.nextToken());
				System.out.println("i -> "+i+"  j -> "+j+" tomatoBox[i][j] -> "+ tomatoBox[i][j]);
			}
			 System.out.printf("i? "+i);
			 System.out.println( );
		 }

	}
}
