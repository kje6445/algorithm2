package arraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class aa {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		String[] arr = new String[n];
		List<Integer> count = new ArrayList<Integer>();
		int checkVarious = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = st.nextToken();
			//	System.out.println("arr[i] "+arr[i]);
		}
		for (int i = 0; i < n; i++) {
			count.add(0);
		}


		for (int i = 0; i < n; i++) { //짝을 찾아보기
			for (int j = i; j < n; j++) {
				if (arr[i].equals(arr[j])) {
					count.set(i, count.get(i) + 1);
				}
			}
		}
		for (int i = 0; i < n; i++) {
		//	System.out.println("count.get(i) " + count.get(i));
		}
		for (int i = 0; i < n; i++) { //종류 구하기
			if (count.get(i) != 1) {
				++checkVarious;
			}
		}
	//	System.out.println("checkVarious " + checkVarious);

		int checkPlus = 0;
		int justCheck = 0;
		for (int i = 0; i < count.size(); i++) {
			if (count.get(i) % 2 == 1) {
				System.out.println("i " + i);
				++checkPlus;
			} else {
				++justCheck;
			}
		}
	//	System.out.println("checkPlus " + checkPlus);
	//	System.out.println("justCheck " + justCheck);
		if (checkPlus - (checkVarious+1) == 0) {
			System.out.println("Y");
			System.out.println(arr.length + 1);
			System.out.println(n - checkVarious);
		} else {
			System.out.println("N");
			System.out.println(arr.length);
			System.out.println(n - checkVarious);
		}
	}
}
