package SpringBase_1;

//타켓 넘버
public class Solution_tagetNum {
	static  int answer = 0;
	static  int k=0;
	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		System.out.print(solution(numbers, target));

	}

	public static int solution(int[] numbers, int target) {
		dfs(numbers,target,0);
		return answer;
	}

	public static void dfs(int[] numbers, int target, int node){ //node -> 인덱스랑 같은 원리
		if(node == numbers.length){ //-> numbers의 길이랑 같아지면 stop
			int sum =0;
			for(int num : numbers){
				sum += num;
			}
			if(sum == target){
				System.out.println("k "+k);
				answer++;
				k++;
			}
		}else{
			numbers[node] *=1; //-> 플러스로 생각해서 계산하기
	//	System.out.println("node + => "+node);
	//		System.out.println("numbers[node] "+numbers[node]);
			dfs(numbers,target,node+1);

			numbers[node] *= -1; //-> 마이너스로 생각해서 계산하기
	//		System.out.println("node - =>"+node);
	//		System.out.println("numbers[node] "+numbers[node]);
			dfs(numbers,target,node+1);
		}
	}

}
