/*=============================================================
	���� Ŭ������ �ν��Ͻ� ����
	- ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
===============================================================*/

public class Test073
{

	//int n=100; //--���� (�ʱ�ȭ)
	//int m=200;

	//int n;
	//int m;
	//n=100;
	//m=200;   //-- �Ұ��� (Ŭ�������� ���Կ��� �Ұ���) ��CHECK��


	int n;
	int m;

	//�ʱ�ȭ ��		��CHECK��
	//-- "�����ں��� �켱������ ����" = �����ڰ� �ʱ�ȭ �� �� ���ƾ��� �� ����
	{
		n=100;
		m=200;
		System.out.println("�ʱ�ȭ �� ����...");
	}			//--����

	// ������
	Test073(int n, int m)
	{
		this.n =n;
		this.m=m;
		System.out.println("�Ű����� �ִ� ������ ����,,,");
	}

	// ������(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("������ ����");
	}

	//��� �޼ҵ� ����
	void write()
	{
		System.out.println("n:" + n + "," + "m:" + m);

	}


	public static void main(String[] args)
	{
		Test073 ob1 = new Test073();

		ob1.write();

		Test073 ob2 = new Test073(1234, 5678);
		//--==>> �ʱ�ȭ �� ����...					��CHECK��
		//		 �Ű����� �ִ� ������ ����,,,

		ob2.write();
		//--==>> n:1234,m:5678
		
	}
}