public class Variable01{//클래스선언부
	
		public static void main(String[] args){//자바 어플리케이션 스타팅 포인트
			System.out.println("Hello vari!");
			
			int score;//자료형(숫자형) 변수명: 처음시작은 소문자로 사용 지향
			score=10;//변수 초기화
			
			System.out.println("score");
			
			//---char 사용해보기
			char alpha = 65;
			System.out.println((int)alpha+"="+alpha);
			
			for(char i=65; i<=90; i++) {
				System.out.println(i + "=" + (int)i);
			}
		}
	
	
	
}