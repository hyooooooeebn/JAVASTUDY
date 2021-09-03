/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test156
{

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};

	public static void main(String[] args)
	{
		//���� �ڷᱸ�� ����
		Vector<String> v =new Vector<String>();

		for (String color : colors)
		{
			v.add(color);
		}

		System.out.println("ù��° : "+v.firstElement());
		System.out.println("�ι�° : "+ v.get(1));
		System.out.println("������ : "+v.lastElement());
		System.out.println("��� ��: "+v.size());

		//�� ù ��° ��� "�Ͼ�"���� ���� set()
		v.set(0,"�Ͼ�");

		System.out.println("ù��° : "+v.firstElement());
		System.out.println("�ι�° : "+v.get(1));
		System.out.println("��� �� : "+v.size());


		//�� ù ��° ��ҿ� "��Ȳ" �߰� insertElementAt()
		v.insertElementAt("��Ȳ",0);


		System.out.println("ù��° : "+v.firstElement());
		System.out.println("�ι�° : "+v.get(1));
		System.out.println("��� �� : "+v.size());


		//�� ��ü ���
		System.out.print("��ü ��� : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> ��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����

		
		//�� �������� ����
		Collections.sort(v);

		//�� �������� ���� �� ��ü ���
		System.out.print("���� ���� ���� �� ��ü ��� : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> ���� ���� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�


		//�� �˻�
		//��Collections.binarySearch()�� -> �˻� ��� ����
		// ��, �������� ������ ����Ǿ� �ִ��ڷῡ ���ؼ��� ��� ���� 
		// �˻� ����� ������������ ��� ������ȯ
		//��CHECK��

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d �ε����� ��ġ�ϰ��ִ�. \n",idxBlue);
		System.out.println();
		//--==>> �Ķ� : 5 �ε����� ��ġ�ϰ��ִ�.
		int idxNavi = Collections.binarySearch(v,"����");
		System.out.printf("���� : %d �ε����� ��ġ�ϰ��ִ�. \n",idxNavi);
		System.out.println();
		//--==>> ���� : -1 �ε����� ��ġ�ϰ��ִ�.

		
		//�� �������� ����
		Collections.sort(v,Collections.reverseOrder());


		//�� �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���


		//�� �������� ���� �� �˻� �׽�Ʈ
		idxBlue = Collections.binarySearch(v,"�Ķ�");
		System.out.printf("�Ķ� : %d �ε����� ��ġ�ϰ��ִ�. \n",idxBlue);
		System.out.println();
		//--==>>�Ķ� : -8 �ε����� ��ġ�ϰ��ִ�. 
		idxBlue = Collections.binarySearch(v,"�Ķ�",Collections.reverseOrder());
		System.out.printf("�Ķ� : %d �ε����� ��ġ�ϰ��ִ�. \n",idxBlue);
		System.out.println();
		//--==>> �Ķ� : 1 �ε����� ��ġ�ϰ��ִ�.



		


	}
}