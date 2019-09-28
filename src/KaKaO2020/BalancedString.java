package KaKaO2020;


public class BalancedString {
	public static void main(String[] args) {
		String p = "(()())()";


			System.out.print(solution(p));

	}
	public static String solution(String p) {
		String[] arr = p.split("");


		int rightCount =0; int leftCount = 0;
		boolean balancedString = false;
		boolean rightString = false;
		String u= ""; String v = "";
		String answer;
		int idx=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i].equals('(')){
				++rightCount;
			}else{
				++leftCount;
			}
			if(rightCount == leftCount){
				balancedString = true;
			}
			if(balancedString==true){
				System.out.println("idx "+i);
			}
		}


		for(int i=0; i<arr.length; i++){
			if((i==0)) {
				System.out.println("i "+i);
				u = u.concat(arr[i]);
			}else if(i==arr.length-1){
				u = u.concat(arr[i]);
			}
			else{
				v= v.concat(arr[i]);
			}
		}
		System.out.println("u: "+u);
		System.out.println("v: "+v);

		String[] arr2 = v.split("");
		if(arr2[0].equals(')')){

		}

		answer = p;
		return  answer;
	}
}
