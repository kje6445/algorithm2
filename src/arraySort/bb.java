package arraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bb {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<Integer>();
		int[] count = new int[n];
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(0);
		}
		for (int i = 0; i < n; i++) {
			count[i]=0;
		}

		for (int i = 0; i < n; i++) {
			String[] check = br.readLine().split(" ");
			String toDo = check[0];
			switch (toDo) {
				case "enqueue":
					list.set(i, Integer.parseInt(check[1]));
					for(int k=0; k<list.size(); k++){
						if(Integer.parseInt(check[1]) == list.get(k)){
							++count[k];
						}
					}
				case "dequeue":
					for(int p =0; p<list.size(); p++){
						if(count[p]<count[p+1]){
							answer.add(list.get(p+1));
							--count[p+1];
							break;
						}
					}
				default:

			}

		}

		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
