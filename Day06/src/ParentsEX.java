
public class ParentsEX {
	String name; //이름
	int arms; //팔
	
	//생성자 메서드 
	//리턴타입이 없다
	//클래스 명과 동일하다.
	public ParentsEX(String name, int arms) {
		this.name=name;
		this.arms=arms;
	}
	
	public ParentsEX() {
		//this.name= "홍길순";
		//this.arms= 10;
		this("홍길순", 10);
	}
	
	//맴버 메서드
	public void printMyInfo() {
		//내이름과 팔의 수를 보여부는 메서드
		//1.이름출력
		this.printNmae();
		//2.팔의 숫자 출력
		this.printArms();
	}
	
	public void printArms() {
		System.out.println("내 팔은 " + arms + "개야");
	}
	
	public void printNmae() {
		System.out.println("내 이름은 " + name + "야");
	}
	
}
