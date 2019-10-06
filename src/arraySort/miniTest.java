package arraySort;

public class miniTest {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] answer = solution(answers);
		for(int i=0; i<answer.length; i++)
		System.out.println(answer[i]);
	}

	public static int[] solution(int[] answers) {
		int[] answer = new int[4];
		int[] math1 = {1,2,3,4,5};
		int[] math2 = {2,1,2,3,2,4,2,5};
		int[] math3 = {3,3,1,1,2,2,4,4,5,5};
		
		int count1 =0; int count2 =0; int count3 = 0;

		for(int i=0; i<answers.length; i++){
			if(answers[i]==math1[i]){
				count1++;
			}
			if(answers[i]==math2[i]){
				count2++;
			}
			if(answers[i]==math3[i]){
				count3++;
			}
		}
		int check = Math.max(Math.max(count1,count2),Math.max(count2,count3));
		System.out.println("check "+ check);
		return answer;
	}

}
