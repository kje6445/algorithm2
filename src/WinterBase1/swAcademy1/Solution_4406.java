package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//모음이 보이지 않는 사람
public class Solution_4406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<num; i++){
			char[] words = br.readLine().toCharArray();


			for(int k=0; k<words.length; k++){
				if((words[k]=='a')||(words[k]=='e')||(words[k]=='i')||(words[k]=='o')||(words[k]=='u')){
					words[k]=' ';
				}
			}

			System.out.printf("#"+(i+1)+" ");

			for(int p=0; p<words.length; p++){
				if(words[p]!=' ')
				System.out.printf(String.valueOf(words[p]));
			}

			System.out.println("");
		}
	}
}