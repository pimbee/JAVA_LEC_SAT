/*
 * 매개변수(인자)
 * !)매소드에서만 사용한다.
 * 메소드명(인자...)
 * 매개변수 선언형식은(데이터 타입 변수명, 데이터 타입 변수명...)
 * 매개변수도 마찬가지로 지역변수
 * */
public class ParamEX {
	
	static void printAddValue(int a, int b) { //pass by value기본타입
		int z= a+b;
		a++;
		b++;
		System.out.println("a+b=" + z);
	}

	static void printAddArray(int[] x) {
		x[1]=50;
	}
	
	
	static void printValueUseReturn() {
		int x=0;
		for(; x<=10; x++) {
		//	if(x == 9) break;
			if(x == 9) return; //한번하고 끝남
		}
		System.out.println("하악하악 x=" + x);
	}
	
	
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		printAddValue(a,b);
		System.out.println("a=" + a);
		//기본타입은 stack에서 직접 값 (ex 10.20)을 넣기 때문에 인자로 넘길때도 
		//그 인자에 메모리 주소값이 아닌 10,20 그 자체를 "복사"해준다
		//따라서 a,b의 값은 메소드에서 무슨짓을 하든 영향을 받지 않는다.
		
		int[]x = new int[2];
		x[0] =10;
		x[1]=-10;
		printAddArray(x);
		System.out.println("x[1]=" + x[1]);
		printValueUseReturn();
		//참조타입(래퍼런스타입) x는 stack 에 직접값 (ex 4, 10, ...)을 등록하는 것이 아니라,
		//heap 메모리에 있는 실 데이터 "주소값"을 "복사"로 넘겨준다.
		//따라서 호출된 메소드에서 그 참조 값을 변결하는 경우, 실제 값도 영향을 받는다.
	}
	
	
	
}
