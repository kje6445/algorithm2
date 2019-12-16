package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//신문 헤드라인
public class SolutionD_2047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		String line = br.readLine();
		String[] checkLine = line.split("_");

		int nums = checkLine.length;
		char tmp;

		String input = "";
		String output = "";

		for(int i=0; i<nums; i++){
			String arrString = checkLine[i];
			int arrlength = arrString.length();
			tmp = arrString.charAt(arrlength);

			for(int j=0; j<arrlength; j++) {
				if (61 <= tmp) {
					output += input.valueOf(tmp).toUpperCase();
				}
			}
			output+="_";
		}

		System.out.println(output);
	}
}
