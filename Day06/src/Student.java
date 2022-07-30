
public class Student {
	
	int schoolTime;
	
	String name;
	int age;
	int grade;
	int score;
	String gender;
	
	//생성자
	Student(){
		schoolTime = 9;
	}
	
	public void sayName(){
		System.out.println("이름은" + name + "입니다.");	
	}
	
	public void sayGrade(){
		System.out.println(grade + "학년이예요");
	}
	
	public void sayGender(){
		System.out.println(gender + "학생입니다.");
	}
	
	public void sayScore(){
		System.out.println(score + "점 입니다.");
	}
	
	public void play(){
		System.out.println("어디로 놀러가자");
	}
	
	public void goToCR(){
		System.out.println("화장실 갑니다.");
	}
	
	public void pritIsaTime(int isTime){
		if (isTime > this.schoolTime) {
		System.out.println("지각");
		}
		else {
			System.out.println("세이프");	
		}
	}
	
}
