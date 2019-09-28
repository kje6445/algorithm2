package NHN;


import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.LinkedList;

import java.util.List;




public class NHN_ex2 {

	// 맵핑시 방향 전환용

	public static int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] inputs = Arrays.stream(reader.readLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		int N = inputs[0];

		int W = inputs[1];

		int maxLevel = N == 2 ? 1 : (N - 1) / 2 + 1;

		List<List<String>> list = new ArrayList<>();

		for (int i = 0; i < maxLevel; i++) { // 한번에 출력하기 위함

			list.add(new LinkedList<>());

		}

		String[][] map = new String[N][N];

		for (int i = 0; i < N; i++) {  //배열에 입력받는 코드

			String[] line = reader.readLine().split(" ");

			for (int j = 0; j < line.length; j++) {

				map[i][j] = line[j];

			}

		}

		// 2차원 배열을 1차원 리스트로 맵핑(회전을 쉽게하기 위하여)

		for (int i = 0; i < maxLevel; i++) {

			int x = i;

			int y = i;

			for (int j = 0; j < directions.length; j++) {

				while (true) {

					x += directions[j][0];

					y += directions[j][1];

					int level = Math.min(Math.min(N - y - 1, N - x - 1), Math.min(y, x));

					if (level != i) break;

					list.get(level).add(map[y][x]);

				}

				x -= directions[j][0];

				y -= directions[j][1];

			}

		}

		// 회전 후 맵핑

        /*

         처음 생각은 링크드리스트를 이용하여 마지막 또는 첫 인덱스 값을 빼고 다시 반대쪽에 이어주는 방법으로

         회전을 구현하였음

         그러나 회전이 최대 10억번이 가능하다 보니 타임아웃이 발생하였고

         이를 해결하기 위해 회전 계산 시 링크드리스트가 아닌 계산으로 직접 회전 후 인덱스를 구하도록 함

         */

		int[] mapSeq = new int[list.size()];

		for (int i = 0; i < maxLevel; i++) {

			int x = i;

			int y = i;

			mapSeq[i] = 0;

			List<String> lst = list.get(i);

			for (int j = 0; j < directions.length; j++) {

				while (true) {

					x += directions[j][0];

					y += directions[j][1];

					int level = Math.min(Math.min(N - y - 1, N - x - 1), Math.min(y, x));

					if (level != i) break;

					// 회전 후 인덱스 계산

					int idx = mapSeq[i] + (W * -1);

					if (W >= 0) idx = lst.size() + idx % lst.size();

					idx %= lst.size();

					String s = lst.get(idx);

					map[y][x] = s;

					mapSeq[i]++;

				}

				x -= directions[j][0];

				y -= directions[j][1];

			}

			// 다음 테두리는 반대로 회전

			W *= -1;

		}

		// 출력

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[i].length; j++) {

				sb.append(map[i][j]);

				sb.append(j != map[i].length - 1 ? " " : "");

			}

			sb.append(i != map.length - 1 ? "\n" : "");

		}

		System.out.print(sb.toString());

	}

}