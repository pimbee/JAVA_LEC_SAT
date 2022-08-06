import java.util.*;

/*
 * 가변배열이다.
 * 배열과 다르게, 길이가 고정괴지 않고 유동적이다.
 * */
public class CollectionEX {

		public static void main(String[] args) {
			int arrA[] = new int[3];
			 arrA[0] = 1;
			 arrA[1] = 2;
			 arrA[2] = 3;
			 //배열은 길이가 고정되어 있다.
			 //Collection은 2개의 인터페이스가 있습니다.
			 //List,Set
			 //List중복허용, 데이터는 차례대로 쌓인다.
			 //set 중복불허용, 데이터는 지 마음대로
			 
			 List<StudentA> list = new ArrayList();
			/* list.add(new Integer(1));
			 list.add(new Integer(2));
			 list.add(new Integer(3));*/
			 list.add(new StudentA());
			 list.get(0).printName();//제러릭사용시 TypeCasting필요없음
			 
			// list.get(0) == arrA[0]과 같다는 의미
			 
			for(int i=0; i< list.size(); i++) {
				System.out.println("list.get("+ i +")="+list.get(i));
			}
			
			//((StudentA)list.get(3)).printName(); //TypeCasting캐스팅
			
			//아래처럼 LIST배열의 길이를 늘릴 수도 있음
			list.add(new StudentA());
			list.add(new StudentA());
			list.add(new StudentA());
			list.add(new StudentA());
			list.add(new StudentA());
			
			//아래처럼 줄일 수도 있음.
			list.remove(0);
			list.remove(1);
			list.remove(2);
			
			//향상된 for문
			for(StudentA val : list) {
				val.printName();
			}
		}
}


class StudentA{
	public void printName() {
		System.out.println("하악하악");
	}
}



