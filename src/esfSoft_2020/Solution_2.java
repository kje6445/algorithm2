package esfSoft_2020;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2 {
	public static void main(String[] args) {

		int[] A = {51,71,17,42};//

		System.out.print(solution(A));

	}

	public static int solution(int[] A) {
		Arrays.sort(A);
	//	for(int i=0; i<A.length; i++){
	//		System.out.printf(A[i]+" ");
	//	}
		System.out.println();

		int answer =0;
		int sum=0;
		int max =0;
		int N[] = new int[A.length];

		for(int i=0; i<N.length; i++){
			String str = String.valueOf(A[i]);
			String[] arr = str.split("");

			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);

			N[i] = num1+num2;
		}

	//	for(int i=0; i<N.length; i++){
	//		System.out.printf(N[i]+" ");
	//	}

	//	System.out.println();

		for(int i=0; i<N.length; i++){
			for(int j=i+1; j<N.length; j++){
				if(N[i] == N[j]){
					sum = A[i] + A[j];
					if(sum>max){
						max = sum;
		//				System.out.println("i "+i+" j "+j+" max "+max);
					}
				}
			}
		}

		if(max ==0){
			answer = -1;
		}else{
			answer = max;
		}
		return answer;
	}
}
