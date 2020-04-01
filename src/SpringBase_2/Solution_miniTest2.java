package SpringBase_2;

import java.util.Arrays;

public class Solution_miniTest2 {

	public static void main(String[] args) {

		int[] answers = {1,2,3,4,5};
		System.out.print(Arrays.toString(solution(answers)));

	}
	public static int[] solution(int[] answer) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] score = new int[3];

		for(int i=0; i<answer.length; i++) {
			if(answer[i] == a[i%5]) {score[0]++;}
			if(answer[i] == b[i%8]) {score[1]++;}
			if(answer[i] == c[i%10]) {score[2]++;}
		}


		int max = Math.max(score[0], Math.max(score[1], score[2]));

		if(max == score[0] && max == score[1] && max == score[2])
			return new int[]{1,2,3};
		else if(max == score[0] && max == score[1])
			return new int[]{1,2};
		else if(max == score[0] && max == score[2])
			return new int[]{1,3};
		else if(max == score[1] && max == score[2])
			return new int[]{2,3};
		else if(max == score[0])
			return new int[]{1};
		else if(max == score[1])
			return new int[]{2};
		else
			return new int[]{3};
	}

}
