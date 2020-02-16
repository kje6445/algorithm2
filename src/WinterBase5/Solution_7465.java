package WinterBase5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//창용 마을 무리의 개수
public class Solution_7465 {
	static int[] parent;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {

			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int people = Integer.parseInt(st.nextToken());
			int knowPeople = Integer.parseInt(st.nextToken());
			parent = new int[people + 1];
			int[] v = new int[people + 1];
			makeSet();

			for (int p = 0; p < knowPeople; p++) {
				st = new StringTokenizer(br.readLine());
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				union(num1, num2);
			}

			for (int p = 1; p < parent.length; p++) {
				parent[p] = findSet(parent[p]);
			}

			for (int p = 1; p < parent.length; p++) {
				v[parent[p]] = 1;
			}

			for (int p = 1; p < parent.length; p++) {
				if (v[p] == 1) {
					cnt++;
				}
			}
			System.out.println("#" + i + " " + cnt);
		}
	}

	static int findSet(int x) {
		if (x == parent[x]) {
			return x;
		}
		return parent[x] = findSet(parent[x]);
	}

	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);

		if (x == y) {
			return;
		}
		parent[y] = x;
	}

	static void makeSet() {
		for (int k = 1; k < parent.length; k++) {
			parent[k] = k;
		}
	}
}
