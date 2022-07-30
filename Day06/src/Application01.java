
public class Application01 {
	public static void main(String args[]) {
		ParentsEX ex = new ParentsEX("홍길동", 2);
		ex.printMyInfo();
		
		ParentsEX ex2 = new ParentsEX();
		ex2.printMyInfo();
		
		ChildEX cx = new ChildEX("아들", 55);
		cx.printMyInfo();
	}
}
