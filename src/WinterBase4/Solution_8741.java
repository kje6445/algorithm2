package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두문자어
public class Solution_8741 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String[] words = br.readLine().split(" ");
			char[] answer = new char[words.length];

			for (int p = 0; p < words.length; p++) {
				char[] word = words[p].toCharArray();
				answer[p] = (char) (word[0] - 32);
			}
			String finAnswer = String.valueOf(answer[0]);
			for (int p = 1; p < answer.length; p++) {
				finAnswer = finAnswer.concat(String.valueOf(answer[p]));
			}
			System.out.println("#" + i + " "+finAnswer);
		}
	}
}
