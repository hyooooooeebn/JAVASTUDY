/*   ==============================
   ��� �ڹ��� �ֿ� Ŭ�������
   - Calendar Ŭ����
   ==============================*/

/*
��  java.util.Calendar Ŭ������
	��¥�� �ð��� ���� �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �ʱ�����
	�ð��� ��¥�� ���õ� ������ �����Ѵ�.
	�׸��� Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ CalendarŬ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance() ��� ���� �޼ҵ带 �̿���Ͽ� �F�Ը� ������ �� �ִ�.
	������ Calendar Ŭ���� ������ �ý����� ���� ������ �ð� ������ ������,
	get()�޼ҵ带 �̿��Ͽ� ���� ������ ���ִ�.

	getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� �� �ִ�.

	//�ǽ� ����
	// ����ڷκ��� ��,���� �Է¹޾�
	//�޷��� �׷��ִ� ���α׷��� �����Ѵ�.
	//��, ���� �޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ�

	���࿹)
	���� �Է� : 0
	���� �Է� : 2021
	�� �Է� : -2
	�� �Է� : 8

	[2021�� 8��]

 �� �� ȭ �� �� �� �� 
 ====================
 1  2  3  4  5  6  7 
 8  9 10 11 12 13 14 
15 16 17 18 19 20 21 
22 22 23 24 25 26 27
28 29 30 31
 ====================
*/

import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.io.*;

public class Test139
{
	public static void main(String[] args) throws IOException
   {
		/* [���� �� Ǯ��]
		Calendar c = new GregorianCalendar();
		
		Scanner sc = new Scanner(System.in);
		
		int y,m;
		do
		{	
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y==0);

		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m>12 || m<1);

		
		
		
		c.set(y,m-1,1);
		int w = c.get(Calendar.DAY_OF_WEEK);	//�Է� ���� ���� ����,,.
		//System.out.println(w);
		//1 - 0
		//2 - 1

		
		
		
		
		System.out.println();
		System.out.printf("\t[%d�� %d��]\n",y,m);
		System.out.println();
		System.out.println("   ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("==============================");

		int n=0;
		for (int a=1; a<w ;a++ )
		{
			System.out.print("    ");
			n++;
		}


		for (int i =1 ;i<=c.getActualMaximum(Calendar.DATE) ;i++ )				//������ ��¥ �޾Ƴ���,,,,
		{
			System.out.printf("%4d",i);
			
			if ((i+n)%7==0)
				System.out.println();
			
		}


		
		System.out.println();
		System.out.println("===============================");
		*/
		

		//[���� �� Ǯ��]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar cal = Calendar.getInstance();

		//�ֿ� ���� ����
		int y,m;
		int w;


		do
		{	
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y==0);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m>12 || m<1);

		
		// ����ڷκ��� �Է¹��� ��, ���� �̿��Ͽ�
		// �޷��� ��¥ ����

		cal.set(y,m-1,1);
		//--�� ���� �� �Է°��� �״�� ����ϴ� ���� �ƴ϶�
		//	�Է°����� 1�� �� ������ �� ����
		//--�� ���� �� �Է¹��� ��,���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		//���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		// 1 -> �Ͽ���


		//��°��
		System.out.println();
		System.out.printf("\t[%d�� %d��]\n",y,m);
		System.out.println();
		System.out.println("   ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("==============================");
	
		// ���� �߻�
		int i;
		for (i=1; i<w ;i++ )
			System.out.print("    ");		


		//�� getActualMaxium() �޼ҵ�
		for (i =1 ;i<=cal.getActualMaximum(Calendar.DATE); i++ )	//cal.getActualMaxium(m-1)
		{
			System.out.printf("%4d",i);
			w++;		//--�ݺ����� �����ϸ� ��¥�� ������ �� ����
						//	���ϵ� �Բ� ������ �� �ֵ��� ó��

			if (w%7==1)	//--������ ������ �Ͽ����̸� ����
				System.out.println();	
		}


		if (w%7!=1)
			System.out.println();

		System.out.println("===============================");


	
   }
}