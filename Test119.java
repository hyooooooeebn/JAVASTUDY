/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

//outer class
class Test2
{
	static int a = 10; //��������, Test2�� �������, static����(Ŭ���� ����)
	int b = 20;		   //��������, Test2�� �������, instance����(�ν��Ͻ� ����)	
	
	void write()		// ��ù ��° write()�޼ҵ�
	{
		System.out.println("write()...��");
		final int c = 30;	//��������, ���ȭ�� ����						//��CHECK��
		int d =40;			//��������, ���� ���÷� ���� �� �ִ� ����

		//�޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, local class)
		//inner class
		class LocalTest
		{
			void write() // ���� ��° write()�޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);		//c�� ź�� ������ ������ �ٲ����ʱ� ������ ���ٰ���	
				//System.out.println("d : " + d);			//--�����߻�		//��CHECK��
			}	
		}//end LocalTest

		//�� ���� c�� ���� d�� �� �� ��������������,,,
		//	 c�� final�����̱⶧����,,,
		//	 �ι�° write()�޼ҵ忡�� �����ϴ� ������ �����̴���
		//	 30�� ������ ������ ������� �� �ִ�
		//	 �ݸ鿡, d�� �װ��� ���÷� ������ �� �ִ� ��Ȱ�̹Ƿ�
		//	 LocalTestŬ������ �ν��Ͻ� ���� ������
		//	 ������ Ȯ���� �� ���� ������
		//	 d�� �����ϴ� ���� ���ؾ��Ѵ�.

		LocalTest ob1 = new LocalTest();
		ob1.write();		//--�� ��° write() �޼ҵ� ȣ��

		d+=10;
	} // end write()
}//end Test2


public class Test119
{
	public static void main(String[] args)
	{
		
		Test2 ob2 = new Test2();
		ob2.write();		//--
		/*
		write()...��
		write()...��
		a : 10
		b : 20
		c : 30
		*/
	}
}