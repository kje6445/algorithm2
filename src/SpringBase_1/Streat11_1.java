package SpringBase_1;

public class Streat11_1 {
	public static void main(String[] args){

		String S = "wreawerewa"; //wreawerewa
		String pattern ="ware"; //ware

		System.out.print((solution(S,pattern)));

	}

	public static int solution(String S, String pattern) {
		int answer = 0;

		String[] Sarr = S.split("");
		int[] alphabet = new int[26];
		int plength = pattern.length();

		Zero(alphabet, pattern, plength);

		int[] check = new int[26];

		for(int i=0; i<S.length()-plength+1; i++){
			String sample2 = S.substring(i,i+plength);

			Zero(check,sample2,plength);

			int finalCheck = 0;

			for(int p=0; p<26; p++){
				if((check[p] == alphabet[p])&&(check[p]!=0)){
				//	System.out.println("p "+p);
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

	public static int[] Zero(int[] check, String fixArr, int plength){

		for(int i=0; i<check.length; i++){
			check[i] =0;
		}

		for(int k =0; k<plength; k++){
			int idx =fixArr.charAt(k);
			++check[idx-97];
		}

		return  check;
	}
}
