/*===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
===========================================*/


public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i=256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		//System.out.println(b2);
		//System.out.println(i2);
		//--==>> 3
		//		 256
		
		print(b2);
		print(i2);
		
		// Byte Ŭ������ byteVaule() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();

		//Integer Ŭ������ intVaule() �޼ҵ� ȣ��
		int i3 = i2.intValue();

		System.out.println("���� : " +b3);
		System.out.println(i3);

		//��CHECK��
		int i4 = b2.byteValue();
		//byte b4 = i2.intValue();	//--==>> �����߻�
		byte b4 = i2.byteValue();	//--�ݵ��Ȯ�� ��CHECK��
									//	�����ȳ��ٰ� �׳� �Ѿ�� ����

		//��CHECK��
		System.out.println("���� : "+i4); //--==>>3
		System.out.println(b4);	//--==>> 0

	}

	/*
	static void print(Byte b)
	{
		,,,;
		
	}

	
	static void print(Integer i)
	{
		,,,;
		
	}
	*/

	// java.lang.Number Ŭ����(�߻� Ŭ����)��	
	// ��� Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number n �� �Ѿ���鼭
	// ���� �ڽ��� �Ͼ�Եȴ�.
	static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
		
	}


}