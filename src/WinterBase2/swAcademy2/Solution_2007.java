package WinterBase2.swAcademy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//패턴 마디의 길이
public class Solution_2007 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		String arr;

		for(int i=1; i<=testCase; i++){
			arr = br.readLine();
			int wavelength = 0;

			for(int t=1; t<10; t++){
				String sub = arr.substring(0,t);
				String subNext = arr.substring(t,t*2);
				if( sub.equals(subNext)){
					wavelength = t;
					break;
				}
			}

			System.out.println("#"+i+" "+ wavelength);
		}
	}
}
