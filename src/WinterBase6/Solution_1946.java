package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//간단한 압축 풀기
public class Solution_1946 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int num = Integer.parseInt(br.readLine());

			String[][] arr = new String[num][10];
			int checkPost = 0;
			int checkPast = 0;

			for (int k = 0; k < num; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String first = st.nextToken();
				int count = Integer.parseInt(st.nextToken());

				if (checkPost < 10) {
					checkPast = 10 - checkPost;
					if (checkPast >= count) {
						for (int p = checkPast; p < checkPast+count; p++) {
							arr[k][p] = first;
						}
					}else{

					}
				}

				if (count < 10) {
					checkPost = count;
				}
			}

			System.out.println("#"+i);
			for(int j=0; j<num; j++){
				for(int y=0; y<10; y++){
					System.out.printf(arr[j][y]);
				}
				System.out.println("");
			}

		}
	}
}
