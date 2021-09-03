/*=========================================
	���� Ŭ������ �ν��Ͻ� ����
===========================================*/

/*
	����ڷκ��� ������ ������ �Է¹޾�
	1���� �Է¹��� �� ������ ���� �����Ͽ�
	��� ���� ����ϴ� ���α׷��� �����Ѵ�.

	��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
	����, �Է� ó�� �������� BufferedReader�� Ȱ���ϸ�, 
	�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
	�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷� ����

	���� �� )
	������ ���� �Է�(1~1000) : 1022
	������ ���� �Է�(1~1000) : -20
	������ ���� �Է�(1~1000) : 100
	>> 1���� 100������ �� : 5050

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// �ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	int n;

	//�Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
		    n = Integer.parseInt(br.readLine());
		}
		while (1 > n || n > 1000);
		
	}


	// ���� ó�� �޼ҵ� ����
	int sum()
	{	
		int result =0;
		for (int a=1; a<=n ;a++ )
		result +=a;
		return result;
	}
	

	//��� ��� �޼ҵ� ����
	void print(int result) 
	{
		System.out.printf(">> 1���� %d������ �� : %d\n",n,result);		
	}

}

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();
		ob.input();
		int a = ob.sum();
		ob.print(a);
	}
} 

//�������
/*
������ ���� �Է�(1~1000) : 1023
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 90
>> 1���� 90������ �� : 4095
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

