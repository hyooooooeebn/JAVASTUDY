/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- if ~ else�� �ǽ�
===============================================================*/

/*

//���� ��)
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 15
�� ��° ���� �Է� : 10

>> ���� ��� : 5 10 15
 																*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,c;					//--����ڰ� �Է��ϴ� ������ ���� 


		
		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());



		if(a>b)						//��CHECK�� else�� ������� �ʰ� if�� ����Ѵ�.
		 {							//	��� ���� �����ؾ��ϱ� ������ else�� �ȵȴ�.
			a=a^b;
			b=b^a;
			a=a^b;
			
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");
		  }

		if (a>c)
		 {
			a=a^c;
			c=c^a;
			a=a^c;

			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");
		 }

		if (b>c)
	     {
			b=b^c;
			c=c^b;
			b=b^c;

			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");
		  }



		// �� ��� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n",a,b,c);

	}
}
//���� ���
/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 15
�� ��° ���� �Է� : 10
>> ���� ��� : 5 10 15����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/