package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//준환이의 운동관리
public class Solution_3431 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int i=0; i<T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int U = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());

			System.out.printf("#"+(i+1)+" ");
			if(X<L){
				System.out.println(L-X);
			}else if((L<=X)&&(X<=U)){
				System.out.println("0");
			}
			else{
				System.out.println("-1");
			}
		}
	}
}
