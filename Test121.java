/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)

	- awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ����� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
	  ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó��

�� ���� �� ����
	
	new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
	};			//�����ݷ� check��
*/


//import java.lang.*;

class Test3	//extends Object		--��� class�� objectŬ������ ��ӹ޴´�,,,	
{
	/*
	object Ŭ������ �����,,,
	...
	public String toString()
	{
		,,,;
	}
	*/

	public Object getString()
	{
		/* ��
		Object result;
		result  = new Object();
		return result;
		*/

		/* ��
		return new Object();
		*/

		return new Object()
		{
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};		//--�����ݷ� check��



	}//end getString()
}// end class Test3



public class Test121 // extends Object
{
	/*
	Object�� ���� �ִ� �����,,,
	*/

	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());			//Object�� ������ �ִ� toString �ڵ� ���
		//--==>> Test3@15db9742

		Test121 ob3= new Test121();
		System.out.println(ob3.toString());
		//--==>> Test121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> �͸��� Ŭ����...


		
	}
}