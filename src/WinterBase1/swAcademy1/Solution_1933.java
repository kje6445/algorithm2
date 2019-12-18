package WinterBase1.swAcademy1;

import java.util.Scanner;

//간단한 N 의 약수
public class Solution_1933 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i=1; i<=num; i++){
			if(num%i==0)
			System.out.printf(i+" ");
		}
	}
}
