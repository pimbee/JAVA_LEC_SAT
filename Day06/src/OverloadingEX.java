
/*
 * Overloading(계속 중첩해서 확장해 가는거)/ Overriding (덮어씌우는거)
 * 오버로딩은 같은 이름의 다른 리턴
 * 
 * Overriding
 * 상속관계에서 같은 메소드를 재정의하는것.
 * ex)내 할아버지의 전화걸때 쓰는 리소스(공중전화 등)와 내가 전화할때 쓰는 리소스(휴대폰)은 다르다.
 * 따라서 긑은 전화흫 쓰
 * */
public class OverloadingEX {
	public static void main (String args[]) {
		C c= new C();
		c.add(10,20);
		c.add(1.0f, 2.0f);
		c.add(100);
		
		System.out.println("-----------------------------------");
		P p = new P();
		p.add(10,20);
		p.add(1.0f, 2.0f);
		
		System.out.println("-----------------------------------");
		p = new C();
		p.add(10,20);
		((P)p).add(10,20);
		p.add(1.0f, 2.0f);
		
		//--객체의 커스팅은 예외발생시 컴파일러가 발생하지 않는다.
		//런타임때 발생한다->예외처리
		//상위객체 하위객체 형변환
		//((C)p).add(10,20);
	}
}

class P{
	int add() {
		return 0;
	}
	
	int add(int x, int y) {
		System.out.println("add(int x, int y)호출");
		return x+y;
	}
	
	float add(float x, float y) {
		System.out.println("add(float x, float y)호출");
		return x+y;
	}
}

	
class C extends P{
		int add(int x) {
			System.out.println("C.add(int x)호출");
			return x+10;
		}
		
		@Override
		int add(int x, int y) {
			System.out.println("C.add(int x, int y)호출");
			return x-y;
		}
	}

