
public class AnimalClassEX {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark(); //고양이 객체 생성자메서드
		dog.bark();//멍멍이 객체
		
		cat.sayName();
		dog.sayName();
		
		System.out.println("===============");
		Cat cat2 = new Cat("냥이2");
		Dog dog2 = new Dog("멍이2");
		
		cat2.bark(); //고양이 객체 생성자메서드
		dog2.bark();//멍멍이 객체
		
		cat2.sayName();
		dog2.sayName();
		
		//다양성
		
		Animal[] animal = new Animal[3];
		
		animal[0] = new Cat("야옹야옹");
		animal[1] = new Dog("멍멍이1");
		animal[2] = new Dog("멍멍이2");
		
		((Cat) animal[0]).grrrrrr(); 
		//animal클래스에는 bark라는 메소드만 있기 때문에 Cat에 존재하는 grrrrr메소드를 
		//가지고 오려면 앞에 Cat클래스를 (괄호로)강제 변환시켜줘야 한다.
	}

}
