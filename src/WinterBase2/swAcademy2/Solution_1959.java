package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1959 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			//들어가는 수는 3에서 20 이하
			String[] A = br.readLine().split(" "); //-부호까지 들어감
			String[] B = br.readLine().split(" ");
			int max=0;

			int[] aidx = new int[A.length];
			int[] bidx = new int[B.length];

			for(int p=0; p<A.length; p++){
				System.out.printf( A[p]+" ");
			}
			System.out.println("#"+ i+" "+max);
		}
	}
}
