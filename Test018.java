/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	-�ڹ��� �⺻ ����� : java.util.Scanner
================================================*/

//��ȿ��,100,20,40 �Է�

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// �� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat, tot;


		// �� ���� �� ó��
		System.out.print("�̸�,��������,��������,�������� �Է�(��,������) : ");
		sc =new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		/*             ----------     --------- ----- -----
		                �Է¹�����     ������  ������ ���ڿ�  */

		
		name = sc.next();
		kor =sc.nextInt();
		eng =sc.nextInt();
		mat =sc.nextInt();
		
		tot = kor+eng+mat;

		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot );
	}
}

//���� ���
/* 
�̸�,��������,��������,�������� �Է�(��,������) : ��ȿ��,100,20,40

>> �̸� : ��ȿ��
>> ���� : 160
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/