/*
 * 학생성적출력(배열이용)
 * */
public class ArrayStringEX {

	public static void main(String[] args) {
			String[] stds = {"홍길동","홍길순","이순신"};
			int[] stdScore = {90, 100, 98};
			int totalScore =0;
			//점수를 확인한다.
			
			for(int i=0; i<stdScore.length; i++) {
				System.out.println(stds[i] + ":" + stdScore[i] + "\n");
				totalScore += stdScore[i]; //총합
			}
			
			//총합을 출력한다.
			System.out.println("점수총합 : " + totalScore);
			//평균을 출력한다.
			System.out.println("평균총합 : " + (totalScore/stds.length) + "점");
	}

}
