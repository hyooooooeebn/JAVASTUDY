/*=====================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=====================================*/

// �� Test122�� ��

//import java.lang.*;

public class Test123	//extends Object
{
	/*
	...
	public String toStirng()
	{
		...;
	}
	*/
	@Override
	public String toString()
	{
		return "�������� toSting()...";
	}

	public static void main(String[] args)
	{
		Test123 ob = new Test123();
		System.out.println(ob.toString());
		//--==>> �������� toSting()...

		System.out.println(ob);
		//--==>> �������� toSting()...


	}
}