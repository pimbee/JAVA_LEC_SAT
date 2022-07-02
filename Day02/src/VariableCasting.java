/*
 * 기본형Type casting (형변환)
 * */
public class VariableCasting {
	public static void main(String[] args) {
		//묵시적 형변환
		byte a = 127;
		short b = a;//short(2)>byte(1)
		
		long c = 1000; //8byte
		float d = c; //실수형은 정수형 보다 크다.
		
		
		System.out.println("long to float : " + d);
		
		//명시적 형변환
		short aa = 127;
		//byte bb = aa; 큰형에서 작은형으로 들어갈때 에러가 나므로 값을잘라야 한다.
		byte bb = (byte)aa;
		System.out.println("short to byte : " + bb);//알아서 byte로 사이즈로 casting해준다.
		
		aa=128;
		bb=(byte)aa;
		System.out.println("short to byte 범위를 넘김 : " + bb);
	}
}
