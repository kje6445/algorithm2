package kakaOTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChatingRoom {
	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

		String[] solution = solution(record);

		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
		}
	}

	public static <E> String[] solution(String[] record) {
		HashMap<Integer, List> messageCheck = new HashMap<>();
		int changeCheck = 0;
		String[] outMessages = {"님이 들어왔습니다.", "님이 나갔습니다."};

		for (int i = 0; i < record.length; i++) {
			String[] splitMessage = record[i].split(" ");
			String order = splitMessage[0];
			String id = splitMessage[1];
			String nickName;
			if (splitMessage.length == 3) {
				nickName = splitMessage[2];
			} else {
				nickName = null;
			}
			List listA = new ArrayList();
			listA.add(order);
			listA.add(id);
			listA.add(nickName);
			
			messageCheck.put(i, listA);
		}
		for (int i = 0; i < messageCheck.size(); i++) {
			if (messageCheck.get(i).get(0).equals("Change")) { //Change로 닉네임을 바뀐 Id가 같은 닉네임 전부 교체
				String keepId = (String) messageCheck.get(i).get(1);
				String changeName = (String) messageCheck.get(i).get(2);
				++changeCheck;

				for (int k = 0; k < messageCheck.size(); k++) { //change와 같은 id의 닉네임을 교체하기
					if (messageCheck.get(k).get(1).equals(keepId)) {
						List changeList = new ArrayList();
						changeList.add(messageCheck.get(k).get(0));
						changeList.add(messageCheck.get(k).get(1));
						changeList.add(changeName);
						messageCheck.put(k, changeList);
					}
				}
			}

			if (messageCheck.get(i).get(0).equals("Leave")) { //나갔다가 들어온 경우
				String keepId = (String) messageCheck.get(i).get(1);
				int fixIdx=0;
				if ((i+1)<=messageCheck.size() && messageCheck.get(i+1).get(1).equals(keepId) && messageCheck.get(i+1).get(0).equals("Enter")) {
					  fixIdx = i+1;
				}
				for (int k = 0; k < messageCheck.size(); k++) { //change와 같은 id의 닉네임을 교체하기
					if (messageCheck.get(k).get(1).equals(keepId)) {
						String changeName = (String) messageCheck.get(fixIdx).get(2);
						List changeList = new ArrayList();
						changeList.add(messageCheck.get(k).get(0));
						changeList.add(messageCheck.get(k).get(1));
						changeList.add(changeName);
						messageCheck.put(k, changeList);
					}
				}
			}

		}
		String[] answer = new String[(messageCheck.size()-changeCheck)];
		for(int i=0; i<(messageCheck.size()-changeCheck); i++){
			String answerSentanse = null;
			if(messageCheck.get(i).get(0).equals("Enter")) {
				answerSentanse = messageCheck.get(i).get(2) + outMessages[0];
			}
			if(messageCheck.get(i).get(0).equals("Leave")) {
				answerSentanse = messageCheck.get(i).get(2) + outMessages[1];
			}
			answer[i] = answerSentanse;
		}
		//record 값을 마지막 배열까지 입력 받고 나서 알맞게 출력하도록한다.
		return answer;
	}
}
