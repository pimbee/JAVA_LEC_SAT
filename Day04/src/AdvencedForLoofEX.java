
public class AdvencedForLoofEX {
	public static void main(String[] args) {
		int arrInt[]= {100,200,300,400};
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		//배열이나 / list같은 collection계열
		//for (데이터 타입의 변수 : Collections) ex)배열		
		for(int item : arrInt) {
			System.out.println(item);
		}
	}
}
