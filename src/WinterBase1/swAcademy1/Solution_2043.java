package WinterBase1.swAcademy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 서랍의 비밀번호
public class Solution_2043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int password = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());

		if(password>num){
			System.out.println(password-num+1);
		}else if(password<num){
			System.out.println(num-password+1);
		}else{
			System.out.println("1");
		}
	}
}
