package kakaOTest;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChatingRoom {
	public static void main(String[] args){

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

		String[] solution = solution(record);

		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
		}
	}

	public static <E> String[] solution(String[] record){
		String[] answer={}; // 문자열로 다시 만들어서 합치기
		String[] StoreMessages = {"Enter","Leave","Change"};
		String[] outMessages = {"님이 들어왔습니다.","님이 나갔습니다."};
		HashMap<String, List> messageCheck = new HashMap<>();

		for(int i=0; i<record.length; i++){
			String splitMessage = record[i];
			String order = splitMessage.split("")[0];
			String id = splitMessage.split("")[1];
			String nickName = splitMessage.split("")[2];

			List listA = new ArrayList();
			listA.add(id);
			listA.add(nickName);

			messageCheck.put(order,listA);

		}

		if(messageCheck.containsKey("Enter")){
			answer= new String[]{messageCheck.get(1) + outMessages[0]}; // Prodo님이 들어왔습니다.
		}
		if(messageCheck.containsKey("Leave")){
			answer= new String[]{messageCheck.get(1) + outMessages[1]}; // Prodo님이 나갔습니다.
		}
		if(messageCheck.containsKey("Change")){

		}
		//record 값을 마지막 배열까지 입력 받고 나서 알맞게 출력하도록한다.
		return answer;
	}
}
