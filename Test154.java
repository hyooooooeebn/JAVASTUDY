/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

/*
�� Vector(����)

	�ڹ��� �ڷ� ���� ����� �����ϴ� Ŭ������ �� ���� �⺻���� Ŭ������
	�迭�� ���������, �迭�� �޸� �ٸ� ������ ������ ���� ����
	������ ��Ҹ� ���� �� ������, �����Ͱ� �������� �ڵ����� ���� ������
	Ȯ���Ű�� �ȴ�

	����, ��ü ���۷����� �����ϱ� ������
	JDK 1.5 �������� �ڹ� �⺻�� �����ʹ� ������ �� ��������
	JDK 1.5 ���ĺ��ʹ� ����ڽ�.�����ڽ� ����� �����Ǹ鼭
	�⺻ ���������� ������ ����������.

	���� Ŭ������ �⺻ ������
	������ ������ ����(�������̴�,,,)�� ����ϸ�
	������ ������ ������ �������� ���ؽ� ���� ���� ��ġ�� �����ϰ� �ȴ�.
	���� �ڷᱸ���� �� ���ܿ����� ������ ������ ť��
	���� �������� ������ ������ ���ð� �޸�
	������ ������ �ε��� ���� �̿��Ͽ� �ڷᱸ���� ������ ��������
	���� �� ������ �����ϴ�,

	������ ������ ������
	List �������̽��� ���� �����ޱ� ������
	List �������̽��� ��� �޼ҵ带 ����� �� �ִ�.

	- void add(int index, E element)
	- void insertElemnetAt(E obj, int index)
	 �־�����ġ�� ��ü ����
	 �־��� ��ġ�� ��ü���� ���������� �ϳ��� �̵�

	- void addElement(E obj)
	- boolean add(E e)
	 ��ü�� ���� ���� �߰�

	- void removeElementAt(int index)
	- E remove(int index)
	 �־��� ��ġ�� ��ü�� �����Ѵ�
	 ������ �־��� ��ġ �����ǰ�ü���� �ϳ��� �������� �̵�
	 ���� �� ,,,

	- void removeElement(Object obj)
	- E remove(int index)
	 �־��� ��ġ�� ��ü ����
	 ���� �� �־��� ��ġ ������ ���׺��� �ϳ��� �������� �̵�
	 E remoew(int tndex)�޼ҵ�� ����Ǿ��� ��ü ��ȯ

	- boolean removeElement(Object obj)
	- boolean remove(Object obj)
	 ��� ��ü ����
	 ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵�
	 ��ü�� ���������� ���ŵǸ� true ��ȯ

	- void removeAllElent()
	- void clear()
	 ������ ��� ��� ����

	- void setElementAt(E obj, int index)
	- E set(int index, E element)
	 ������ inde ��ġ�� �־��� ��ü ����
	 �־��� ������ ����Ǿ� �ִ� ��ü �Ҹ� -> �����



	- Eumeration<E> elements()
	 ������ ��� ��� ��ȯ

	- int indexOf(Object o)
	 �־��� ��ü�� ����� ��ġ ��ȯ
	 �������� ���� ��� ���� ��ȯ

	- int indexOf(Object o, int index)
	 �־������װ� ����� ��ġ�� index��ġ���� ã�Ƽ� ��ȯ
	 index ��ġ�� ��ĵ�� ������ ��ġ

	- boolean contains(Object o)
	 ���Ͱ� �־��� ������ �����ϰ� �ִ����� ���� ��ȯ

	- void ensureCapacity(int minCapacity)
	 ������ �뷮�� �־��� ũ�⺸�� ũ���� ����

	- E firstElment()
	 ������ ù��° ��� ��ȯ

	- E lastElement()
	 ������ ������ ��� ��ȯ

	- void setSize(int newSize)
	 ������ ũ�� ����
	 ���� �־��� ũ�Ⱑ ���� ũ�⺸�� �۴ٸ� �������� ������
	 �ݴ�� �־��� ũ�Ⱑ ���� ũ�⺸�� ũ�ٸ�
	 �� ������ null�� ä��� �ȴ�(��ü�� �������� ������ �ǹ�)

	- int capacity()
	 ���� ������ �뷮 ��ȯ

	- int size()
	 ���� ���Ϳ� ����� ��ü�� ���� ��ȯ

	- int trimTosize()
	 ������ �뷫�� ����� ��ü�� ������ �µ��� �ּ�ȭ
*/

import java.util.Vector;
import java.util.Iterator;

public class Test154
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};

	public static void main(String[] args)
	{
		int i;
		String str;

		Vector<Object> v = new Vector<Object>();

		for (i=0; i<colors.length; i++)
			v.add(colors[i]);

		//������ ��� �߰�
		v.addElement("�Ͼ�");


		// firstElement()
		str = (String)v.firstElement();
		System.out.println("ù��°��� : "+str);
		//--==>> ù��°��� : ����


		// get() 
		str = (String)v.get(1); //�ι�°��� ����
		System.out.println("�ι�°��� : "+ str);
		//--==>> �ι�°��� : ���

		str = (String)v.get(0);
		System.out.println("ù��°��� : "+ str);
		//--==>> ù��°��� : ����


		//elementAt()
		str = (String)v.elementAt(1);
		System.out.println("�ι�°��� : "+ str);
		//--==>> �ι�°��� : ���


		//lastElement()
		str = (String)v.lastElement();
		System.out.println("��������� : " + str);
		//--==>> ��������� : ����
		//--==>> ��������� : �Ͼ�  --�߰� �� �����
		// �غ��� �ڷᱸ������ ��� �߰� ��(-> add()/ addElement())
		//	 �ε��� �������� ��ġ�� �߰��Ǵ� ���� Ȯ���� �� �ִ�.


		// ��ü ��� ��� ��CHECK��
		//��Iterator���� ���� ��ü ��ҿ� ������ ����
		// ��hasNext()�� : ���� ������ ��Ұ� �ִ����ǿ��θ� Ȯ���Ͽ� ��ȯ
		// ��next()��	 : ���� ������ ��Ҹ� ���������� ��ȯ
		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> ���� ��� �ʷ� �Ķ� ���� ���� �Ͼ�













		
	}
}