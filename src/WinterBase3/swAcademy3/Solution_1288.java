package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//새로운 불면증 치료법
public class Solution_1288 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int n;
		int[] arr = new int[10];

		for(int i=1; i<=testCase; i++){
			n=Integer.parseInt(br.readLine());
			int mincheck=0;

			for(int p=0; p<n; p++){
				++mincheck;
			}

			System.out.println("#"+i+" "+mincheck);

			for(int k=0; k<10; k++)
				arr[k] = 0;
		}
	}
}
