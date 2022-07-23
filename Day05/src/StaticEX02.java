
class Counter{
	
	static int count =0; //static 변수 이므도, 클래스가 로딩되는 시전부터(프로그먀 시작 순잔부터)
								//static 영역에 저장되고, 프로그램이 끝날때 까지 공유(사라지지 않는다)
	int non_static_count=0; //non-static변수 이므로 , heap영역에 올라가는 순간 초기화 되며 heap에서 해체되는 순간 삭제됨
	
	Counter(){
		count++;//static
		non_static_count ++; //non-static
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getNonStaticCount(){
		return non_static_count;
	}
}

public class StaticEX02 {
	public static void main(String args[]) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		
		int static_total_cnt = Counter.getCount();
		int non_static_total_cnt = c3.getNonStaticCount();
		
		System.out.println("Counter 객체 생성 수 static : " + static_total_cnt);
		System.out.println("Counter 객체 생성 수  : " + non_static_total_cnt);
	}
	
}
