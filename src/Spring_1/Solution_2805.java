package Spring_1;

import java.io.*;

// 농작물 수확하기
public class Solution_2805 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());
		for(int i=1; i<=test; i++) {

			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];

			for(int p=0; p<n; p++) {
				String s = br.readLine();
				for(int q=0; q<n; q++) {
					map[p][q] = s.charAt(q)-'0';
				}
			}

			int ans = 0;
			int start = n/2;
			for(int p=0; p<n; p++) {
				if(p<=start) {
					int q = p*2+1;
					int s = start-p;
					while(q>0) {
						ans = ans+map[p][s];
						q = q-1;
						s = s+1;
					}
				}
				else {
					int s = p-start;
					int q = (start-s)*2+1;
					while(q>0) {
						ans = ans+map[p][s];
						q = q-1;
						s = s+1;
					}
				}
			}

			bw.write("#" + i + " " + ans + "\n");
		}

		bw.flush();
		bw.close();
	}
}
