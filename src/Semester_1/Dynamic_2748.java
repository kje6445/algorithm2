package Semester_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic_2748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int num){
		if(num==0||num==1)
			return num;
		num =  fibonacci(num-1) + fibonacci(num-2);
		return num;
	}
}
