package SpringBase_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class codility_BinaryGap {
	public static void main(String[] args){
		int N = 5;
		System.out.println(solution(N));
	}

	public static int solution(int N) {
		// write your code in Java SE 8
		ArrayList<Integer> binaryNumList = new ArrayList<>();

		while(N>0){
			binaryNumList.add(N%2);
			N/=2;
		}

		int binaryNumListSize = binaryNumList.size();
		int cntBinaryGap =0;
		int maxBinaryGap = 0;

		for(int i=binaryNumListSize-1; i>=0; i--){
			System.out.printf("i "+binaryNumList.get(i)+" ");
			if(binaryNumList.get(i) == 1){
				maxBinaryGap = maxBinaryGap(cntBinaryGap,maxBinaryGap);
			//	System.out.println("maxBinaryGap "+maxBinaryGap );
				cntBinaryGap = 0;
			}else{
				cntBinaryGap++;
			}
			System.out.println("maxBinaryGap "+maxBinaryGap );
		}

		return maxBinaryGap;
	}

	private static int maxBinaryGap(int cnt, int max){
		if(max<cnt){
			return cnt;
		}
		return max;
	}
}
