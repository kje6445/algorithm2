package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//나는 개구리로소이다
public class Solution_5550 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		// ‘c’, ‘r’, ‘o’, ‘a’, ‘k’만 이뤄져있다.
		// 개구리의 최소 수를 출력하시오 개구리는 “croak”게 운다.
		for (int i = 1; i <= testCase; i++) {
			String ribbit = br.readLine();
			char[] ribbitArr = ribbit.toCharArray();

			int[] count = new int[5];
			int wordCheck =0;

			for(int p=0; p<count.length; p++)
				count[p] = 0;

			for(int p=0; p<ribbitArr.length; p++){
				if(ribbitArr[p] == 'c'){
					++count[0];
				}else if(ribbitArr[p] == 'r'){
					++count[1];
				}else if(ribbitArr[p] == 'o'){
					++count[2];
				}else if(ribbitArr[p] == 'a'){
					++count[3];
				}else{
					++count[4];
				}
			}
			for (int p = 0; p < count.length; p++) {
				System.out.println("count[p] "+count[p]);
			}

			System.out.println("#" + i+" "+wordCheck);
		}
	}
}
