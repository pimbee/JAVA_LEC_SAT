/**
 * ������� 
 *  
 * @author TJ
 * 1. �⺻�����δ� ���׿��� 
 * x ������ y -> ? 
 * a + b, b - c ....
 * +,-,/,*,%  
 * % <-- ������ ���� 
 * 
 */

public class MathExample {
	public static void main (String[] args) {
		int x=10;
		int y=11;
		
		System.out.println("x + y="+(x+y)); //21���
		System.out.println("x - y="+(x-y)); //-1���
		System.out.println("x * y="+(x*y)); //110���
		System.out.println("x / y="+(x/y)); //0���
		System.out.println("x / 10.1 = " + (10.1 / x)); //�Ҽ����� �� �Ǽ�10.1�� �����ϹǷ� .���ϱ��� ���´�.
		System.out.println(10*20*30*0.1); // Double
		System.out.println(10*20*0.1*30); // Double
		
		System.out.println(11%10); 
		System.out.println(10%0);  
		//-- ������ ���� ( 11���� 10�� �������� ������ ���� ��? ) 
		
		System.out.println("���� ���� ������ " + (100 + 52) + "�� �Դϴ�.");
		
		int add=100;
		System.out.println("���� ���� �󵵷�" + (add + 42) + "���Դϴ�.");
		
		//������ ������ �������� �ݵ�� ������ ���´�.
		//�������� �Ҽ����ڸ����� ������ �Ϸ��� �ݵ�� �ϳ��̻��� �Ǽ��� �����ؾ� �Ѵ�.
		int aa= 10;
		double bb = 4;
		System.out.println("10 / 4 = " + aa/bb); //double�̶�� �Ǽ��� �����Ƿ� �Ҽ������� ���´�.
	}
}
