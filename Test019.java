/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
		- ��� ������
		- BufferedReader
		- printf()
================================================*/

//����ڷκ��� ������ ������ �� �� �Է¹޾� ��Ģ���� �� ������ ������ �����Ͽ�
//�� ����� ����ϴ� ���α׷� �����Ѵ�.
//��, �Է¹޴� ������ BufferedReader�� Ȱ���� �� �ֵ��� �ϰ�
//����ϴ� ������ printf() �޼ҵ带 Ȱ��
//����, ������ ������ ���ǻ� ���� ������� ó��

/*���� ��)
  ù ��° ���� �Է� : 10
  �� ��° ���� �Է� : 2

  ====[���]====
  10 + 2 = 12
  10 - 2 = 5
  10 * 2 =20
  10/2 = 5
  10%2=0 
  ==============
  */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{
		
		// �� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;


		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine());


		// �� ��� ���
		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
		System.out.printf("%d - %d = %d\n",a,b,(a-b));
		System.out.printf("%d * %d = %d\n",a,b,(a*b));
		System.out.printf("%d / %d = %d\n",a,b,(a/b));
		System.out.printf("%d %% %d = %d\n",a,b,(a%b));
		System.out.printf("==============\n");

	}
}


//�������
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/