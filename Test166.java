/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

//Map -> Hashtable , HashMap

/*
 java.util.map �������̽���
 Ű�� ���� �����ϸ�,
 ������ Ű�� ����� �� ����, �����ؿ� �ϸ�(����)
 �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
 ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

�� Hashtable<K, V>Ŭ����
	
	- �ؽ����̺� ������ ��ü �𵨸��� Ŭ����ȣ
	  �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

	- �ؽ����̺��̶� Ű�� �׿� �����ϴ� �����ͷ�
	  ���е� ������ �����̴�.

	- �����͸� �����ϰ� �˻��ϱ� ���ؼ� Ű�� �����ϸ� 
	  �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

    - ����, Hashtable Ŭ������ key �Ǵ� value�� ������ null�� ������� �ʴ´�.
*/

import java.util.Hashtable;

public class Test166
{
	private static final String[] names = {"������","����ȣ","������","����","������","�ֹ�ȣ"};

	private static final String[] tels
		= {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555","010-6666-6666"};
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht��� ����� Hashtable �ڷᱸ���� 
		//�迭(names,tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// -> put(k, v)
		for (int i=0;i<names.length ;i++ )
		{
			ht.put(names[i], tels[i]);
		}


		//ht��� Hashtable�� ����,,, key�� �̿��Ͽ� �˻�
		//-> get(k)
		String findName1="������";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : "+str);
		}System.out.println();
		//--==>> ������ ��ȭ��ȣ : 010-1111-1111

		//key�� �����ϴ����� ���� Ȯ��
		// -> containsKey()
		String findName2 = "���ϴ�";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
		}else
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ���ϴ� �����Ͱ� �������� �ʽ��ϴ�.


		String findName3 = "����ȣ";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		}else
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ����ȣ �����Ͱ� �����մϴ�.

		//value�� �����ϴ����� ���� Ȯ��
		// -> contains()
		String findTel1 = "010-1111-1111";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		else 
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> 010-1111-1111 �����Ͱ� �����մϴ�.


		//������ ����
		// -> remove()
		ht.remove("������");
		//--��remove()���޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		//	�� ��, key�� �����Ǵ� ���� �ƴϴ�.
		//	�ش� key�� ����Ǿ� �ִ� value�� �Բ� ����

		//���� ���� key�� �����ϴ��� Ȯ��
		if (ht.containsKey("������"))
			System.out.println("����� �ȳ�");
		else 
			System.out.println("����� �����??");
		//--==>> ����� �����??

		// key �赥 �� value�� �����ϴ��� Ȯ��
		if (ht.contains("010-5555-"))
			System.out.println("�����Ͱ� �����մϴ�.");
		else
			System.out.println("�����Ͱ� ���������ʽ��ϴ�.");
		//--==>> �����Ͱ� ���������ʽ��ϴ�.


		//null ���� ó�� ����
		//ht.put(null,null);				//--==>> ��Ÿ�ӿ���(NullPointerException)
		//ht.put("����",null);			//--==>> ��Ÿ�ӿ���(NullPointerException)
		//ht.put(null, "010-7777-7777");		//--==>> ��Ÿ�ӿ���(NullPointerException)

		
		//�ߺ��� key �Է�
		ht.put("������","010-1234-1234");
		System.out.println(ht.get("������"));
		System.out.println();
		//--==>> 010-1234-1234
		// ����Ǿ��� -> �����

		
		//�ߺ��� value
		ht.put("������","010-2222-2222");
		System.out.println(ht.get("����ȣ"));
		System.out.println(ht.get("������"));
		System.out.println();
		//--==>> 010-2222-2222
		//		 010-2222-2222
		// �� value�� �ߺ��� ���� �ԷµǾ ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����.
		






	}
}