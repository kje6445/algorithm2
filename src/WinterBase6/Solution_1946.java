package WinterBase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//간단한 압축 풀기
public class Solution_1946 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 1; i <= testCase; i++) {
			int num = Integer.parseInt(br.readLine());

			String[][] arr = new String[num][10];
			int checkPost = 0;
			int numInx=0;
			for (int k = 0; k < num; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String first = st.nextToken();
				int count =  Integer.parseInt(st.nextToken());

				//count가 10일때
				if(k==0){
					for(int p=0; p<count; p++){
						arr[numInx][p] = first;
				//		System.out.println("0 arr[numInx][p] "+arr[numInx][p]);
					}
					if(count==10) {
						++numInx;
					}else {
						checkPost = count;
					}
				}else{
					int plus = checkPost+count;
					if(plus<10) {
						for (int p = checkPost; p < plus; p++) {
							arr[numInx][p] = first;
						}
					}else{
						for (int p = checkPost; p < 10; p++) {
							arr[numInx][p] = first;
					//		System.out.println("1 arr[numInx][p] "+arr[numInx][p]);
						}
						plus = plus-10;
			//			System.out.println("plus "+plus);
						++numInx;
						for (int p = 0; p < plus; p++) {
							arr[numInx][p] = first;
			//				System.out.println("2 arr[numInx][p] "+arr[numInx][p]);
						}
					}
					checkPost = plus;
				}

			}

			System.out.println("#"+i);
			for(int j=0; j<num; j++){
				for(int y=0; y<10; y++){
					if(arr[j][y] == null)
						break;
					System.out.printf(arr[j][y]);
				}
				System.out.println("");
			}

		}
	}
}
