/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- switch��
===============================================================*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
���� ����� ���ǻ� ���������� ó��

//���� ��)
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +

 >> 20 + 14 =34
 																*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	
	{
		/*
		int a,b,op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read(); 

		
	 [�����Ѱ�]

		switch (op)
		{
		case 43: System.out.printf("%d + %d = %d\n",a,b,(a+b)); break;
		case 45: System.out.printf("%d - %d = %d\n",a,b,(a-b)); break;
		case 42: System.out.printf("%d * %d = %d\n",a,b,(a*b)); break;
		case 47: System.out.printf("%d / %d = %d\n",a,b,(a/b)); break;
		default : System.out.println("�Է¿���~!!");

		} */

		
		//��
		/*
		int a,b,op,result;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		switch (op)								//op�� int��
		{
			case 43: result =a + b;	break;
			case 45: result =a - b; break;
			case 42: result =a * b; break;
			case 47: result =a / b; break;
			default : return;					// ��CHECK ��

		}
		//		�� return Ű���尡 ���ϴ� �ΰ��� �ǹ�
		//		1. ���� ��ȯ
		//		2. �޼ҵ��� ���� -> main() �޼ҵ� ���� -> ���α׷� ����
			  															


		System.out.printf(">> %d %c %d = %d\n",a,op,b,result); 
		// %c ��� %d�� ����ϸ� '�ƽ�Ű�ڵ尪'�� ��µȴ�.	
																			*/
		

		/*
		// �� 
		int a,b,result;
		char op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();


		switch (op)								//op�� char��  -->> JDK 1.5���� ����
		{
			case '+': result =a + b;	break;
			case '-': result =a - b; break;
			case '*': result =a * b; break;
			case '/': result =a / b; break;
			default : return;					

		}
		
		System.out.printf(">> %d %c %d = %d\n",a,op,b,result); 
		// %c ��� %d�� ����ϸ� '�ƽ�Ű�ڵ尪'�� ��µȴ�.			*/
																
		
																	
		// ��
		int a,b,result;
		String op;											// ��CHECK ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine();									// ��CHECK ��
	
	
		switch (op)							//op�� ���ڿ�   // ��CHECK �� -->> JDK 1.7���� ����
		{
			case "+": result =a + b; break;
			case "-": result =a - b; break;
			case "*": result =a * b; break;
			case "/": result =a / b; break;
			default : return;					
		}
		
		System.out.printf(">> %d %s %d = %d\n",a,op,b,result); 
		

	}
}
//���� ���
/*
��
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +
20 + 14 = 34
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

��
ù ��° ���� �Է� : 4
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : -
>> 4 - 5 = -1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

��
ù ��° ���� �Է� : 4
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : -
>> 4 - 5 = -1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/