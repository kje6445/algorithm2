package Final1;

import java.util.Scanner;

public class srot1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] v = {{1,4}, {3,4},{3,10}};
		System.out.print(solution(v));
	}

		 static int[] solution(int[][] v) {
			// x가 같을 때, y가 같을 때
			 int x=0; int y=0;
			 int sX=0; int sY=0;
			 for(int i=0; i<3; i++){
			 		x = v[i][0];
			 		y = v[i][1];
			 }
			System.out.println("v[0][0] "+ v[0][0]+"v[0][1] "+v[0][1]);
			int[] answer = {};
			return answer;
		}

}
