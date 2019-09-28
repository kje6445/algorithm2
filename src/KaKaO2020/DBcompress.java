package KaKaO2020;

import java.util.StringTokenizer;

public class DBcompress { // 스택으로 푸는 문제일것 같음
	public static void main(String[] args) {

		String s = "aabbaccc";
		System.out.println(solution(s));

	}
	public static int solution(String s) {
		int answer = 0;
		String alphabetLine;
		String arr[] = s.split("");

		int result =0;
		for(int i=0; i<arr.length; i++){
			System.out.println(" "+arr[i]);
		}

		for(int i=0; i<arr.length; i++){
			if(arr.length % i == 0) {
			/*	String[] arr2 = s.substring(0,i);
				for (int j = 0; j < arr2.length; j++)
					System.out.println("j : " + j + " arr2[j]: " + arr2[j]);*/
			}
		}
		return answer;
	}

	static int check(String[] arr){ // 다음 문자랑 같은지 다른지를 비교하는 코딩
		int result=0;
		String[] arrAlphabetLine = arr;
		String[] checkArr = new String[arr.length];
		String alphabetString;


		return result;
	}
}
