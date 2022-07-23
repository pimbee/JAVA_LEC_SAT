/*
 * 변수의 사용 범위*/
public class ScopeEX {
	
	
	static String name ="홍길동";//클래스 전역 변수
	
	//return값일 때 int, int같이 데이터 타입형을 맞춰준다.
	//return값이 없을 때는 void선언해줘야 한다.
	public static int add(int x, int y) {
		int z=x+y; //메소드내에 선언된 변수는 지역변수
		return z;
	}
	
	public static void scopeTest(int a) {
		a++;
		System.out.println(name);
	}
	
	public static void printNameLocal() {
		String name ="냐냐냐";
		System.out.println(name);
	}
	
	public static void printNameClass() {
		System.out.println(name);
	}
	
	public static void chClassVarValue() {
		name="하악하악";
		//System.out.println(name);
	}
	
	public static void main (String args[]) {
		System.out.println(name); //전역변수찍고
		int a =10; 
		scopeTest(a); //전역변수
		System.out.println(a); //int10찍고
		printNameLocal();
		//chClassVarValue()사용전 전역변수
		printNameClass();
		printNameClass();
		printNameClass();
		chClassVarValue(); //번역변수 값을 변경 후 
		printNameClass();
		printNameClass();
		printNameClass();
	}
}
