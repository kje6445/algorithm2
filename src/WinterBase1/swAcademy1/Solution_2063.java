package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 중간값 찾기
public class Solution_2063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[num];

		for(int i=0; i<num; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		int middle = (arr.length-1)/2;

		System.out.println(arr[middle]);
	}
}
