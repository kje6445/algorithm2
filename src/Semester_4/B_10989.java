package Semester_4;


import java.io.*;

public class B_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];

		for(int i=0; i<count; i++){
			arr[Integer.parseInt(br.readLine())]++;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i< arr.length; i++){
			if(arr[i] > 0){
				for(int arri =0; arri < arr[i]; arri++)
					bw.write(Integer.toString(i)+ "\n");
			}
		}
		br.close();
		bw.close();
	}
}
