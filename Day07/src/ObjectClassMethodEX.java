
public class ObjectClassMethodEX {
	public static void main (String [] args) {
		String a ="홍길동";
		String b ="홍길동";
		String c =a;
		
		//System.out.println("a==b:" + a == b); //false
		//"a==b:" + a 먼저인식
		System.out.println(a==b); //true
		System.out.println("a.equals(b):"+a.equals(b)); //true
		
		
		//String 객체의 hashCode()메소드는 값이 같으면 Override(재정의)되었다.
		//값이 같으면 같은 해쉬코드를 돌려준다.
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(b.hashCode());
		
		//Wrapper Class중에 Integer
		//int를 String으로 바꿔준다.
		int i = 0;
		Integer objI = new Integer(10);
		String objS = objI.toString();
		System.out.println(objS);
		
		//object clone
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		
		//int arrB[] = arrA; //주소값을 복사해서 arrA와 arrB변수는 new int[3]을 공통참조한다.
								//arrB를 변경하면 arrA도 변경됩니다.
		
		int arrB[] = arrA.clone();
		arrB[2] =100;
		
		System.out.println("arrA[2] = ?" + arrA[2]);
		
	}
}
