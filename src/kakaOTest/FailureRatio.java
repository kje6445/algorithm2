package kakaOTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FailureRatio {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//실패율 -> 스테이지에 도달했지만 클리어 못한 플레이어의 수/ 스테이지에 도달한 플레이어수
		int N = Integer.parseInt(br.readLine()); //스테이지 개수 1~500

		int[] stages = new int[N+1]; //현재 멈취있는 스테이지의 번호가 담긴 배열, N+1은 마지막까지 클리어한 사람
		//실패율이 같은 스테이지가 있다면 작은 번호부터 오도록. 스테이지에 도달한 유저 없는 경우
		//실패율 0

		for(int i=0; i<stages.length; i++){
			stages[i] = Integer.parseInt(br.readLine());
		}

		int[] solution = solution(N, stages);

		System.out.println(solution);
	}
	public static int[] solution(int N, int[] stages){
		int[] count = new int[N+1];
		for(int i=0; i<stages.length; i++){
			switch (stages[i]){
				case 1:
					++count[0];
				case 2:
					++count[1];
			}
		}
		int[] answer = stages;
		return answer;
	}
}
