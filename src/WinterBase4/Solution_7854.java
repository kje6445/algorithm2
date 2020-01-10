package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//최약수
public class Solution_7854 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;

			for(int p=1; p<=n; p++){
				int check = 0;
				for(int k=1; k<=p; k++){
					if(p%k==0){
						++check;
					}
				}
				if(check ==2){
					System.out.println("p "+ p);
					++count;
				}
			}
			System.out.println("#" + i+" "+count);
		}
	}
}
