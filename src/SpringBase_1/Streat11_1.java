package SpringBase_1;

import java.io.IOException;
import java.util.*;

import static java.lang.Integer.*;

public class Streat11_1 {
	public static void main(String[] args) throws IOException {

		String S = "wreawerewa";
		String pattern ="ware";

		System.out.print((solution(S,pattern)));

	}

	public static int solution(String S, String pattern) {
		int answer = 0;

		String[] Sarr = S.split("");
		String[] patterns = pattern.split("");
		for(int i=0; i<patterns.length; i++){
			System.out.println(patterns[i]);
		}
		int[] check = new int[patterns.length];

		for(int i=0; i<patterns.length; i++){
				int idx = pattern.charAt(i);
		//		System.out.println(idx);
				check[i] = idx;
		}

		for(int i=0; i<Sarr.length-patterns.length+1; i++){
			String checkArr[] = new String[patterns.length];
			int checkIdx[] = new int[patterns.length];
			int count = 0;

			for(int j=0; j<patterns.length; j++){
				checkArr[j] = Sarr[j+i];
				checkIdx[j] = checkArr[j].charAt(0);
				System.out.println(checkIdx[j]);
			}
			Arrays.sort(checkIdx);
			for(int j=0; j<patterns.length; j++){
				int num = check[j];

				for(int k=0; k<patterns.length; k++){
					if(num == checkIdx[k]){
						++count;
					}
				}
			}

			if(count == patterns.length){
				++answer;
			}
		}
		return answer;
	}


}
