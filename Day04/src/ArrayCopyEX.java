import java.util.Arrays;

/*
 * 배열복사
 * 배열을 복사하는 이유
 * 1. 방을 넗히거나 줄일 목적이 있는 경우
 * 2. 참조변수 이기 때문에 다른 프로세스에 영향을 받을 수 있기 때문에. 그 영향도를 없애고 독립적으로 이용
 * */
public class ArrayCopyEX {
	public static void main(String args[]) throws InterruptedException {
		// 1번목적
		//학생이 5명인 학교
		//5명의 학생의 점수를 입력
		int stdScores[] = {90,80,70,60,50};
		for (int i=0; i<stdScores.length; i++) {
			System.out.println(i+"전체학생점수"+stdScores[i] + "점");
		}
		//오늘 한명의 전학생이 왔다. 80점을 받아서 방이 하나가 더 필요하다.
		//stdScores2라는 집을 만들어서 10개방을 만들어 이사가자.
		
		int stdScores2[] = new int[10];
		int i =0;
		for(;i<stdScores.length; i++) {
			stdScores2[i] = stdScores[i];
		}
		
		stdScores2[i] =80;
		Thread.sleep(1500);
		System.out.println("\n------이사완료-------");
		for (int x=0; x<stdScores2.length; x++) {
			if(stdScores2[x]==0)break;
			System.out.println(x+"전체학생점수"+stdScores2[x] + "점");
		}
		
		//https://devdocs.io/openjdk~11/
		//학생3명이 있는 학교 schoolA에 학생 d가 전학을 왔어요.
		
		String[] schoolAStds = {"홍길동", "홍길순", "이순신"};
 		
		//--dest. 복사할대상
		String[] schoolBStds = new String[10];
		System.arraycopy(schoolAStds, 0, schoolBStds, 0, schoolAStds.length);
		//arraycopy(src, src인텍스, dest, dest시작인텍스, 복사할 대상의 길이)
		
		schoolBStds[3] ="괭이";
		System.out.println("\n------학생출력-------");
		for(int x=0; x<schoolBStds.length; x++) {
			System.out.println(x+"전체학생"+schoolBStds[x]);
		}
		
		//Arrays.copyOf
		String[] schoolCStds = Arrays.copyOf(schoolBStds, 20);
		//대상배열변수 = Arrays.copyOf(src원본배열, 새로생길 배열의 길이)
		
		System.out.println("\n------학생출력2-------");
		for(int x=0; x<schoolCStds.length; x++) {
			System.out.println(x+"전체학생"+schoolCStds[x]);
		}
		
		
		
		
	}

}
