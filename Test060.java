/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- break
===============================================================*/

/*
�Ʒ��� ���� ó���� �̷������ ���α׷��� �����Ѵ�.
��, �Է¹��� ������ 1~100 ���� �ȿ�����
�����ϵ��� �ۼ��Ѵ�.

���࿹ )

������ ���� �Է� : -20

������ ���� �Է� : 0

������ ���� �Է� : 2021

������ ���� �Է� : 10
>> 1 ~ 10������ �� : 55
����Ͻðڽ��ϱ�?(Y/N) : y

������ ���� �Է� : 100
>> 1 ~100������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : n


*/

/* [���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int a,n=1;
		char answer;
		
		 for (; ; )
		{
			
			System.out.print("������ ���� �Է� : ");
			a= Integer.parseInt(br.readLine());
			
			if (1<=a && a<=100)
			{
				int sum=0;
				for ( n=1; n<=a; n++ )
				{
					sum += n;
				}

				System.out.printf(">> 1 ~ %d������ �� : %d\n",a,sum);
				System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
				answer = (char)System.in.read();
				System.in.skip(2); 

				System.out.println();

				if (answer== 'Y' || answer =='y')
				
				continue;
				
				else if (answer== 'N' || answer =='n')
				
				break; 
				
				
			} 

		}





	}
}
//�������
/*
������ ���� �Է� : -20
������ ���� �Է� : 0
������ ���� �Է� : 2021
������ ���� �Է� : 10
>> 1 ~ 10������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : y

������ ���� �Է� : 100
>> 1 ~ 100������ �� : 5050
����Ͻðڽ��ϱ�(Y/N)? : n

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/



//[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n,s=0,i;
	
		char ch;		//�����������


		//���� �ݺ���
		while(true)
		{
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

		//�׽�Ʈ
		///Sytem.out.print("��ȿ����");
			
			s=0;		//������ ������ �ʱ�ȭ ��ġ
			

			for (i=1;i<=n ;i++ )
			{
				s+=i;
			}

			System.out.printf(">> 1~%d������ �� %d\n",n,s);
	
			System.out.printf("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch =(char)System.in.read();



			//�׸��ҷ� �ǻ�ǥ��
			//if (ch=='n' || ch=='N')
			if (ch != 'Y' && ch != 'y')						//��CHECK�� 
															//�������� �������� �ٲ� �� || -> &&
				//�ݺ����� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//--���� ���� �ǻ�ǥ���� �޴ٸ�
				//  �׵��� �����ߴ� �ݺ����� ���߰� ����������.
				break; //����� �׸��� ����������. 

			
			System.in.skip(2);			//enter�� skip�ʿ���  ��CHECK��



		}//end while



	}//end main()

}//end test060


//�������

/*
*/