/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

/*
�� Enumeration �� Iterator�������̽�

	 Collection FrameWork���� 
	 Enumeration �� Iterator�������̽��� �ִ�
	 �������� �ǹ̷δ� �ݺ�, ��ȯ �̶�� �ǹ̸� ������ ������
	 � ��ü���� ������ ���� ��
	 �� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
	 �������̽���� �� �� �ִ�.

	 - java.util.Enumeration<E> �������̽�
	 : �� �������̽��� ���� �� ���� �޼ҵ常�� �����ϸ�
	 ��hasMoreElments()���޼ҵ带 ����
	 �������̽��� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	 ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	 ��nextElement()���޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

	ex)	//v��� ���� �ڷᱸ���� ����� ��� ��� ���� �� ���
		for (Enumration e = v.elements(); e.hasMoreElments();)
		{	
			System.out.println(e.nextElment());
		}

	- java.util.Iterator<E> �������̽�
	: Enumeration ���� �������� ���� ��reomove()���޼ҵ尡 �߰��� �� ���̴�.
	  Iterator�� ������ �ִ� ��hasNext()���� ��next()���޼ҵ��
	  �̸��� �ణ �ٸ� �� �������̽��� ������ �ִ�
	  ��hasMoreElement()���� ��nextElement()����
	  ��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
	  Enumeration��� Iterator�� JDK 1.2���� �߰��Ͽ� ����ϰ� �� ������
	  �̸� �����ϱ� ���� ���� ���� Iterator �������̽���.
*/

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class Test160
{
	public static void main(String[] args)
	{
		//���� �ڷᱸ���� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		//���� �ڷᱸ�� v�� ��� �߰�
		v.add("JAVA");
		v.add("Oracle");
		v.add("JSP");
		v.add("Servlet");	
		v.add("Spring");

		//(1)Enumeration
		//	- hasMoreElements()
		//	- nextElement()
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())	//[true/false]
		{
			System.out.println(e.nextElement());
		}
		System.out.println();
		//--==>> JAVA
		//		 Oracle
		//		 JSP
		//		 Servlet
		//		 Spring


		System.out.println("------------------------------------");

		//(2) Iterator
		//	- hasNext()
		//	- next()
		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		//--==>> JAVA
		//		 Oracle
		//		 JSP
		//		 Servlet
		//		 Spring



















	}
}