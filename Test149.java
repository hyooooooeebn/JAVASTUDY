/*=======================
   ��� ���� ó�� ���
==========================*/

//�ٸ� ���� �ٽ� ������

public class Test149
{
	public int getValue(int value) throws Exception			// (7) ���� ������-�Ķ�
	{
		int a =0;

		try
		{
			a = getData(-2);								// (3) ���� �߻�-����

		}
		catch (Exception e)									// (4) ���� ��Ƴ���-����
		{
			// (5) ���� ó��-����
			System.out.println("printStackTrace..............");
			e.printStackTrace();

			// (6) ���ο� ���� �߻� -�Ķ�
			throw new Exception("value�� �����Դϴ�.");
		}
		return a;
	}

	public int getData(int data) throws Exception			//(2) ���� ������ -����
	{
		if(data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");	// (1) ���ܹ߻� -����
														
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test149 ob = new Test149();

		try
		{
			int a = ob.getValue(-1);							// (8) ���� �߻�(�Ķ�)
			System.out.println("a : " +a);
		}
		catch (Exception e)										// (9) ���� ��Ƴ���(�Ķ�)
		{
			// (10)���� ó��(�Ķ�)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
		}

	}
}