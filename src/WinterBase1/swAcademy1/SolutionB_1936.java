package WinterBase1.swAcademy1;

import java.util.Scanner;
import java.util.StringTokenizer;

//1대 1 가위바위보
public class SolutionB_1936 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		if(A>B){
			System.out.println('A');
		}else
			System.out.println('B');
	}
}
