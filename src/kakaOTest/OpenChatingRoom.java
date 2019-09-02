package kakaOTest;



import java.util.HashMap;

public class OpenChatingRoom {
	public static void main(String[] args){

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

		String[] solution = solution(record);

		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
		}
	}

	public static String[] solution(String[] record){
		String[] answer={};
		String[] StoreMessages = {"Enter","Leave","Change"};
		HashMap<String, String[]> messageCheck = new HashMap<>();

		for(int i=0; i<record.length; i++){
			String[] testMessages = record[i].split(" ");
			messageCheck.put(testMessages[0], new String[]{testMessages[1], testMessages[2]});
		}

		if(StoreMessages[0].equals(messageCheck.get())){
			System.out.println(messageCheck.get()+"님이 들어왔습니다.");
		}
		//record 값을 마지막 배열까지 입력 받고 나서 알맞게 출력하도록한다.
		return answer;
	}
}
