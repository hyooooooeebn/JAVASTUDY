/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	-�ڹ��� �⺻ ����� : java.util.Scanner
================================================*/

/* �� java.util.Scanner
	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
	  �ٸ� ����(�ڷ���)�� ������ ��Ȳ�� �� �ִ�. */

import java.util.Scanner;

public class Test016	 
{
	public static void main(String[] args)
	{
		// �� �ֿ� ���� ����


		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		String name;
		int kor,eng,mat;


		// �� ���� �� ó�� 
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();   // br.readLine();

		System.out.print("���� ���� �Է� : ");
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();


		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();


		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();



		// �� ��� ���
		System.out.println();
		System.out.println(" >> �̸� : " + name);
		System.out.println(" >> ���� : " + (kor + eng + mat));
		//��������� �����ϱ� ���� ()�� ����Ѵ�.
		

	}
}
//���� ���
/*
�̸��� �Է��ϼ��� : ȿ��
���� ���� �Է� : 60
���� ���� �Է� : 70
���� ���� �Է� : 40

 >> �̸� : ȿ��
 >> ���� : 170
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/