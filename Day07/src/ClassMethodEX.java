import java.util.Scanner;

public class ClassMethodEX{
	public static void main (String [] args) throws Exception{
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("사용항 클래스 이름을 입력해 주세요 : ");
		String className = s.nextLine();
		//String className = "AppProgramV1";
		Class clazz = Class.forName(className);
		AppInterface inc = (AppInterface)clazz.getConstructor().newInstance();
		inc.printMyName();
	}
	
}
