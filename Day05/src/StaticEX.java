/*
 * Static정적메소드/클래스 전역 변수에만 사용된다.
 * heap,stack = 동적메모리 영역(코드에 따라, 실행순서에 따라 데이터가 저장되고 사라지는 영역)
 * static영역은 = 정적메모리 영역
 * 
 * */
class CounterObjet{
	int cnt = 0;
	void addCount() {
		cnt++;
		System.out.println(cnt);
	}
}

class StaticCounterObjet{
	static int cnt=0;
	static void addCout() {
		cnt++;
		System.out.println(cnt);
	}
}

public class StaticEX {
	
	static void callAddCout() {
		CounterObjet cnt = new CounterObjet();
		cnt.addCount();		
	}
	
	static void callStaticAddCout(){
		//static 메소그/변수는 heap메모리가 아닌 static 영역에 저장되기 때문에
		//new라는 키워드를 사용하지 않는다.
		//클래스명,변수명,클래스명, 메소드명();
		StaticCounterObjet.addCout();
	}
	
	void printNmae() {
		System.out.println("난동적메서드 printaName이야");
	}
	
	public static void main(String args[]) {
		callAddCout();
		callAddCout();
		callAddCout();
		StaticCounterObjet.addCout();
		StaticCounterObjet.addCout();
		StaticCounterObjet.addCout();//static은 공용영역이라서 new 메소드를 사용하지 않는다.
		
		//static 메소드 내에서 non-static(동적)객체를 사룔하고 있다.
		CounterObjet c_object = new CounterObjet();
		c_object.addCount(); //필요메소드를 이용한다
		//같은 클래스의 동적 메서드라 할지라도,
		//new를 통해 자기자신을 heap영역에 올리고 사용해야 한다.
		//printNmae();<---에러
		StaticEX example = new StaticEX();
		example.printNmae();
	}
	
}
