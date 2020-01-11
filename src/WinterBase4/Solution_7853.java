package WinterBase4;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

//오타
public class Solution_7853 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			String wordArr = br.readLine();
			char[] splitWord = wordArr.toCharArray();
			int[] checkNum = new int[splitWord.length];

			for (int p = 0; p < checkNum.length; p++) {
				checkNum[p] = 0;
			}
			int sum = 1;
			//		for (int p = 0; p < checkNum.length; p++) {
//				System.out.printf( splitWord[p]+" ");
//			}

			if (splitWord.length != 1) {
				for (int p = 0; p < splitWord.length; p++) {
					if (p == 0) {
						if (splitWord[p] == splitWord[p + 1]) {
							checkNum[p] = 1;
						}else{
							checkNum[p] = 2;
						}
					} else if (p == splitWord.length - 1) {
						if (splitWord[p] == splitWord[p-1]) {
							checkNum[p] = 1;
						}else{
							checkNum[p] = 2;
						}
					} else {
						if ((splitWord[p] == splitWord[p - 1]) && (splitWord[p] == splitWord[p + 1])) {
							checkNum[p] = 1;
						} else if ((splitWord[p] != splitWord[p - 1]) && (splitWord[p] != splitWord[p + 1])&&(splitWord[p+1] != splitWord[p - 1])) {
							checkNum[p] = 3;
						} else {
							checkNum[p] = 2;
						}
					}
				}

				for (int p = 0; p < splitWord.length; p++) {
					System.out.println("checkNum[p] "+checkNum[p]);
					sum = checkNum[p] * sum;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}