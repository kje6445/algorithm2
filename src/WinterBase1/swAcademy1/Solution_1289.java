package WinterBase1.swAcademy1;

import java.io.IOException;
import java.util.Scanner;

//원재의 메모리 복구하기
public class Solution_1289 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i=0; i<T; i++){
			int count = 0;
			int check = 0;

			String defaultCheck = "0";

			String memory = sc.nextLine();
			String[] arr = memory.split(" ");

			for(int k=0; k< memory.length(); k++ ){
				if(k==0){
					if(defaultCheck==arr[k]){ // 첫 시작이 0
						++check;
					}else{
						count = memory.length()-1;
						break;
					}
				}

				if(defaultCheck == arr[k]){

				}
			}
			System.out.println("#"+(i+1)+" "+count);
		}
	}
}
