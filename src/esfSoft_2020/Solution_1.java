package esfSoft_2020;

import java.util.Arrays;

public class Solution_1 {
	public static void main(String[] args) {

		int[] A = {3,8,2,3,3,2};

		System.out.print(solution(A));

	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int value = 0;
		int max=0;
		int check =1;
		int[] N = new int[100000];

		for(int i=0; i<N.length; i++){
			N[i] = 0;
		}

		for(int i=0; i<A.length; i++){
			int idx = A[i];
			++N[idx];
		}

		for(int i=0; i<N.length; i++){
			if(N[i]>=max){
				max = N[i];
				if(i> check){
					check = i;
				}
			}
		}
		value = check;
		if(check ==1){
			value = 0;
		}
		return value;
	}
}
