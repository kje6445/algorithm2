package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++){
			arr[0] = Integer.parseInt(st.nextToken());
		}

		//연속된 몇 개의 수를 선택해서 최대의 수를 구하는 것. 수는 한 개 이상이여야 한다.
		//생각 해 볼 점 -> 몇 개 이상을 선택해야 가장 큰 수가 될 수 있을 까.
		//매번 값을 저장해하는 것인가?
	}
}
