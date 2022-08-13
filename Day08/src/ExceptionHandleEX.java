import java.util.Scanner;
import java.util.*;

public class ExceptionHandleEX {
	public static void main(String[] args) {
		
		Program p = new Program();
		
		int result = 0;
		
		try {
			result = p.getPoint();
		}catch(InputMismatchException ex) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch(Exception ex) {
			System.out.println("알수 없는 예외가 발생하였습니다.");
		}finally {
			System.out.println("무조건실행");
		}
		
		
		System.out.println("점수는 :" + result +"점입니다.");
		
	}
}

class Program {
	
	public int getPoint() throws Exception{
		
		System.out.println("점수를 입력해 주세요 : ");
		Scanner src = new Scanner(System.in);
		int point = src.nextInt();
		return point;
	}
}
