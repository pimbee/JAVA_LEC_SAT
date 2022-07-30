
public class SchoolAplication {

	public static void main (String args[]) {
		//상속을 통한 is a 관계
		//is a 란뭐냐
		//A IS A B
		//인간은 동물이다. 남학생은 학생이다. 여학생은 학생이다. 학생은 인간이다. 인간은 동물이다.
		
		Student std1 = new BoyStudent("홍길동", 45, 6, 10);
		//Student 데이터 타입에 BoyStudent값(객체)을 넣을 수 있다 참
		//BoyStudent is a Student 남학생은 학생이다.
		//학생클래스의 상속을 받는다.
		BoyStudent bstd1 = new BoyStudent("홍길똥", 10, 1, 10);
		
		//GirlStudent gstd1 = new BoyStudent("홍길순", 0, 0, 0) ;
		//GirlStudent 데이터 타입에 BoyStudent값(객체)을 넣을 수 있다 거짓
		//BoyStudent is not a GirlStudent(남학생은 여학생이 아니다)
		//BoyStudent와 GirlStudent는 상속 관계가 아니다.
		
		Student std2 = new GirlStudent("홍길순", 20, 1, 90);
		std1.sayName();
		std2.sayName();
		
		std1.goToCR();
		std2.goToCR();
		
		//std1.smoking(); 동작안함
		//smoking()메서드는 Student(아버지) 클래스가 아님 BoyStudent(하위클래스)에만 있는 메서드이다.
		//BoyStudent 강제 캐스팅해서 형변환
		((BoyStudent)std1).smoking();
		
		//한반에 10명이 수업을 듣습니다.
		//남녀합반으로
		
		Student[] classRoom = new Student[10];
		classRoom[0] = new BoyStudent("이종석", 45, 1, 10);
		classRoom[1] = new GirlStudent("이종순", 20, 1, 99);
		//classRoom의 배열에서 하나씩 꺼내서 Student std 안에 하나씩 집어 넣어라.
		
		for(Student std : classRoom ) {
			if(std == null) break;
			std.sayName();
			std.sayGender();
		}
		
		//모든 자바클래스의 최상위 클래스는 Object -> Student is a Object
		Object[] classRoom2 = new Student[10];
		classRoom2[0] = new BoyStudent("이종석1", 45, 1, 10);
		classRoom2[1] = new GirlStudent("이종순1", 20, 1, 99);
		//classRoom2의 배열에서 하나씩 꺼내서 Object std 안에 하나씩 집어 넣어라.
		//단 Student 클래스는 형변환 시켜서 정의를 해야 한다.
		
		for(Object std : classRoom2 ) {
			if(std == null) break;
			Student tmp = (Student) std;
			tmp.sayName();
			tmp.sayGender();
		}
		
		
		
		
		
		
		
		
		
	}
}
