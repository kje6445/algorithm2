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
		String[] answer=new String[5]; // 문자열로 다시 만들어서 합치기
		String[] StoreMessages = {"Enter","Leave","Change"};
		String[] outMessages = {"님이 들어왔습니다.","님이 나갔습니다."};
		HashMap<String, List> messageCheck = new HashMap<>();

		for(int i=0; i<record.length; i++){
			String[] splitMessage = record[i].split(" ");
			System.out.println("record[i] : "+record[i]);
			String order = splitMessage[0];
			System.out.println("order: "+order);
			String id = splitMessage[1];
			System.out.println("id: "+ id);
			String nickName;
			if(splitMessage.length==3) {
				nickName = splitMessage[2];
				System.out.println("nickName: " + nickName);
			}else{
				nickName = null;
			}
			List listA = new ArrayList();
			listA.add(id);
			listA.add(nickName);


			//	System.out.println("listA.get(0): "+listA.get(0));
			//	System.out.println("listA.get(1): "+listA.get(1));


			messageCheck.put(order,listA);
		//	if(listA.get(1)!=null)//messageCheck의 listA의 get(1)로 닉네임 값을 호출해보기
		//		System.out.println("messageCheck의 닉네임: " +messageCheck.get("Enter").get(1));
		}
		for(int i=0; i<messageCheck.size(); i++){
			if(messageCheck.containsKey("Change")){
				String keepId = (String) messageCheck.get("Change").get(0);
				String changeName = (String) messageCheck.get("Change").get(1);
				System.out.println("changeId "+keepId+ " changeName "+ changeName);

				for(int k=0; k<messageCheck.size(); k++){
					if(messageCheck.get("Enter").get(0).equals(keepId) || messageCheck.get("Leave").get(0).equals(keepId)){
						//messageCheck.get("Enter").get(0).equals(keepId) 의 닉네임을 ChangeName으로 교체해 줄 것.
					}
				}
			}
		}
		if(messageCheck.containsKey("Enter")){// Prodo님이 들어왔습니다.
			answer= new String[]{messageCheck.get("Enter").get(1) + outMessages[0]};
			System.out.print("출력하기 : "+answer[0]);
		}
		if(messageCheck.containsKey("Leave")){
			answer= new String[]{messageCheck.get("Enter").get(1) + outMessages[1]}; // Prodo님이 나갔습니다.
		}

		//record 값을 마지막 배열까지 입력 받고 나서 알맞게 출력하도록한다.
		return answer;
	}
}
