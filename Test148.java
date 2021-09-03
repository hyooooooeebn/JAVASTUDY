/*=======================
   ��� ���� ó�� ���
==========================*/

//���� �ٽ� ������

public class Test148
{
	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);		// (6) ���� �߻�
			System.out.println(a);
		}
		catch (Exception e)					// (7) ���� ��Ƴ���
		{
			System.out.println("�� printStackTrace.........");
			e.printStackTrace();
		}
		
		
	}

	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");
			// (1) ���� �߻�

		return data + 10;
	}

	public int getValue(int value) throws Exception //(5) ������ �ۼ�,,,
	{
		int a = 0;

		try
		{
			a = getData(-2);		// (2) ���� �߻�
		}
		catch (Exception e)		// (3) ���� ��Ƴ���
		{
			// (4) ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace.........");
			e.printStackTrace();
			
			// (5) ���� ���� �ٽ� ������
			throw e;
			//--�ּ� ó�� �� main() �żҵ��� ���� ó�� ������ ������� �ʰ� �ȴ�.
		}

		return a;
	}
}