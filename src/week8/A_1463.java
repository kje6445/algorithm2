package week8;

import java.util.Scanner;

public class A_1463 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		while (n != 1) {
			if (n % 3 == 0) {
				n = n/3;
				System.out.println("1n " + n);
				count++;
			} else{
				n = n - 1;
				System.out.println("3n " + n);
				count++;
			}
			 if (n % 2 == 0) {
				n = n/2;
				System.out.println("2n " + n);
				count++;
			}
		}

		System.out.println(count);

	}
}
