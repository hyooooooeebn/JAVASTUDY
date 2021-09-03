/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

/*
	Vector v = new Vector();
	����ִ� Vector �ڷᱸ������

	Vector v = new Vector(8);
	8���� �ʱ� element�� ���� Vector �ڷᱸ�� ����
	8���� ��� ä������ �Ǹ� �ڵ� Ȯ��

	Vector v = new Vector(3,5);
	3���� �ʱ� element�� ���� ���� ����
	3���� ��� ä������ �ڵ����� 5�� ����

	��  ���ʹ� ������ ��ҷ� ����, �Ǽ�,,,����
		��Ƴ��� ���� ����
		-> ������ ������ Ȯ�� check~
*/

import java.util.Vector;
import java.util.Iterator;

// MyVectorŬ���� ����
class MyVector extends Vector<Object>
{
	//����� ���� ������
	MyVector()
	{
		//Vector(���� Ŭ����) ������ ȣ��
		super(1,1);	 //(�־����뷮, ������)			
		
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		int length =size();
		System.out.println("���� ��� �� : " + length);
		//--==>> ���� ��� �� : 4


		Object o;

		for (int i=0;i<length ;i++ )
		{
			o = elementAt(i);

			//��instanceof��������  ��CHECK��
			//--ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

			if (o instanceof String)
			{
				System.out.println("���ڿ� : "+o.toString());	//o(��ü)�� �����ϸ� class��@�ؽ��±�
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : "+o); //�����ڽ�		//int�� Integer�� �ڵ� �ڽ��ؼ� ����,,,
																	//Vector�� �⺻ �ڷ����� ���� �� ����...
			}else if (o instanceof Float)					
			{
				System.out.println("�Ǽ��� : "+o);
			}else if (o instanceof char[])
			{
				//System.out.println("���� �迭 : " + o);
				//System.out.println("���� �迭 : " + o.toString());
				System.out.println("���� �迭 : " + String.copyValueOf((char[])o));	//��CHECK��
													//String.copyValueOf((���ڹ迭)) -> ���ڿ�
			}
			else 
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�");
			}
		}

/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		//--==>> 5
		//		 3.14
		//		 �ȳ��ϼ���
		//		 [C@15db9742
*/
	}

} //end MyVector class


public class Test155
{
	public static void main(String[] args)
	{
		//MyVector Ŭ���� ��� �ν��Ͻ� ����
		MyVector v = new MyVector();

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);			//���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//���� �ڷᱸ���� ���ڹ迭 ����

		v.write();
	}
}