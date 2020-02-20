package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//문제 제목 붙이기
public class Solution_7087 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int num = Integer.parseInt(st.nextToken());
			String[] words = new String[num];

			for (int p = 0; p < num; p++) {
				words[p] = br.readLine();
			}

			char[] firstWord = new char[num];

			for (int p = 0; p < num; p++) {
				firstWord[p] = words[p].charAt(0);
			}

			Arrays.sort(firstWord);

			int cnt = 0;
			int check = 65;
			for (int p = 0; p < num; p++) {
				if (check == (int)firstWord[p]) {
					++cnt;
					++check;
				}
			}

			System.out.println("#" + i + " " + cnt);
		}
	}
}
