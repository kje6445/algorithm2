package SpringBase_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//세운이는 내일 할거야
public class Solution_8998 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//배열이 같거나 증가하는 오름차순이 같거나 감소하는 내림차순으로 정렬
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int homeworks = Integer.parseInt(br.readLine());

			int max = 0;
			// 2개 이상의 과제 동시에 하지 않는다.
			//max날 이후 부터 과제를 하고 싶음.
			for(int p=0; p<homeworks; p++){
				String[] words = br.readLine().split(" ");
				int days = Integer.parseInt(words[0]);
				int deadLine = Integer.parseInt(words[1]);
			}

			System.out.println("#"+i+" "+max);
		}
	}
}
