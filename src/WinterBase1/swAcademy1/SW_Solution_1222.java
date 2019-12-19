package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//[S/W 문제해결 기본] 6일차 - 계산기1
public class SW_Solution_1222 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=1; i<=10; i++){
			int num = Integer.parseInt(br.readLine());

			String[] arr =br.readLine().split("");
			int sum = 0;
			int[] answer = new int[(arr.length-1)/2+1];
			int p=0;
			for(int k=0; k<arr.length; k++){
				if(k%2==0) {
					answer[p] = Integer.parseInt(arr[k]);
					++p;
				}
			}

			for(int k=0; k<answer.length; k++){
				sum+=answer[k];
			}
			System.out.println("#"+i+" "+ sum);
		}
	}
}
