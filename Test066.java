/*=========================================
	���� Ŭ������ �ν��Ͻ� ����
===========================================*/

//// �� CircleTest.java ���ϰ� ��Ʈ~!!
/*
	���� ���̿� �ѷ� ���ϱ�
	���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
	(Ŭ������ : CircleTest) -> CircleTest.java

	���� ���� = ������ * ������ * 3.141592
	���� �ѷ� = ������ * 2 * 3.141592

	���� ��)
	������ �Է� : 13

	�������� 13�� ����
	���� : xxxxx
	�ѷ� : xxxxx

*/

/*
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ct = new CircleTest();

		ct.input();

		double a=ct.area();

		double b =ct.length();

		ct.print(a,b);

	}
}

//���� ���
/*
������ �Է� : 13
�������� 13�� ����
���̴� : 530.929048
�ѷ��� : 81.681392
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		// CircleTest Ŭ���� �ν��Ͻ� ����
		CircleTest ob = new CircleTest();

		// ������ �ν��Ͻ� ob�� ���ؼ� ������ �Է� �޼ҵ� ȣ��
		ob.input();

		double a = ob.calArea();

		double b = ob.calLength();

		ob.print(a,b);

	}
}
