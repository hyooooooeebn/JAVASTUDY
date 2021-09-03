 /*===================================
	 ���� Ŭ������ �ν��Ͻ� ����
	 - Ŭ������ �ν��Ͻ� Ȱ��
======================================*/

/*
	2. Sungjuk 
	-�ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
	 ��÷, ����� �����ϴ� Ŭ���� ����
	 *�Ӽ� : �ο� ��, record ������ �迭
	 *��� : �ο� �� �Է�, �� ������ �Է�, ���� ��� ����, ��� ���
*/

import java.util.Scanner;

public class Sungjuk
{
	
	// �ֿ� �Ӽ� ����(�ֿ� ���� ����)
	int inwon;		//�ο���
	Record[] rec;	//Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
					//Record�� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
	
	

	// �ֿ� �޼ҵ� ����(��� ����)
	//�� �ο�  �� �Է�
	public void set() 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon>100 || inwon<1);

		//Record Ŭ������ ������� ������ ��ü�� ���� �� �ִ� 
		//�迭 ���� inwon ��ŭ ����
		rec = new Record[inwon];								//��CHECK��
		//--Record�迭���� inwon��ŭ ����
		//	Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
	
	}

	// �� �� ������ �Է�(����, ��� ���� ��� ����)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};

		//�ο� �� ��ŭ �ݺ�
		for (int i = 0; i<inwon ;i++ )		//inwon = rec.length
		{
			
			/* //Record Ŭ���� ����� �ν��Ͻ� ����
			Record ob = new Record();								
			rec[i] = ob;
			*/
			rec[i] = new Record();										//��CHECK��

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			rec[i].name = sc.next();
/*
			System.out.print("���� ���� : ");
			rec[i].kor = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].eng = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].mat = sc.nextInt();
*/
			for (int j=0;j<title.length; j++ )
			{
				System.out.print(title[j]);

				//����ڰ� �Է��� �����͸� score �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();			// i��° �л��� score[0]  -> ��������
														// i��° �л��� score[1]  -> ��������
														// i��° �л��� score[2]  -> ��������
				
				// ���� �����ϱ�
				rec[i].tot += rec[i].score[j];


			}

			//��� ����
			rec[i].avg = rec[i].tot / 3.0;


		}
		
	}

	// �� ��� ���
	public void print()
	{   ranking();
		System.out.println();

		// �л� �Ѹ� �� �ݺ� ��±��� ����
		for (int i =0;i<inwon ;i++ )
		{
			System.out.printf("%5s",rec[i].name);

			for (int j=0;j<3 ;j++ )
				System.out.printf("%4d", rec[i].score[j]);

			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);
			System.out.printf("%5d", rec[i].rank);
			System.out.println();
		}
		
	}// end print()


	// �� ���� ���� �޼ҵ� �߰�
	//	- Record �迭�� rank �Ӽ� �ʱ�ȭ ��� -> ��ȯ �ڷ��� void
	//	- Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� -> �������� ������ private
	private void ranking()
	{
		int i, j;			//���� ����

		// ��� �л����� ���(���� rank)�� 1�� �ʱ�ȭ

		for (i=0;i<inwon ;i++ )
		
			rec[i].rank = 1;
		
		for (i=0; i<inwon-1;i++)					//�� ���� 0 1 2
		{
			for (j=i+1; j<inwon; j++)				//�� ��� 123 23 3
			{
				if (rec[i].avg > rec[j].avg)		//�񱳱����� ����� �񱳴���� ��պ��� ũ��,,,
				
					rec[j].rank++;					//�񱳴���� rank�� 1��ŭ ����
				
				else if(rec[j].avg > rec[i].avg)    //�񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�,,,
				
					rec[i].rank++;					//�񱳱����� rank�� 1��ŭ ����
				
			}
		}
	}




}//end class Sungjuk