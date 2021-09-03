/*================================================
		���� �ڹ� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
==================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[] args) throws IOException 
		// throws IOException�� �Թ����� ����� ���� ������ �������ϰ� ���� ����
		// br.readLine()�� ����ϱ� ����
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	


		//�ֿ� ���� ����
		int r;
		final double PI = 3.141592;
		double a, b;


		//���� ó��
		//�� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");

		//�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r ��ƿ���
		//r = br.readLine(); -> ���ڿ� �޾ƿ���
		//Integer.parseInt() -> ���ڿ� �����͸� ���������� ��ȯ
		r = Integer.parseInt(br.readLine());
		/*-- ����ڰ� �Է��� ���� BufferedReader(br)�� ��readLine()��
			 �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
			 �� ���� ��Integer.parseInt()���� ���� ���������� ��ȯ ��
			 ���� ������ ������ ���� r�� ��Ƴ���*/


		//�� ���� �� �ѷ� ����
		a = r*r*PI;
		b = r*2*PI;

		//��� ���
		//System.out.println(">> ���� : " + a);
		//System.out.println(">> �ѷ� : " + b);

		//System.out.printf(">> ���� : %f\n", a);
		//System.out.printf(">> �ѷ� : %f\n", b);

		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", b);
		//--��%f���� ���� ��¿� �޼ҵ忡�� �Ǽ����� ��Ƴ��� �ɼ� ����
		//	��.2%f���� �Ҽ��� ���� ��°�ڸ����� ǥ��
		 
	
	}
}

//�������
/*
���� ������ �Է� : 45
>> ���� : 6361.72
>> �ѷ� : 282.74
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/