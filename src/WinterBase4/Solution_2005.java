package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//파스칼의 삼각형
public class Solution_2005 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());

			System.out.println("#"+i);

			for(int p=0; p<n; p++){
				if(p==0)
					System.out.println("1");
				else {
					System.out.printf("1");
					for (int k = 0; k < p-1; k++) {
						System.out.printf(" "+p);
					}
					System.out.println(" 1");
				}
			}

		}
	}
}
