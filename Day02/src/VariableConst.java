
public class VariableConst {
	public static void main(String args[]) {
		//--변수선언
		int var_age = 50;
		var_age = 100; //변수는 변할 수 있는 값
		var_age = -1000;//따라서 변하더라도 오류가 나지 않는다.
		
		//--상수는
		final int MAX_AGE = 10000; //상수는 final 이라는 키워드를 사용하여 변경이 불가능 하다.
		//MAX_AGE = 20000; 오류난다
		System.out.println(MAX_AGE);
	}
}
