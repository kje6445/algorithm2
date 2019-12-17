package WinterBase1.swAcademy1;

import java.util.Scanner;

//자릿수 더하기
public class SolutionE_2058 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();
		String[] Nsplit = N.split("");
		int sum =0;

		for(int i = 0; i<Nsplit.length; i++){
			sum += Integer.parseInt(Nsplit[i]);
		}

		System.out.println(sum);

	}
}
