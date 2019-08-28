package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] numbers = new int[100];
		numbers[1] = 1; //1을 넣을 경우 1가지(1)
		numbers[2] = 2; //2를 넣을 경우 2가지(1+1, 2)
		numbers[3] = 4; //3을 넣을 경우 3가지(1+1+1, 1+2, 2+1, 3)

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = 4; j <= num; j++) {
				numbers[j] = numbers[j - 1] + numbers[j - 2] + numbers[j - 3];
			}
			System.out.println(numbers[num]);
		}

	}
}
