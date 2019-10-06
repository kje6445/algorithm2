package Semester_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_3047 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[3];
		int first = 0;
		int second =0;
		int third =0;

		for(int i=0; i<3; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		String str = br.readLine();

		for(int i=0; i<3; i++){
			char c = str.charAt(i);

			if(c == 'A')
				System.out.printf(arr[0] +" ");
			if(c == 'B')
				System.out.printf(arr[1] + " ");
			if(c == 'C')
				System.out.println(arr[2]);
		}

		br.close();
	}
}
