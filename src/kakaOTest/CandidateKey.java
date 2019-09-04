package kakaOTest;


public class CandidateKey {
	public static void main(String[] args) {
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},
				{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};

		System.out.println(solution(relation));
	}

	public static int solution(String[][] relation) {
		//후보키를 이용하여 원하는 값이 하나만 출력하게 된다면 answer의 값을 1 증가시킨다.
		int answer = 0;
		String[][] testRelation = new String[5][4] ;
		for(int i=0; i<5; i++){ //testRelation에 정보 입력하기
			if(i==0){
					String[] put = new String[]{"학번", "이름", "전공", "학년" };
				for(int k=0; k<4; k++){
					testRelation[i][k] = put[k];
				}
			}else {
				for (int k = 0; k < 4; k++) {
					testRelation[i][k] = relation[i-1][k];
				}
			}
		}
		String[][] findkey1 = new String[1][4]; // findkey1로 키를 한번에 찾을 수 있다면 한번에 찾을 수 있도록 저장되어 있는 것을 findkey2에 적용할 필요가 없다.
		for(int i=0; i<relation.length; i++) {

		}
		String[][] findkey2 = new String[4][4];
		return answer;
	}
}
