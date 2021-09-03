/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test153
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};


	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//--ť �������̽� ����� �ν��ν��� �����ϱ� ���ؼ���
		//	new �����ڸ� �̿��Ͽ� ť �������̽��� implements��
		//	���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.

		//qu��� Queue�ڷᱸ����
		//colors �迭�� ������ �Է� -> offer()
		for (String color : colors)
			qu.offer(color);

		//qu��� Queue�ڷᱸ���� ��� ������ ��ü ���
		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		//--peek() : head��ȯ �� ���� �ȵ�,������� null��ȯ
		//--poll() : head��ȯ �� ����,������� null��ȯ
		//--==>> ���� ��� �ʷ� �Ķ� ���� ����
		
		
		
	}
}