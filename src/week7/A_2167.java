package week7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_2167 {
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N+1][M+1];
		int[][] sumArr = new int[N+1][M+1];

		for(int i=1; i<=N; i++){		//배열의 수를 입력받는다.
			 st = new StringTokenizer(br.readLine());
			for(int j=1; j<=M; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				sumArr[i][j] = sumArr[i][j-1]+arr[i][j];
			}
			/*System.out.printf(arr[i][1]+" "+arr[i][2]+" "+arr[i][3]);*/
			System.out.println("");
		}

		int k = Integer.parseInt(br.readLine()); //합을 구할 개수
		int i,j,x,y; //4개의 정수로 i,j,x,y가 주어진다.

		for(int s=0; s<k; s++){
			int sum=0;
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			System.out.printf("arr[i][j] "+arr[i][j]);
			System.out.printf("arr[x][y] "+arr[x][y]);

			for(int row=i; row<=x; row++){
				sum += sumArr[row][y] - sumArr[row][j-1];
			}
			System.out.println();
			System.out.println(sum);
		}

	}
}
