 /*===================================
	 ���� Ŭ������ �ν��Ͻ� ����
	 - Ŭ������ �ν��Ͻ� Ȱ��
======================================*/

/*
	1~3 ������ ������ �߻����Ѽ�
	���� ���� �� ���� ���α׷��� �����Ѵ�.
	��, Ŭ������ ������ Ȱ���Ͽ� ó��
	���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
	���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

	�� ���� ������ -> 1:���� 2:���� 3:��

	���� ��)
	1:���� 2:���� 3:�� �� �Է�(1~3) : 2

	- ���� : ����
	- ��ǻ�� : ��

	>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
*/

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	// [���� �� Ǯ��]
	private int user;
	private int com;

	String[] arr = {"����", "����", "��"};			// 0���� 1���� 2�� 


	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user>3 || user < 1);

		System.out.printf("- ���� : %s\n", arr[user-1]);

	}


	public void random()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;

		System.out.printf("- ��ǻ�� : %s\n",arr[com-1]);

	}

	

	public void print()
	{

		
		String result = "���º��Դϴ�.";


		if ((user==1 && com ==3)||(user ==2 && com == 1)||(user ==3 && com ==2))	//����� ��
		
			result = " ������ �̰���ϴ�.";
	
		
		else if ((user==1 && com==2)||(user==2 && com==3)||(user==3 && com==1))			//��ǻ�� ��
		
			result = "��ǻ�Ͱ� �̰���ϴ�";
			
			System.out.println(">> �º� ���� ��� : " + result);	
	}
}

public class Test098
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.random();
		ob.print();
	}
}

//�������
/*
1:���� 2:���� 3:�� �� �Է�(1~3) : 2
- ���� : ����
- ��ǻ�� : ����
>> �º� ���� ��� :  ������ �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/


	


/*
	// [���� �� Ǯ��]

	private int user;
	private int com;

	public void random()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;

	}

	//public void 
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while ( user < 1 || user>3 );

	}

	//�߰� ��� ���
	public void middleCalc()
	{	
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println("- ���� : " + str[user-1]);
		System.out.println("- ��ǻ�� : " + str[com-1]);
	}


	//�ºο� ���� ��� ����
	public String resultCalc()
	{ 
		String result = "���º��Դϴ�.";


		if ((user==1 && com ==3)||(user ==2 && com == 1)||(user ==3 && com ==2))	//����� ��
		
			result = " ������ �̰���ϴ�.";
		
		else if ((user==1 && com==2)||(user==2 && com==3)||(user==3 && com==1))			//��ǻ�� ��
		
			result = "��ǻ�Ͱ� �̰���ϴ�";
		

		return result;
		
	}


	public void print(String str)
	{
		System.out.printf(">> �º� ���� ��� : %s\n",str);
	}
	
	


}

public class Test098
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}
*/