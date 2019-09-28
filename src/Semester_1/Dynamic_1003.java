package Semester_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic_1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		System.out.println(T);
		int[] nums = new int[T];
		int[] out = new int[2];

		for(int i=0; i<T; i++){
			nums[i] = Integer.parseInt(br.readLine());
			int k=0;


		}


	}

//	public static int fibonacci(int num) {
//		if(num==0||num==1){
//			return num;
//		}else{
//			return  fibonacci(num-1) +fibonacci(num-2);
//		}
//	}
//	public static int fibonacci(int num, int[] out){
//		if(num==0){
//			++out[0];
//			return fibonacci(num - 1) + fibonacci(num - 2);
//		}else if (num == 1){
//			++out[1];
//			return fibonacci(num - 1) + fibonacci(num - 2);
//		}else {
//			return fibonacci(num - 1) + fibonacci(num - 2);
//		}
//	}

}
