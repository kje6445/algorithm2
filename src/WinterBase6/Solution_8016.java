package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//홀수 피라미드
public class Solution_8016 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int line = Integer.parseInt(br.readLine());

			int countLine = line*2+1;
			int totalCount = (line-1)*(line-1);
			int beforeLine = totalCount+2;
			int last = (beforeLine)+(countLine-1)*2;

			System.out.println("totalCount "+totalCount);
			System.out.println("#"+i+" "+beforeLine+" "+last);
		}
	}
}
