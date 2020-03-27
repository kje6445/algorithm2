package SpringBase_1;

import java.util.HashMap;

//완주하지 못한 선수
public class Solution_notFinishRun {
	public static void main(String[] args) {

		String[] participant = {"leo", "kiki", "eden"}; //참가자
		String[] completion = {"eden", "kiki"};//완주자

		System.out.print(solution(participant, completion));

	}
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		//getOrDefault -> 찾는 키가 존재한다면 찾는 키의 값을 반환, 없으면 기본값 반환
		for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
		//찾는 값이 player에 있다면 반환하고 value의 값을 하나 줄인다.
		for (String player : completion) hm.put(player, hm.get(player) - 1);

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0){ //찾는 값이 completion에 없었다면 없던 값을 answer에 입력한다.
				answer = key;
			}
		}
		return answer;
	}
}
