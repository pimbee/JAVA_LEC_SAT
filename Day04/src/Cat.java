/*
 * cat클래스
 * cat은 동물 animal이 가지고 있는 속성을 상속받는다.
 * 행위는 변경할 수 있으나 속성은 변경 할 수 없기 때문에 SUPER를 써서 값만 변경한다.
 * */
public class Cat extends Animal{
	
	public Cat() {//생성자
		super.name = "냥이";
	}
	
	public Cat(String name) {
		super.name = name;
	}
	
	//cat의 행위(method)
	public void grrrrrr() {
		System.out.println("그릉그릉");
	}
	//상속받아서 메서드 재정의
	public void bark() {
		System.out.println("야옹야옹");
	}
}

/*
 * dog클래스
 * */
class Dog extends Animal{
	
	public Dog() {
		super.name = "멍이";
	}
	
	public Dog(String name) {
		super.name = name;
	}
	
	public void kangkang() {
		System.out.println("깽꺵");
	}
	//상속받아서 메서드 재정의
	public void bark() {
		System.out.println("멍멍");
	}
}
