/*==========================
	 ���� �迭 ����
	 - �迭�� ����� �ʱ�ȭ
     - �迭�� �⺻�� Ȱ��
============================*/

/*
	����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ��
	�л� �̸��� ��ȭ��ȣ�� �Է¹ް�
	�Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
	��, �迭�� Ȱ���Ͽ� ó��

	���࿹)
	�Է� ó���� �л� �� �Է�(��, 1~10) : 24
	�Է� ó���� �л� �� �Է�(��, 1~10) : 3
	�̸� ��ȭ��ȣ �Է�[1](���� ����) : 
	�̸� ��ȭ��ȣ �Է�[2](���� ����) : 
	�̸� ��ȭ��ȣ �Է�[3](���� ����) : 

	-------------------
	��ü �л� �� : 3��
	-------------------
	 �̸�	��ȭ��ȣ




	--------------------

*/


/* [���� �� Ǯ��]
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n =sc.nextInt();
		}
		while (n<1 || n>10);


		String[] name = new String[n];
		String[] ph = new String[n];

		for (int i=0; i<n ;i++ )
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(i+1));
			name[i] = sc.next();
			ph[i] = sc.next();
		}

		System.out.println("-------------------");
		System.out.printf("��ü �л� �� : %d��\n",n);
		System.out.println("-------------------");



		for (int a=0; a<n ;a++ )
		{
			System.out.println(name[a] +"     " + ph[a] );
		}

		
		System.out.println("--------------------");


	}
}

//���� ���
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ���ϳ� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �ڵ� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : �̼� 010-3333-3333
-------------------
��ü �л� �� : 3��
-------------------
���ϳ�  010-1111-1111
�ڵ�  010-2222-2222
�̼�  010-3333-3333
--------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

//[���� �� Ǯ��]
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л� ���� ��Ƶ� ����
		int memCount =0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount =sc.nextInt();
		}
		while (memCount<1 ||memCount>10);

		// �迭 ����(�̸� �迭, ��ȭ��ȣ �迭) - ����ڷκ��� �Է¹��� �ο��� ��ŭ�� �迭�� ����

		// �̸� ���� �迭
		String[] names = new String[memCount];

		// ��ȭ��ȣ ���� �迭
		String[] tels = new String[memCount];
		//��String[] tels = new String[names.length];�� �� ����


		for (int i=0; i<memCount ;i++ )		//memCount = names.length = tels.length
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(i+1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// ������� ���
		System.out.println();
		System.out.println("-------------------");
		System.out.printf("��ü �л� �� : %d��\n",memCount);
		System.out.println("-------------------");
		System.out.println("�̸�	   ��ȭ��ȣ\n");



		for (int m=0; m<memCount ;m++ )
		
			System.out.printf("%4s %14s\n",names[m], tels[m] );
		

		
		System.out.println("--------------------");


	}
}
