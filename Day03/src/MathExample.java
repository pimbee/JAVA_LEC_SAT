/**
 * 산술연산 
 *  
 * @author TJ
 * 1. 기본적으로는 이항연산 
 * x 연산자 y -> ? 
 * a + b, b - c ....
 * +,-,/,*,%  
 * % <-- 나머지 연산 
 * 
 */

public class MathExample {
	public static void main (String[] args) {
		int x=10;
		int y=11;
		
		System.out.println("x + y="+(x+y)); //21출력
		System.out.println("x - y="+(x-y)); //-1출력
		System.out.println("x * y="+(x*y)); //110출력
		System.out.println("x / y="+(x/y)); //0출력
		System.out.println("x / 10.1 = " + (10.1 / x)); //소숫점이 들어간 실수10.1이 존재하므로 .이하까지 나온다.
		System.out.println(10*20*30*0.1); // Double
		System.out.println(10*20*0.1*30); // Double
		
		System.out.println(11%10); 
		System.out.println(10%0);  
		//-- 나머지 연산 ( 11에서 10을 나눴을때 나머지 값이 얼마? ) 
		
		System.out.println("나의 집은 시흥대로 " + (100 + 52) + "길 입니다.");
		
		int add=100;
		System.out.println("나의 집은 상도로" + (add + 42) + "길입니다.");
		
		//정수와 정수의 연산결과는 반드시 정수로 나온다.
		//나눗셈의 소숫점자리까지 나오게 하려면 반드시 하나이상의 실수가 존재해야 한다.
		int aa= 10;
		double bb = 4;
		System.out.println("10 / 4 = " + aa/bb); //double이라는 실수가 있으므로 소숫점까지 나온다.
	}
}
