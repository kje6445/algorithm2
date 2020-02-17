package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//성공적인 공연 기획
public class Solution_4789 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		//특정 수 넘지 않으면 절대 기립 박수를 치지 않는다.
		//모든 관객이 기립 박수를 하게 하려면 최소 몇 명의 사람을 고용해야 하는지
		for (int i = 1; i <= testCase; i++) {
			String[] arr = br.readLine().split(" ");
			int[] people = new int[arr.length];

			for(int p=0; p<people.length; p++)
				people[p] = Integer.parseInt(arr[p]);

			int mincnt = 0;

			System.out.printf("#"+i+" ");
		}
	}
}
