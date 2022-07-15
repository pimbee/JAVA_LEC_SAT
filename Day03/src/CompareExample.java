/**
 * �񱳿��� 
 * @author TJ
 * - �� ���� ���ؼ� ����� ��� �۾� 
 * - �� ���� ����� �׻� ��,���� (true, false) 
 * - boolean ( true / false , 1 / 0 )
 * A > B, A < B, A >= B, A <= B
 * A == B (A equal B)  
 * A != B (A not equal B) -> A�� B�� ���� �ʴ�.   
 */

public class CompareExample {

	public static void main(String[] args) {

		int a =10;
		int b= 5;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		boolean c = a==b;
		System.out.println("c = " +c);
		boolean d = c==false;
		System.out.println("d = " + d);
		
		boolean result = false; // or true 
		result = 10 > 2;
		System.out.println(result);
		System.out.println(!result);
		
		result = 10 < 2; // ���� 
		System.out.println(result);
		result = 10 >= 10; // ��  
		System.out.println(result);
		result = 10 > 10; // ���� 
		System.out.println(result);
		
		//result = "����" > "����"; // �Ǽ�,���� �񱳸� ���� 
		result = "����" == "����"; // !=, == �� ��ü�� ��絥����Ÿ���� 
								 // ���� �� �ִ�. 
		System.out.println(result);
		
	}

}
