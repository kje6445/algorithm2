package Semester_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic_2748_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long[] list = new long[n+1];

		list[0] = 0;
		list[1] = 1;

		for(int i=2; i<list.length;i++){
			list[i] = list[i-2] + list[i-1];
		}

		System.out.println(list[n]);
	}
}
