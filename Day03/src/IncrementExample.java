/**
 * �������� 
 * @author TJ
 * ++, -- 
 * ��ǥ���� ���׿��� 
 * ++x, x++
 * --y, y-- 
 * +=, -= 
 * ++x -> x = x + 1; 
 * ++y -> y = y + 1; 
 * --x -> x = x - 1;
 * --y -> y = y - 1;
 */

public class IncrementExample {

	public static void main(String[] args) {
		
		int a = 10; 
		System.out.println(a); 
		a++;
		System.out.println(a);

		//-- ������������ ����,���� ���� 
		++a; //-- �ǿ������� �տ� ������ �ٴ°�� 
		a++; //-- �ǿ������� �ڿ� ������ �ٴ°�� 
		     //-- ���� �����ؿ� x = x + 1; 
		
		a = 100; 
		System.out.println("a++ = " + a++);
		System.out.println("++a = " + ++a);
		
		int aa = 10;
		int bb = ++aa; //����
		System.out.println(bb);
		
		int x = 10;
		int y = x++; //����
		System.out.println(y);
		System.out.println("x : " + x);
		
	}
}