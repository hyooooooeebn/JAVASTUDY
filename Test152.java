/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

/*
��  ť(Queue)
	
	ť�� FIFO(���Լ���)������
	���� �Էµ� �ڷḦ ���� ����ϸ�.
	Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

 �� Queue �������̽� �������̽��� �����ϱ� ���ؼ���
	new �����ڸ� �̿��Ͽ� Queue �������̽��� ����(implements)��
	Ŭ������ �����ڸ� ȣ���Ѵ�.

	ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�
	
	- E element()
	ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

	- boolean offer(E o)
	������ ��Ҹ� ť�� ����

	-E peek()
	Ŧ�� head ��Ҹ� ��ȯ�ϰ�������� ������
	ť �ڷᱸ���� empty�� ��� null�� ��ȯ

	-E poll()
	ť�� head��Ҹ� ��ȯ�ϰ� �����ϸ�
	ť �ڷᱸ���� empty�� ��� null ��ȯ

	-E remove()
	ť�� head ��� ��ȯ�ϰ� ����
	
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		//Queue myQue = new Queue(); (x)

		Queue<Object> myQue = new LinkedList<Object>();

		//������ �غ�
		String str1	="�ڹڹ�"; 
		String str2 ="����";
		String str3 ="������";
		String str4 ="������";

		//myQue��� Queue�ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//--==>> [�ڹڹ�, ����, ������, ������]

		System.out.println(test);
		//--==>> true

		//Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ �� ���ž���
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		//--==>> ��1 : �ڹڹ�
		//		 ��2 : �ڹڹ�

		System.out.println();

		String val;

/*
		//(1) peek() : ť�� head��� ��ȯ. ���� ����
		//			   ť�� enmpty �� ��� null ��ȯ
		while (myQue.peek() != null)
		{
			// poll() : ť�� head��Ҹ� ��ȯ�ϰ� ����
			//			ť �ڷᱸ���� empty�� ��� null ��ȯ 
			val = (String)myQue.poll();
			System.out.println("��� : "+val);
		}System.out.println();

		//--==>> ��� : �ڹڹ�
		//		 ��� : ����
		//		 ��� : ������
		//		 ��� : ������
*/
/*
		// (2)
		while (true)
		{
			val = (String)myQue.poll();

			if (val==null)
			{
				break;
			}else
			System.out.println("��� : "+val);
		}
		//--==>> ��� : �ڹڹ�
		//		 ��� : ����
		//		 ��� : ������
		//		 ��� : ������

*/
		//(3)
		while (!myQue.isEmpty())
		{
			val =(String)myQue.poll();
			System.out.println("��� : "+val);
		} System.out.println();
		//--==>> ��� : �ڹڹ�
		//		 ��� : ����
		//		 ��� : ������
		//		 ��� : ������



		
	}
}