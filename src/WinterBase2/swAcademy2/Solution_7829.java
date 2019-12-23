package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//보물왕 태혁
public class Solution_7829 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++) {
			int nums = Integer.parseInt(br.readLine()); // 약수의 개수
			String[] anotherNum = br.readLine().split(" "); //약수의 종류
			int[] anotherNums = Arrays.stream(anotherNum).mapToInt(Integer::parseInt).toArray();

			int answer =1;
			Arrays.sort(anotherNums);

			if(nums%2==1){ // 홀수일 경우
				if(nums ==1){
					answer = anotherNums[0] * anotherNums[0];
				}else{
					int middle = (nums-1)/2;
					answer = anotherNums[middle] * anotherNums[middle];
				}
			}else{
				answer = anotherNums[0]*anotherNums[nums-1];
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
