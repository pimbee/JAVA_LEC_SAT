/**
 * �Ҵ�(���Կ���) 
 * @author TJ
 * 
 * int a = 10; // ���α׷��� �¿��� ��� �̵�
 * 10 = a // ����  
 * 
 * int a <-- ���� (��������) 
 * = �Ҵ� 
 * 10 
 * -> ��Ƽ�� a�� �����ϰ� 10�� �Ҵ��ϰڴ�. 
 */

public class InitialExample {
	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		
		int b=100;
		b+=10;
		System.out.println(b);//110���
		b-=10;
		System.out.println(b);//100���
		b*=100;
		System.out.println(b);//10000���
		b/=100;
		System.out.println(b);//100���
		b%=100;
		System.out.println(b);//0���
	}
}
