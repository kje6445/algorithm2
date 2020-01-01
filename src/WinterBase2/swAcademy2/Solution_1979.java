package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//어디에 단어가 들어갈 수 있을까
public class Solution_1979 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int N, K;

		for(int i=1; i<=testCase; i++){
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			int count = 0;

			String sub;
			String subNext="1";

			for(int j=0; j<K-1; j++){
				subNext = subNext.concat(" 1");
			}
			System.out.println("subNext "+subNext);

			for(int p=0; p<N; p++){
				String arr = br.readLine();

				System.out.println("arr "+arr);

				for(int v=0; v<=N-K; v++){
					sub = arr.substring(v,v+K+2);
					System.out.println("sub "+ sub);
					if(sub.equals(subNext)){
						++count;
						break;
					}
				}

			}
			System.out.println("#"+i+" "+count);
		}
	}
}
