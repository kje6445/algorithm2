package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//수도 요금 경쟁
public class Solution_1284 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int P,Q,R,S,W;
		String arr;
		StringTokenizer st;
		int A, B;

		for(int i=1; i<=testCase; i++){
			st = new StringTokenizer(br.readLine());

			P=Integer.parseInt(st.nextToken());
			Q=Integer.parseInt(st.nextToken());
			R=Integer.parseInt(st.nextToken());
			S=Integer.parseInt(st.nextToken());
			W=Integer.parseInt(st.nextToken());

			A = P*W;

			if(W<=R){
				B = Q;
			}else{
				B = S*(W-R) + Q;
			}

			System.out.println("#"+i+" "+Math.min(A,B));
		}
	}
}
