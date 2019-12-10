package Final1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class A_2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> depque = new ArrayDeque<Integer>();

		for(int i=1; i<=n; i++)
			depque.add(i);

		int result =0;

		while(true){
			if(depque.size()==1){
				result = depque.getFirst();
				break;
			}

			depque.removeFirst();
			int value = depque.removeFirst();
			depque.addLast(value);
		}

		System.out.println(result);
	}
}
