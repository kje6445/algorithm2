package SpringBase_1;

public class Streat11_1 {
	public static void main(String[] args){

		String S = "aaaaaa"; //wreawerewa
		String pattern ="a"; //ware

		System.out.print((solution(S,pattern)));

	}

	public static int solution(String S, String pattern) {
		int answer = 0;

		String[] Sarr = S.split("");
		String[] patterns = pattern.split("");
		int[] alphabet = new int[26];
		int plength = pattern.length();

		Zero(alphabet, patterns, plength);

		int[] check = new int[26];

		for(int i=0; i<S.length()-plength+1; i++){
			String[] sample = new String[plength];
			for(int j=0; j<plength; j++){
				sample[j] = Sarr[i+j];
			}

			Zero(check,sample,plength);

			int finalCheck = 0;

			for(int p=0; p<26; p++){
				if((check[p] == alphabet[p])&&(check[p]!=0)){
					System.out.println("p "+p);
					++finalCheck;
				}
			}
	//		System.out.println("finalCheck "+finalCheck);
	//		System.out.println("------------");
			if(finalCheck == plength){
				++answer;
			}
		}
		return answer;
	}

	public static int[] Zero(int[] check, String[] fixArr, int plength){

		for(int i=0; i<check.length; i++){
			check[i] =0;
		}

		for(int k =0; k<plength; k++){
			int idx =fixArr[k].charAt(0);
			++check[idx-97];
		}

		return  check;
	}
}
