package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1974 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int[][] sudoku = new int[9][9];
		int[] check = new int[9];

		for (int i = 1; i <= testCase; i++) {
			int count = 0;
			for (int p = 0; p < 9; p++) {
				String[] nums = br.readLine().split(" ");
				for (int k = 0; k < 9; k++) {
					sudoku[p][k] = Integer.parseInt(nums[k]);
				}
			}

			for (int p = 0; p < 9; p++) {
				for (int k = 0; k < 9; k++) {
					System.out.printf(sudoku[p][k]+"");
				}
				System.out.println("");
			}
			for (int p = 0; p < 9; p++) {
				check[p] = p;
			}

			//세로 비교
			for (int p = 0; p < 9; p++) {
				boolean[] checkidx = new boolean[9];
				for (int k = 0; k < 9; k++) {
					int indx = sudoku[p][k];
					checkidx[indx] = true;
				}

				for (int k = 0; k < 9; k++) {
					if (checkidx[k] != false) {
						++count;
					}
				}
			}

			//가로 비교
			for (int p = 0; p < 9; p++) {
				boolean[] checkidx = new boolean[9];
				for (int k = 0; k < 9; k++) {
					int indx = sudoku[k][p];
					checkidx[indx] = true;
				}

				for (int k = 0; k < 9; k++) {
					if (checkidx[k] != false) {
						++count;
					}
				}
			}

			//3개씩 비교
			for (int p = 0; p < 9; p=p+3) {
				boolean[] checkidx = new boolean[9];
				for (int k = 0; k < p + 3; k=k+3) {
					int indx = sudoku[p][k];
					checkidx[indx] = true;
				}
				for (int k = 0; k < p + 3; k++) {
					if (checkidx[k] != false) {
						++count;
					}
				}
			}

			if (count != 0) {
				System.out.println("#" + i + " 1");
			} else {
				System.out.println("#" + i + " 0");
			}
		}
	}
}
