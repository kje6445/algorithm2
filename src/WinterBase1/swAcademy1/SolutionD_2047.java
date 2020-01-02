package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//신문 헤드라인
public class SolutionD_2047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		String line = br.readLine();
		String[] checkLine = line.split(" ");

		int nums = checkLine.length;

		for(int i=0; i<nums; i++){
			checkLine[i] = checkLine[i].toUpperCase();
			System.out.printf(checkLine[i]);
		}

	}
}
