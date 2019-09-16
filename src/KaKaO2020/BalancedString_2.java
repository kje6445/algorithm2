package KaKaO2020;

import java.util.Stack;

public class BalancedString_2 {
	public static void main(String[] args) {

		String p = ")(()";

		System.out.println(solution(p));

	}

	static String solution(String p) {
		String result = p;
		int length=p.length(), countL=0, countR=0;
		boolean status = true;   // true = 올바른 // false = 균형잡힌



		if(p.equals("") || p==null)   // 빈 문자열이면 return
			return p;

		if(isCorrect(p))         // 올바른 문자열이면  return
			return p;

		for(int i=0; i<length; i++) {
			if(p.charAt(i)=='(')
				countL++;
			else if(p.charAt(i)==')')
				countR++;
		}

		if(countL != countR)      // 틀린문자열이면 xxxxx
			return "안맞는다고";


		p = toCorrect(p);         // 고치기

		return p;
	}

	static String toCorrect(String w) {         //  문자열 u v 로 나눠주기
		int countL=0, countR=0, length = w.length();
		String result = "";

		for(int i=0; i<length; i++) {
			if(w.charAt(i)=='(')
				countL++;
			else if(w.charAt(i)==')')
				countR++;

			if(countL==countR) {
				result = toCorrect(w.substring(0,i+1), w.substring(i+1));
				break;
			}
		}

		return result;
	}
	static String toCorrect(String u, String v) {   // u, v 올바른으로 고치기
		String result="";
		int length=u.length();

		if(isCorrect(u)) {         // u가 옳바른 문자열이면 v정리하고 붙이기
			if(v.equals(""))      // 근데 v가 빈문자열이면 그냥 return 하자
				return u+v;
			return u+toCorrect(v);
		}


		// u가 옳바른 문자열이 아니면
		result += '(';
		result += toCorrect(v);
		result += ')';

		for(int i=1; i<length-1; i++) {   // 첫번째 마지막 문자 떼고 괄호방향 반대
			if(u.charAt(i)=='(')
				result+=')';
			else
				result+='(';
		}


		return result;
	}


	static boolean isCorrect(String p) {      // 옳은 문자열인지 체크
		Stack<Character> stack = new Stack();
		int length = p.length();

		for(int i=0; i<length; i++) {
			if(p.charAt(i)=='('){
				stack.push('(');
			}
			else if(p.charAt(i)==')'){
				if(stack.isEmpty()==false && stack.peek()=='(')
					stack.pop();
				else
					return false;
			}
			else
				return false;
		}

		if(stack.isEmpty())
			return true;

		return false;
	}

}
