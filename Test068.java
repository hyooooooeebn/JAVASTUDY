/*=========================================
	���� Ŭ������ �ν��Ͻ� ����
===========================================*/

/*
	����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
	��Ģ������ �����ϴ� ���α׷��� ����
	��, Ŭ������ �ν��Ͻ��� ������ Ȱ��

	���� ��)
	������ �� ���� �Է�(���� ����) : 10 5
	������ ������ �Է�(+ - * /) : +
	>> 10 + 5 = 15
*/

import java.util.Scanner;
import java.io.IOException;

class cal
{
	//�ֿ� ���� ����
	int a,b;
	char c;

	// �޼ҵ� ���� (��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);	//���鱸���ϸ� Scanner����ϱ�
												//�� CHECK ��
		
		System.out.print("������ �� ���� �Է�(���� ����) : "); 
						
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		c = (char)System.in.read();
	}


	// �޼ҵ� ���� (��� : ����)
	int op()
	{	
		
		int result = 0; 

		/* [���� �� Ǯ��]
		if (c=='+')
			result = a+b;
		if (c=='-')
			result = a-b;
		if (c=='*')
			result = a*b;
		if (c=='/')
			result = a/b;
		
		return result;
		*/

		switch(c)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}
		return result;
	}


	// �޼ҵ� ���� (��� : ���)
	void print(int d)
	{
		System.out.printf(">> %d %c %d = %d\n",a,c,b,d);
	}
}


public class Test068
{
	public static void main(String[] args) throws IOException
	{
		cal ob = new cal();

		ob.input();
		int a = ob.op();
		ob.print(a);

	}
}

//�������
/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������ �Է�(+ - * /) : +
>> 10 + 5 = 15����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/