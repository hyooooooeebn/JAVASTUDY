/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	-�ڹ��� �⺻ ����� : java.util.Scanner
================================================*/


//�̸��� ������ �ѹ��� �Է¹޴� Scanner

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// �� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat,tot;


		// �� ���� �� ó��
		System.out.print("�̸� �������� �������� �������� �Է�(���鱸��) : ");

		//-����ڰ� �Է��� �����͸� ������ ������ ��Ƴ���
		name = sc.next();
		kor =sc.nextInt();
		eng =sc.nextInt();
		mat =sc.nextInt();

		//���� ����
		tot = kor + eng + mat;

		
		// �� ��� ���
		System.out.println();
		System.out.println(" >> �̸� : " + name);
		System.out.println(" >> ���� : " + tot);

	}
}

/*
�̸� �������� �������� �������� �Է�(���鱸��) : ��ȿ�� 70 70 70

 >> �̸� : ��ȿ��
 >> ���� : 210
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/