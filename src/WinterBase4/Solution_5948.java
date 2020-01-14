package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//새샘이의 7-3-5 게임
public class Solution_5948 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		// 중복 방지를 위해서
		HashSet<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[7];

		for (int i = 1; i <= testCases; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int p = 0; p < 7; p++) {
				arr[p] = Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<7;j++){
				for(int k=j+1;k<7;k++){
					for(int z=k+1;z<7;z++)
						// 3개를 더한 값을 만들어 준다.
						// 중복 제거를 위해 set을 사용
						set.add(arr[j]+arr[k]+arr[z]);
				}
			}
			// 정렬을 위해 set의 자료들을 list로 만들어주기
			list.addAll(set);
			Collections.sort(list,Collections.reverseOrder());

			System.out.println("#" + i + " "+list.get(4));
		}
	}
}
