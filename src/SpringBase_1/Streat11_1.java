package SpringBase_1;

import java.io.IOException;
import java.util.*;

import static java.lang.Integer.*;

public class Streat11_1 {
	public static void main(String[] args) throws IOException {

		String S = "aaaaaa"; //wreawerewa
		String pattern ="a"; //ware

		System.out.print((solution(S,pattern)));

	}

	public static int solution(String S, String pattern) {
		int answer = 0;

		String[] Sarr = S.split("");
		int[] alphabet = new int[26];
		int plength = pattern.length();

	//	for(int i=0; i<26; i++){
	//		alphabet[i] = 0;
	//	}

		Zero(alphabet);

		for(int i=0; i<plength; i++){
			int idx = pattern.charAt(i);
			++alphabet[idx-97];
		}

		int[] check = new int[26];

		for(int i=0; i<S.length()-plength+1; i++){
			String[] sample = new String[plength];
			for(int j=0; j<plength; j++){
				sample[j] = Sarr[i+j];
			}

		//	for(int j=0; j<26; j++){
		//		check[j] = 0;
		//	}

			Zero(check);
			
			for(int k =0; k<plength; k++){
				int idx =sample[k].charAt(0);
				System.out.println("idx "+idx);
				++check[idx-97];
			}


			int finalCheck = 0;

			for(int p=0; p<26; p++){
				if((check[p] == alphabet[p])&&(check[p]!=0)){
					System.out.println("p "+p);
					++finalCheck;
				}
			}
			System.out.println("finalCheck "+finalCheck);
			System.out.println("------------");
			if(finalCheck == plength){
				++answer;
			}
		}
		return answer;
	}

	public static int[] Zero(int[] arr){

		for(int i=0; i<arr.length; i++){
			arr[i] =0;
		}

		return  arr;
	}
}
