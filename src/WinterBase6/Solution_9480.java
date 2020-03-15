package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//민정이와 광직이의 알파벳 공부
public class Solution_9480 {
	static int N;
	static String array[];
	static boolean check[];
	static int result;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//단어 세트에 26개의 소문자 모두 포함되어야함
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			N = Integer.parseInt(br.readLine()); //민정이가 아는 단어의 개수 N
			array = new String[N];
			check = new boolean[N];
			result = 0;
			for(int k =0; k<N; k++){
				array[k] = br.readLine();
			}
			powerset(0);
			System.out.println("#"+i+" "+ result);
		}
	}

	static void powerset(int idx){
		if(idx == array.length){
			int alphabet[] = new int[26];
			for(int i=0; i<N; i++){
				if(check[i]){
					for(int j=0; j<array[i].length(); j++){
						alphabet[array[i].charAt(j) - 'a'] = 1;
					}
				}
			}
			int alpha = 0;
			for(int i=0; i<26; i++){ // 알파벳 배열이 0이면 alpha = 1
				if(alphabet[i] == 0){
					alpha = 1;
				}
			}
			if(alpha == 0) result++; // result를 하나 올려준다.
			return;
		}
		if(!check[idx]) check[idx] = true;
		powerset(idx+1); //재귀적용법으로 문제 해결결
		check[idx] = false;
		powerset(idx+1);
	}
}
