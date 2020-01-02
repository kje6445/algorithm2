package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//원재의 메모리 복구하기
public class Solution_1289 {
	public static void main(String[] args) throws IOException {
		//원래의 값이 주어지고 초기화된 값이 0밖에 없을 때
		//다시 원래의 값으로 돌아가는 방법을 구하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){

			String arr = br.readLine();
			char[] memoryArr = arr.toCharArray();
			/*for (int k = 0; k < memoryArr.length; k++) {
				System.out.printf(" "+memoryArr[k]);
			}*/
			int count = 0;
			//중간에 변조가 많이 일어나면 그 횟수대로 count해서 세어주면 된다.
			char first = memoryArr[0];
			for(int p=1; p<memoryArr.length-1; p++){
				if((memoryArr[p] != memoryArr[p+1]) || (memoryArr[1] != first)){
					++count;
				}
		//		System.out.println("p "+p);
			}
		//	System.out.println("count "+count);
			if(memoryArr[1] != first)
				++count;
			System.out.println("#"+i+" "+count);
		}

	}
}
