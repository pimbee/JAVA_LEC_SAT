
	class Method{
		static void printName() {
			String name= "홍길동";
			System.out.println(name);
		}
		
		static void printEmail() {
			System.out.println("이메일");
		}
	}

	
public class MethodCall {
	
	static void printMyName() {
		System.out.println("냐냐냐");
	}
	
	public static void main(String args[]) {
		Method m = new Method();
		
		m.printEmail();
		Method.printName();
		printMyName();
	}
}
