package KaKaO2020;

import java.util.StringTokenizer;

public class DBcompress { // 스택으로 푸는 문제일것 같음
	public static void main(String[] args) {

		String s = "aabbaccc";
		System.out.println(solution(s));

	}
	public static int solution(String s) {
		int answer = 0;
		String alphabetLine = s;
		String arr[] = new String[alphabetLine.length()];
		arr =alphabetLine.split("");


		for(int i=0; i<arr.length; i++){
			System.out.println(" "+arr[i]);
		}
		return answer;
	}
}
