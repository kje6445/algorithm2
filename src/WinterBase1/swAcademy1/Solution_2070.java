package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//큰 놈, 작은 놈, 같은 놈
public class Solution_2070 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=0; i<testCase; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.printf("#"+(i+1)+" ");
			if(a>b){
				System.out.println(">");
			}else if(a<b){
				System.out.println("<");
			}else{
				System.out.println("=");
			}
		}
	}
}
