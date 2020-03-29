package esfSoft_2020;

public class Solution_3 {
	public static void main(String[] args) {

		int[] A = {1, 3, 1, 2};//

		System.out.print(solution(A));

	}
	public static int solution(int[] A) {
		int answer = 0;

		int start = 0;

		int[] N = new int[A.length];
		int[] check2 = new int[A.length];
		int[] Narr = new int[A.length - 1];
		int[] check = new int[A.length - 1];


		for (int i = 0; i < N.length; i++) {
			N[i] = A[i];
		}


		for (int i = 0; i < N.length-1; i++) {

				if (N[i]> N[i+1]) {
					check2[i] = 1;

				} else if (N[i] < N[i+1]) {
					check2[i] = 0;

				} else {
					break;
				}

		}
		int count2 = 0;

		for (int i = 0; i < check2.length-1; i++) {
			if (check2[i] != check2[i + 1]) {
				count2++;
			}
		}

		if (N.length % 2 == 0) { //짝수일 떄
			if (count2 == N.length / 2) {
				++answer;
			}
		} else {
			if ((count2 == N.length - 1) || (count2 == N.length - 2)) {
				++answer;
			}
		}

		if(answer>0){
			answer = 0;

			return answer;
		}

		else {

			answer =0;
			for (int p = 0; p < A.length; p++) {
				for (int i = 0; i < A.length; i++) {
					if (p == i) {
						N[i] = 0;
					} else {
						N[i] = A[i];
					}
				}

				int j = 0;
				for (int i = 0; i < N.length; i++) {
					if (N[i] != 0) {
						Narr[j] = N[i];
						j++;
					}

				}

				for (int i = 0; i < N.length - 1; i++) {

					if (i == 0) start = Narr[i];
					else {
						if (start > Narr[i]) {
							check[i] = 1;
						} else if (start < Narr[i]) {
							check[i] = 0;
						} else {
							break;
						}
					}
				}
				int count = 0;

				for (int i = 0; i < check.length - 1; i++) {
					if (check[i] != check[i + 1]) {
						count++;
					}
				}

				if (Narr.length % 2 == 0) { //짝수일 떄
					if (count == N.length / 2) {
						++answer;
					}
				} else {
					if ((count == Narr.length - 1) || (count == Narr.length - 2)) {
						++answer;
					}
				}
			}
			if (answer == 0) {
				answer = -1;
			}
			return answer;
		}

	}
}
