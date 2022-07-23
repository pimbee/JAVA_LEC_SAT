/*
 * class 배열 heap에 저장 -> new를 씀
 * */

class Student{
	String name;
	int grade;
	String gender;
	
	//생성자선언
	public Student() {
		name = "홍길동";
		grade = 6;
		gender = "남성";
	}
	
	public Student(String p_name, int p_grade, String p_gender) {
		name = p_name;
		grade = p_grade;
		gender = p_gender;
	}
	
	void sayName() {
		System.out.println("이름은 '" + name +"' 입니다.");
	}
	void sayGrade() {
		System.out.println(grade+"학년입니다." );
	}
}


public class ConstructEX {
	public static void main(String args[]) {
		
		Student std = new Student(); //new뒤에 붙은 게 생성자...생성자는 class이름과 같다.
		std.sayName();
		std.sayGrade();
		std.name="홍길동";
		
		Student std2 = new Student("홍길순", 2, "여성"); 
		std2.sayName();
		std2.sayGrade();
	}

}
