package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Summation
public class Solution_8658 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		String first;
		String arr;

		for(int i=1; i<=testCase; i++){
			first = br.readLine();
			String[] numArr = first.split(" ");
			int max=0, min=0;

			for(int p=0; p<10; p++){
				int sum=0;
				arr = numArr[p];

				char[] arr1 = new char[arr.length()];
				for(int t=0; t<arr1.length; t++){
					arr1 = arr.toCharArray();
				}

				for(int k=0; k<arr1.length; k++){
					sum += Integer.parseInt(String.valueOf(arr1[k]));
				}

				if(p==0){
					min = sum;
				}

				min = Math.min(sum, min);

				if(max<sum ){
					max = sum;
				}
			}
			System.out.println("#"+i+" "+max+" "+min);
		}
	}
}
