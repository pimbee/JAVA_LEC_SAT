

class Counter2{
	static Counter2 counter2;
	int cnt = 0; //덧셈숫자
	
	//싱글턴객체생성 메서드
	public static Counter2 getInstance() {
		if(counter2 == null) {
			counter2 = new Counter2();
		}
		return counter2;
		
	}
	
	//cnt변수 1씩증가
	public void addCnt() {
		cnt++;
	}
	
	public void printCnt() {
		System.out.println("cnt =" + cnt);
	}
	
}

public class SingletonEX {
	public static void main(String args[]) {
		//일반형식 ccount1,ccount2,ccount3 각자만듧 그래서 c3불러올때는 0임
		Counter2 ccount1 = new Counter2();
		Counter2 ccount2 = new Counter2();
		Counter2 ccount3 = new Counter2();
		//일반형식 ccount1만 3번 돔 호출은 c3를 호출
		ccount1.addCnt();
		ccount1.addCnt();
		ccount1.addCnt();		
		ccount3.printCnt();
		
		//singleton방식
		Counter2 count1 = Counter2.getInstance();
		Counter2 count2 = Counter2.getInstance();
		Counter2 count3 = Counter2.getInstance();
		
		count1.addCnt();
		count1.addCnt();
		count1.addCnt();		
		count3.printCnt();
	}

}
