package WinterBase2.swAcademy2;

import java.util.Scanner;

//더블더블
public class Solution_2019 {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);

		int num = sc.nextInt();
		int check=1;

		for(int i=1; i<=num+1; i++){
			if (i == 1)
				System.out.printf(i+" ");
			else {
				check=check*2;
				System.out.printf(check + " ");
			}
		}

	}
}
