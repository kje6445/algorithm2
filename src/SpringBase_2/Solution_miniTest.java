package SpringBase_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//프로그래머스 모의고사 - 완전탐색
public class Solution_miniTest {

	public static void main(String[] args) {

		int[] answers = {1,2,3,4,5};
		System.out.print(Arrays.toString(solution(answers)));

	}

	public static int[] solution(int[] answers) {

		//1번 수포자
		int[] person1 = {1,2,3,4,5};
		//2번 수포자
		int[] person2 = {2,1,2,3,2,4,2,5};
		//3번 수포자
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};

		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1,0);
		hm.put(2,0);
		hm.put(3,0);

		//정답 개수 Count
		for(int i =0; i<answers.length; i++){
			int num = answers[i];
			if(person1[i%5] == num) hm.replace(1,hm.get(1)+1);
			if(person2[i%8] == num) hm.replace(2,hm.get(2)+1);
			if(person2[i%10] == num) hm.replace(3,hm.get(3)+1);
		}

		//최대 값 구하기
		int max = hm.get(1);
		for(Integer val : hm.values()){
			if(val>max){
				max = val;
			}
		}
		//정답 리스트 형성
		ArrayList<Integer> answerList = new ArrayList<>();
		for(Integer key : hm.keySet()){
			if(hm.get(key) == max){
				answerList.add(key);
			}
		}

		//정렬 및 배열로 변환
		int[] answer = new int[answerList.size()]; //가장 많이 맞춘 사람 출력
		Collections.sort(answerList);
		for(int i = 0; i< answer.length; i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
