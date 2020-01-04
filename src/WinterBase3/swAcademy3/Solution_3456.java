package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
//직사각형 길이 찾기
public class Solution_3456 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = parseInt(br.readLine());

		for(int i=1;i<=testCase;i++){
			String arr = br.readLine();
			String[] nums = arr.split(" ");

			int a=0,b=0,c=0;
			 a = Integer.parseInt(nums[0]);
			 b = Integer.parseInt(nums[1]);
			 c = Integer.parseInt(nums[2]);

			int answer = 0;

			if(a == b){
				answer = c;
			}else if( a==c){
				answer = b;
			}else{
				answer = a;
			}

			System.out.println("#"+i+" "+answer);
		}
	}
}
