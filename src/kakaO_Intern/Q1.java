package kakaO_Intern;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {

		String s = "{{123}}";

		System.out.print(Arrays.toString(solution(s)));

	}

	public static int[] solution(String s) {
	//	int check = 0;

		String[] arr = s.split("}");
		String[][] putarr = new String[arr.length][arr.length];

		for(int i=0; i<arr.length; i++){
			String[] ss = arr[i].split("");

			int k=0;
			for(int j=0; j<ss.length; j++){
				if((!ss[j].equals("{"))&&(!ss[j].equals("}"))&&(!ss[j].equals(","))) {
					putarr[i][k] = ss[j];
					++k;
				}
			}
		}


		String ans = null;
		String[] ansArr = new String[putarr.length];
		int[] sizeNum = new int[putarr.length];

		for(int i=0; i<putarr.length; i++){
			int lengthCheck =0;
			for(int j=0; j<putarr.length; j++){
				if(putarr[i][j] != null)
					++lengthCheck;
			}
			sizeNum[i] = lengthCheck;
		}

		int idxnum = 1;

		for(int i=0; i<sizeNum.length; i++){
			if(sizeNum[i] == 1) {
				ansArr[0] = putarr[i][0];
			}else{
			//	System.out.println("idxnum "+ idxnum);
				if(sizeNum[i] == idxnum){
					int k = i;

					for(int idx =0; idx<idxnum; idx++){
						for(int p=0; p<idxnum; p++) {
							if(ansArr[idx]!=putarr[k][p]){
						//		System.out.println("putarr[k][p] "+putarr[k][p]);
								ansArr[idxnum-1] = putarr[k][p];
							}
						}
					}
				}
			}
			++idxnum;
		}

	//	System.out.println();
	//	for(int i=0; i<ansArr.length; i++){
	//		System.out.println("check " +ansArr[i]);
	//	}

		int[] answer = new int[ansArr.length];

		for(int i=0; i<ansArr.length; i++){
			answer[i] = Integer.parseInt(ansArr[i]);
		}
		return answer;
	}
}
