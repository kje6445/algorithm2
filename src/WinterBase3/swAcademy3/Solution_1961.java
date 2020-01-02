package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//숫자 배열 회전
public class Solution_1961 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=1; i<=testCase; i++){
			int num = Integer.parseInt(br.readLine());

			String[][] arr = new String[num][num];

			for(int m=0; m<num; m++){
				st = new StringTokenizer(br.readLine());
				for(int n=0; i<num; n++){
					arr[m][n] = st.nextToken();
				}
			}

			//90도, 180도, 270도 나눠서 돌리는 것을 구현해야함.
			// 입력받은 것을 concat() 함수를 이용하여 문제 풀이
			System.out.println("#"+i);
		}
	}
}
