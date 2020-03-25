package SpringBase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

//배열의 분할
public class Solution_9015 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//배열이 같거나 증가하는 오름차순이 같거나 감소하는 내림차순으로 정렬
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			String[] numArr = br.readLine().split(" ");
			for(int k=0; k<n; k++){
				arr[k] = Integer.parseInt(numArr[k]);
			}

			int count =0;

			Stack<Integer> stack = new Stack<>();
			int pre = 0;
			boolean updown = true;//true면 오름차순, flase면 내림차순

			for(int k=0; k<n; k++){
				stack.push(arr[k]);
			}

			Stack<Integer> check = new Stack<>();
			for(int k=0; k<n; k++){
				int top = stack.pop();
				System.out.println("top "+top);
				if(check.empty()) {
					check.push(top);
				}else{
					pre = check.peek();
					System.out.println("pre "+pre);
					if(top!=pre){
						check.push(top);
					}
				}
			}
			for(int k=0; k<check.size(); k++){
				System.out.println(check.pop());
			}
			
			System.out.println("#"+i+" "+count);
		}
	}
}
