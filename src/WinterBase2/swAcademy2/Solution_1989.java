package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//초심자의 회문 검사
public class Solution_1989 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=0; i<testCase; i++){
			String[] word = br.readLine().split(" ");
			boolean palindrome = true;
			int middle, size;
			int length = word.length;

			if(word.length%2==1){
				middle = (word.length-1)/2; //인덱스 값
				size = word.length-middle;
				String[] word2 = new String[size];

				for(int p=0; p<word2.length; p++){
					word2[p] = word[p];
				}

				for(int k=0; k<word.length; k++){
					if(word2[k] != word[length]) {
						palindrome = false;
						break;
					}
					length--;
				}

			}else{
				middle = word.length/2;
				size = word.length-middle;
				String[] word2 = new String[size];

				for(int p=0; p<word2.length; p++){
					word2[p] = word[p];
				}

				for(int k=0; k<word.length; k++){
					if(word2[k] != word[length]) {
						palindrome = false;
						break;
					}
					length--;
				}

			}
			System.out.printf("#"+i+" "+palindrome);
		}
	}
}
