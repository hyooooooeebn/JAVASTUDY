/*================================ 
	���� Ŭ���� ��� ����
	 - �������̽�(Interface)
================================== */

/*
�� �ǽ� ����
   ���� ó�� ���α׷��� �����Ѵ�.
   ��, �������̽� Ȱ��

   ���� ��)
   �ο� �� �Է�(1~10) : 2
   1��° �л��� �й� �̸� �Է�(���鱸��) :
   ���� ���� ���� ���� �Է�	  (���鱸��) : 
   2��° �л��� �й� �̸� �Է�(���鱸��) :
   ���� ���� ���� ���� �Է�	  (���鱸��) : 

   �й� �̸�	 90 100 85		275		91
   				 ��  �� ��
   �й� �̸�	 85 70 65		220		73
   				 �� �� ��
	
*/

import java.util.Scanner;

//�Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��
class Record
{
	String hak,name;
	int kor,eng,mat;
	int tot, avg;
}

//�������̽�
interface Sungjuk
{
	public void set();		//�ο� �� ����
	public void input();	//�� ������ �Է�
	public void print();	//��� ���
}


//���� �ذ� �������� �����ؾ� �� Ŭ���� -> Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	int n;
	Record[] rec;


	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		rec = new Record[n];
	}

	

	@Override
	public void input()	
	{
		Scanner sc = new Scanner(System.in);
		

		for (int i =0;i<n ;i++ )
		{
			
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���鱸��) : ",i+1);
			rec[i].hak = sc.next();
			rec[i].name =sc.next();

			System.out.print("���� ���� ���� ���� �Է�	  (���鱸��) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;

			a = panjung(rec[i].kor/10);
			b = panjung(rec[i].eng/10);
			c = panjung(rec[i].mat/10);
			
		}	
	}

	public String panjung(int score)
	{
		char result;
		switch (score)
		{
			case 9 : case 10 : result ='��'; break;
			case 8 : result ='��'; break;
			case 7 : result ='��'; break;
			case 6 : result ='��'; break;
			
		}
		return result;
			
	}


	@Override
	public void print()
	{
		for (int i=0;i<n ;i++ )
		{
			
			System.out.printf("%13s",rec[i].hak);
			System.out.printf("%4s",rec[i].name);
			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d\n",rec[i].avg);
		
			System.out.print("%21c %4c %4c",a,b,c);
		}
	}


}

//main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		//���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}