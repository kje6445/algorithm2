package arraySort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class numK {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int m = 0; m < commands.length; m++) {
			int i = commands[m][0]-1;
			int j = commands[m][1]-1;
			int k = commands[m][2]-1;
		//	System.out.println("i "+ i+" j "+ j +" k "+k);
			int num = j - i+1;
			int[] temp = new int[num];
			int count = 0;
			for (int n = i; i <= j; n++) {
			//	System.out.println("value "+array[n]);
			//	System.out.println("count "+count);
				temp[count] = array[n];
			//	System.out.println("temp[count] "+temp[count]);
				count++;
				if(count>=num)
					break;
			}
			Arrays.sort(temp);
			answer[m] = temp[k];
		//	System.out.println("m "+m+" answer[m] "+answer[m]);
		}
		return answer;
	}
}
