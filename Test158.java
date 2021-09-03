/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

//���� �ڷᱸ�� ��ü ���� �� ���� ��
//����� ���� Ŭ���� Ȱ�� -> �ڷ���

import java.util.Vector;

// ����� ���� Ŭ���� ���� -> �ڷ���ó�� Ȱ��
class MyData
{
	private String name;
	private int age;

	//getXxx() -> getter
	//setXxx() -> setter

	//getter/setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//������(�Ű����� �ΰ�) -> ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//������ (�Ű����� ���� ������) -> ����� ���� ������
	public MyData()
	{
		name = "";
		age =0;
	}

}



public class Test158
{
	public static void main(String[] args)
	{
		Vector<MyData> v =new Vector<MyData>();

		//v��
		//ä���� 13��/������ 17��/������ 50��/
		//��Ƴ���
		
		
		/*
		//(1)
		MyData st1 = new MyData();
		st1.setName("ä����");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("������");
		st2.setAge(17);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(50);
		v.add(st3);
		*/


		/*
		//(2)
		MyData st1 = new MyData("ä����",13);
		v.add(st1);

		MyData st2 = new MyData("������",17);
		v.add(st2);

		MyData st3 = new MyData("������",50);
		v.add(st3);
		*/


		//(3)
		v.add(new MyData("ä����",13));
		v.add(new MyData("������",17));
		v.add(new MyData("������",50));


		// ���� �ڷᱸ�� v�� ��� ���� ��ü ����ϱ�
		// �̸� :ä����, ���� : 13��


		//(1)
		for (MyData obj : v)
			System.out.printf("�̸� : %s, ���� : %d��\n", obj.getName(),obj.getAge());
		System.out.println();

		//(2)
		for (int i=0;i<v.size() ;i++ )
			System.out.printf("�̸� : %s, ���� : %d��\n", v.elementAt(i).getName(),v.elementAt(i).getAge());
		System.out.println();

		//(3)
		for (Object temp : v)
			System.out.printf("�̸� : %s, ���� : %d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		
		




	}
}