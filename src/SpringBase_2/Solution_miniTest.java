package SpringBase_2;

import java.util.Arrays;

//프로그래머스 모의고사 - 완전탐색
public class Solution_miniTest {

	public static void main(String[] args) {

		int[] answers = {1,2,3,4,5};
		System.out.print(solution(answers));

	}

	public static int[] solution(int[] answers) {
		int[] answer = {}; //가장 많이 맞춘 사람 출력

		//1번 수포자
		int[] person1 = {1,2,3,4,5};
		//2번 수포자
		int[] person2 = {2,1,2,3,2,4,2,5};
		//3번 수포자
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};

		boolean[] check1= new boolean[answers.length];
		boolean[] check2= new boolean[answers.length];
		boolean[] check3= new boolean[answers.length];

		int count1 =0;
		int count2 = 0;
		int count3 =0;

		for(int i=0; i<answers.length; i++){
			if(i>person1.length){

			}else{

			}
		}
		Arrays.sort(answer);
		return answer;
	}
}
