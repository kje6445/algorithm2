package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//민정이와 광직이의 알파벳 공부
public class Solution_9480 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//단어 세트에 26개의 소문자 모두 포함되어야함
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int N = Integer.parseInt(br.readLine()); //민정이가 아는 단어의 개수 N
			int count = 0; //민정이가 만들 수 있는 서로 다른 단어의 세트
			int[] alphabet = new int[27];

			for(int k=0; k<alphabet.length; k++){
				alphabet[k] = 0;
			}

			for(int p=0; p<N; p++){
				String word = br.readLine(); //민정이가 아는 단어 입력
				char[] charArray = word.toCharArray();

				for(int k=0; k< charArray.length; k++) {
					char check = charArray[k];
					int idx = (int)(check)- 97;
					alphabet[idx]++;
				}
			}

			int min = 0;
			for(int k=0; k<alphabet.length; k++){
				if(min>alphabet[k])
					min = alphabet[k];
			}

			for(int k=0; k<alphabet.length; k++) {
				System.out.println("alphabet[k] "+alphabet[k]);
			}
			System.out.println("#"+i+" "+min);
		}
	}
}
