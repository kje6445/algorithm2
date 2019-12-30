package WinterBase3.swAcademy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//거꾸로 출력해 보아요
public class Solution_1545 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		while(num>=0){
			System.out.printf(num+" ");
			num--;
		}

	}
}
