/*
 * 배열
 * -배열의 선언방법
 * 1. 데이터 타입[] 변수명(int[] arrInt;)
 * 2. 데이터 타입 변수명[](int arrInt[];)
 * */
public class ArrayExample {
	public static void main (String args[]) {
		
		//A. 방을 만들고 각 호실에 데이터를 입력
		int[] arrInt = new int[5]; //1.  방을 만든다. (5개의 방을)
		arrInt[0] = 1; //2. 각 호실의 값(데이터)을 넣습니다.
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i]=i;
		}
		
		//B. 선언과 동시에, 각 호실에 데이터를 한번에 입력
		int arrInt2[]= {11,22,33,44,45};
		
		System.out.println(arrInt);
		System.out.println("arrInt[0]="+arrInt[0]);
		System.out.println("arrInt2[1]="+arrInt2[1]);
		//System.out.println("arrInt[5]="+arrInt[5]);
		
		//A~Z까지 char[]넣어라
		char[] alpha = new char[26];
		for(char i=0; i<alpha.length; i++) {
			alpha[i] = (char) (i+65);
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.println((char)alpha[i]);
		}
		
		
		//배열을 사용할때
		
		int stdScore[] = {90,100, 50, 40, 30};
		int totalScore = 0;
		
		for(int i=0; i<stdScore.length; i++) {
			totalScore += stdScore[i];
		}
		
		System.out.println("평균="+totalScore/5);
		
				
		
	}
}
