package KaKaO2020;

import java.util.Stack;

public class BalancedString { //스택으로 풀려고 했으나 문자열로 풀어야 될 것 같음
	public static void main(String[] args) {
		String p = "(()())()";

		for(int i=0; i<p.length(); i++) {
			System.out.print(solution(p));
		}
	}
	public static String solution(String p) {
		String answer = "";
		Stack<Character> alrightStack = new Stack<Character>();
		Stack<Character> balancedStack = new Stack<Character>();
		boolean succ = true;
		int right =0; int left =0;
		for(int i=0; i<p.length(); i++){
			char c = p.charAt(i);

			if(c == '('){
			//	alrightStack.push(')');
				right++;
			}else{
				/*if(alrightStack.isEmpty()){
					succ = false;
					break;
				}
				alrightStack.pop();*/
				left++;
			}
		}

		if(right==left){
			System.out.println("올바른 문자열입니다.");
		}
		return answer;
	}
}
