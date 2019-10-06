package Semester_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int member = Integer.parseInt(st.nextToken());

		int[] arr = new int[member+1];

		for(int i=1; i<arr.length; i++){
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//for(int i=0; i<arr.length; i++){
		//	System.out.printf(arr[i]+" ");
	//	}

		Arrays.sort(arr);

		int complaint =0;
		for(int i=1; i<arr.length; i++){
			if(i>=arr[i])
			complaint = complaint + i -arr[i];
			else
				complaint =complaint +  arr[i] - i;
		}

		System.out.println(complaint);
	}
}
