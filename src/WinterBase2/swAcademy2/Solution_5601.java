package WinterBase2.swAcademy2;

import java.util.Scanner;
//[Professional] 쥬스 나누기
public class Solution_5601 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for(int i=1; i<=testCase; i++){
			int num = sc.nextInt();

			int denominator = num;
			int numerator = 1;

			System.out.printf("#"+i);

			for(int k=0; k<testCase; k++){
				System.out.printf(" "+numerator+"/"+denominator);
			}
		}
	}
}
