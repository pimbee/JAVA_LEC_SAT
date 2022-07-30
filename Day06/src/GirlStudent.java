
public class GirlStudent extends Student{
	
	GirlStudent(String name, int age, int grade, int score){
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score =score;
		this.gender = "여";
	}
	//메소드의 재정의
	@Override
	public void goToCR() {
		System.out.println("여자 화장실로 갑니다.");
	}

}
