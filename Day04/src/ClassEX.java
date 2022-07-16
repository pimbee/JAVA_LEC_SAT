/*
 *자바의 클래스 구조
 *1. 클래스는 크게 두가지 영역이 있습니다.
 * a.속성
 * b.행위
 * 프로그램에서는 Class의 두가지 영역을 "Member"라고 표현을 한다.
 * 2. 속성을 클래스에서는 "맴버변수"
 * 행위를 맴버메서드
 * 3. 행위는 크게 두가지
 * a.객체를 생성하는 행위(생성자) = 옵션
 * b.일반행위
 * 4. 일반행위는 아주 크게는 두가지로 나뉘어 진다.
 * a.값을 돌려주는 행위 return해주는 행위
 * b.값을 돌려주지 않는 행위(void)
 * */
public class ClassEX {
	//맴버변수(클래스 속성)
	int age;
	String name;
	String addr;
	int money;
	
	//일반행위
	public void sayName() {
		System.out.println(name);
	}
	
	//집을 말해라
	public void sayAddr() {
		System.out.println(addr);
	}
	
	// 돈을 내놔라
	public int 돈을내놔라() {
		return money;
	}
	//문법 리터타입 있는 행위 메서드 문법
	//접근 제한자 리턴타입 메서드명(매개변수들)
	//매서드 정의부
	//return 값;
	
	public int add(int x, int y) {
		return x+y;
	}
	
	//리턴타입이 없는 메서드
	//접근제한다 void메서드명
	//메서드 정의부
	
	public void printAdd(int x, int y) {
		System.out.println(x+y);
	}
	
	
	//------------------------------------
	public static void main(String args[]) {
		
		ClassEX ex = new ClassEX();
		int value = ex.add(10, 20);
		System.out.println(value);
	}
	
}
