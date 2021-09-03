/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

import java.util.Stack;

public class Test151
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};

	//������
	public Test151()
	{
		//st��� Stack �ڷᱸ�� ����
		//���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� <String>
		Stack<String> st = new Stack<String>();

		//st = colors;	(x)

		for (String color : colors )
		{
			st.push(color);
		}

		st.push("����");	//���� ���߿� push�ϱ� ���� ���� pop

		//st.push(10); (x) ������ ����--���ʸ� ǥ���� ����������...

		//��¸޼ҵ�ȣ��
		popStack(st);

	}
	
	// ��¸޼ҵ�
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
		
			System.out.print(st.pop() + " ");
			System.out.println();
		
	}

	public static void main(String[] args)
	{
		new Test151();
	}
}