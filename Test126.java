/*===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
===========================================*/

/*
�� Wrapper Ŭ����
	
	1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
	   �������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
	   ���� �ڹٿ����� �̷��� �⺻�� �����͸�
	   ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
	   �̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.

	    "10" -> String -> ��ü -> Object
	   							  ��ü -> Integer -> �޼ҵ� parseInt() -> 10
								  		-----------
										
	2.  �⺻ �ڷ�����
		byte, short, int,	 long, float. double, char,		 boolean ���� �����ϴ�
		Byte, Short, Integer,Long, Float, Double, Character, Boolean��
		Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
		java.math.BigInteger�� java.math.BigDecimal Ŭ������ �����Ѵ�.

		Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
		������ import ���� ���� �ٷ� ����ϴ� ���� �����ϸ�
		�⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
		�� ��ȯ�� �����ϰ� ���� ��ȭ ���� ���굵 �����ϴ�.

		ex) java.lang.Integer Ŭ����
			int �⺻ �ڷ����� Wrapper Ŭ������
			������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
			�޼ҵ� ���� �����ϰ� �ִ�.

			static int parseInt(String s)			//Integer.parseInt() -- ����--static �̴ϱ�,,,,
			���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ѵ�.

			static Integer valueOf(int i)
			int ���� Integer ������ ��ȯ�Ѵ�.

			byte() byteValue(), int intValue(),
			short shortValue(), 
			float floatVaule()
			�ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.

*/


/*
�� ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing)		//��CHECK��

	�Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
	�� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
	������ JDk 1.5���� ���۷��� ���� �⺻ �ڷ�����
	������ ���� �� ��ȯ�� �����ϰ� �Ǿ���.

	int a =10,b;	//�⺻��
	Intrger ob;		//Rect rec; �̷� ����,,,
	ob = a;			//������,,�ּҰ��� �����ؼ� �Ұ����ѵ�,,,,Integer�� ����,,, ���� �ڽ�
	//--�⺻ �ڷ����� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
	//	�����δ�,,, ��ob = new Integer(a); ���ε�,,,, Integer ob =10; �� �����ϴ�....

	b= ob;
	//--Integer�� �⺻ �ڷ����� int ������ �ڵ� ��ȯ(���� ��ڽ�)
	//	�����δ� ... ��b = ob.intValue();��

	//�̴� JDK 1.5 ���� �߰��� ���� �ڽ�/ ���� ��ڽ��̶��
	//������� ���� �������� ���̴�.
*/

public class Test126
{
	public static void main(String[] args)
	{
		int a=10, b;
		Integer c;
		Object d;

		b = a;	//--int�� ������(�ڷ�) -> int �� ����
		c = new Integer(0); 

		// �� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� �ʴ´�.

		b = c;				//-- Integer �� ������(��ü) -> int �� ����(���� ��ڽ�)
		b = c.intValue();	//--��ڽ�
							//	������ �̷��� �ؾ��ϴµ� �ڵ����� ��ڽ̵ȴ�.

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> java.lang.Object@15db9742

		System.out.println("d : " + d);
		//--==>> d : java.lang.Object@15db9742

		d = new Integer(10);	//Object d = new Integer(10)  = ��ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10
		

		System.out.println("d : " + d);
		//--==>> d : 10

		d = new Double(12.345);	//--��ĳ����
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d : " + d);
		//--==>> d.toString() : 12.345
		//		 d : 12.345

		d= 10;					//--���� �ڽ�
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d : " + d);
		//--==>> d.toString() : 10
		//		 d : 10
		

	}
}