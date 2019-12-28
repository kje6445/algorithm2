package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2007 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String arr;
		char[] arr2 = new char[30];

		for(int i=0; i<testCase; i++){
			arr = br.readLine();
			arr2 = arr.toCharArray();

			System.out.printf("#"+(i+1));
		}
	}
}
