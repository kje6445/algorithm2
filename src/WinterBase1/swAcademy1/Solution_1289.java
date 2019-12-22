package WinterBase1.swAcademy1;

import java.io.IOException;
import java.util.Scanner;

//원재의 메모리 복구하기
public class Solution_1289 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i=0; i<T; i++){

			char[] memoryArr = sc.nextLine().toCharArray();

			int answer = 0;
			for(int k=0; k<memoryArr.length; k++){
				if(memoryArr[0] =='0'){
					if(memoryArr[k] == '1') {
						answer = memoryArr.length - k;
						break;
					}
				}else{
					if(memoryArr[k] == '0') {
						answer = k-1;
						break;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}

	}
}
