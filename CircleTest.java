/*=========================================
	���� Ŭ������ �ν��Ͻ� ����
===========================================*/

// �� Test066.java ���ϰ� ��Ʈ~!!

/* [���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
	int r;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	double area() 
	{
		double result =0;

		result = r * r * 3.141592;

		return result;
	}

	double length()
	{
		double result =0;

		result = r * 2 * 3.141592;

		return result;
	}

	void print(double a, double b)
	{
		System.out.printf("�������� %d�� ����\n", r);
		System.out.printf("���̴� : %f\n", a);
		System.out.printf("�ѷ��� : %f\n", b);
	}

}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	//-- �ֿ� �Ӽ�
	int r;							//������
	final double PI = 3.141592;		//������ (������ ���ȭ)

	//-- ���(����, ����)
	//������ �Է� ���
	void input () throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	//���� ���� ���
	double calArea()
	{
		double result =0;

		result = r*r*PI;

		return result;
		
	}

	//�ѷ� ���� ���
	double calLength()
	{
		double result =0;

		result = r*2*PI;

		return result;
	}

	//��� ���
	void print(double a, double l)
	{
		System.out.printf("�������� %d�� ����\n", r);
		System.out.printf("���̴� %f\n", a);
		System.out.printf("�ѷ��� %f\n", l);
	}
}