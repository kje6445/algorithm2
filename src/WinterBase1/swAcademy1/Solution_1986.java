package WinterBase1.swAcademy1;

import java.util.Scanner;

//지그재그 숫자
public class Solution_1986 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for(int i=0; i<testCase; i++){
			int num = sc.nextInt();
			int sum=0;

			for(int j=1; j<=num; j++){
				if(j%2==0){
					sum = sum-j;
				}else{
					sum = sum+j;
				}
			}

			System.out.println("#"+(i+1)+" "+sum);
		}
	}
}
