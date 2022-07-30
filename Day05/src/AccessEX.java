/*
 * 접근제한자입니다
 * public/protected/ default / private 
 * 
 * 접근제한자는 아래와 같은 곳에 붙을 수 있습니다.
 * 1. 클래스 (클래스는 public, default)만 가능하다.
 * 2. 메서드
 * 3. 클래스전역변수
 * */
class Class01{ //나를 호출할 수 있는거느 내 방에 있는 나를 아는 사람들
					// 같은 폴더 같은 페이지에 있는 사함들
	
		private int money = 100; // 내가 가진돈응 나밖에 알 수없음
		String name="홍길동";//내 이름을 바꿀 있는 사람은 내 방에 있는 나를 아는 사람들
		public int getMoney(int m) {//나한테 돈을 가져갈 수 있는 사람은
												//다른 방에 있어도 나랑 아는 사람들(protected)
			money -= m;
			return m;
		}
		
		public void sayMyName() {
			System.out.println(name);
		}
}

public class AccessEX {
	public static void main(String args[]) {
		
		Class01 cs = new Class01();
		//cs.money = 1000; //private이기 때문에 직접 접근할 수 없다.
		cs.name = "삐약이";
		int money = cs.getMoney(20);
		System.out.println("빌린돈" + money + "원");
		cs.sayMyName();
	}
}
