/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- �ݺ���(while) �ǽ�
===============================================================*/

/*����ڷκ��� ������ �� ������ �Է¹޾�
���� ������ ū�������� ���� ���Ͽ�
����� ����ϴ� ���α׷� ����

//���� ��)
  ù ��° ���� �Է� : 10
  �� ��° ���� �Է� : 20
  >> 10 ~ 20 ������ �� : xxx

  ù ��° ���� �Է� : 10
  �� ��° ���� �Է� : 2
  >> 2 ~ 10 ������ �� : xxx

									*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		System.out.print("ù ��° ���� �Է� : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		
		int sum=0,n;
		
		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		n=a;
		while (a<=b)
		{		
			sum += a;
			a++;
			
		}

		System.out.printf("  >> %d ~ %d ������ �� : %d\n",n,b,sum);*/

		// �� �ֿ� ���� ����
		int n;				//�������� Ȱ���� ����
		int su1,su2;		//�Է¹��� �� ����
		int result=0;			//�������� ���� ����
		
		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());
		
		//�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
	    if(su1>su2)
		{
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}
		
		//�ݺ����� ����
		//�ݺ������� �����ϱ� ����
		//���� ���� ���� �����ؼ� ���� ������ Ȱ���Ѵ�.
		//(��� ��� �������� �ʿ��ϱ� ������...)
		
		n =su1;
		
		while (n<=su2)
		{
			result += n;
			n++;
		}


		// �� ��� ���
		System.out.printf(">> %d ~ %d������ �� : %d\n",su1,su2,result);	




	}
}

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 20
  >> 10 ~ 20 ������ �� : 165
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 10
  >> 2 ~ 10 ������ �� : 54
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

//2021-07-23 ���� 12:24