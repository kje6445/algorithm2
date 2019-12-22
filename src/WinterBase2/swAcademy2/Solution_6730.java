package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//장애물 경주 난이도
public class Solution_6730 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i=1; i<=testCase; i++){
			int block = Integer.parseInt(br.readLine());
			int[] arr = new int[block];
			int max=0, min=0;
			int checkMax, checkMin;

			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int k=0; k<block; k++){
				arr[k] =  Integer.parseInt(st.nextToken());
			}


			for(int j=0; j<block-1; j++){
					if(arr[j]<arr[j+1]){ //올라가는거
						checkMax = arr[j+1] - arr[j];
						if(checkMax>max){
							max = checkMax;
						}
					}else { //내려가는거
						checkMin = arr[j] - arr[j+1];
						if(checkMin>min){
							min = checkMin;
						}
					}
			}

			System.out.println("#"+i+" "+max+" "+min);
		}
	}
}
