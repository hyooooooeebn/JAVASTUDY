/*===============================================
	  ���� ����(sort) �˰��� ����
=================================================*/

/*
	����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
	������ ���� ������ ���� ������ ����� �ο��Ͽ�
	����� ����ϴ� ���α׷��� ����
	��, �迭�� ���� �˰����� Ȱ��� �ۼ�

	���� ��)
	�ο� �� �Է� : 5
	�̸� ���� �Է�(1) : 
	�̸� ���� �Է�(2) :
	�̸� ���� �Է�(3) : 
	�̸� ���� �Է�(4) :
	�̸� ���� �Է�(5) : 

	---------------------
	1�� �̸� ���� 
	2��
	3��
	4��
	5��
	----------------------
*/
import java.util.Scanner;

public class Test106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String name;
		int score;
		String temp =" ";
		

		System.out.print("�ο� �� �Է� : ");
		n = sc.nextInt();

		int[] arr = new int[n];
		String[] names = new String[n];

		for (int i=0;i<n ;i++ )
		{
			System.out.printf("�̸� ���� �Է�(%d) : ",i+1);
			name = sc.next();
			score = sc.nextInt();
			names[i] = name;
			arr[i] = score;

		}  

		for (int i=0;i<arr.length ;i++ )			//��������
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]<arr[j])
				{
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[j]^arr[i];
					arr[i]=arr[i]^arr[j];

					temp = names[i];
					names[i]=names[j];
					names[j] = temp;
				}
			
			}
		}//end sort

		System.out.println("---------------------");
		for (int k=0;k<n ;k++ )
		{
			System.out.printf("%d�� ",k+1);
			System.out.print(" " + names[k]);
			System.out.print(" " + arr[k]);
			System.out.println();
			
		}
		System.out.println("---------------------");


		

	}
}