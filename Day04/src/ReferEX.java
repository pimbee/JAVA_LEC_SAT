
public class ReferEX {
	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2);
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4); //주소값을 가지고 오므로 false
		System.out.println(name3.equals(name4)); //값을 가지고 오게 하려면 equals를 쓴다.
		
				
	}
}
