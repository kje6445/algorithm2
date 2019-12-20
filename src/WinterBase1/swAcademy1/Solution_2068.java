package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//최대수 구하기
public class Solution_2068 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=0; i<testCase; i++){
			String[] total = br.readLine().split(" ");
			int[] arr = Arrays.stream(total).mapToInt(Integer::parseInt).toArray();

			int max =arr[0];
			for(int p=0; p<10; p++){
				if(max<arr[p])
					max = arr[p];
			}

			System.out.println("#"+(i+1)+" "+max);
		}

	}
}
