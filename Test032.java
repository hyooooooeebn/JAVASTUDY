/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- if ~ else�� �ǽ�
===============================================================*/


/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��,if���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
���� ����� ���ǻ� ���������� ó��

//���� ��)
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +

 >> 20 + 14 =34
 																*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{

		
		/*
		//��� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		char c;						//��Strig c;���� �Ұ��� -> ���ڿ� ���ϴ� �� ��
		int d=0;
		
		System.out.print("ù ��° ���� �Է� : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		c = (char)System.in.read();								//��CHECK��
		//		  ----------------					
		//			    int ��
		//��System.in.read()���ϳ��� ���ڸ� �޾ƿ��� �޼ҵ�
	 

		if(c=='+')				//43==43 -> �ƽ�Ű�ڵ尪
		{
			System.out.printf("%d + %d = %d",a,b,(a+b));

		} else if (c=='-')
		{
			 System.out.printf("%d - %d = %d",a,b,(a-b));

		} else if (c =='*')
		{
			System.out.printf("%d * %d = %d",a,b,(a*b));
			
		}else if (c=='/')
		{
		    System.out.printf("%d / %d = %d",a,b,(a/b));
			
		} else
		{ 
			System.out.println("������ �����Դϴ�.\n");

		} */


		/*
		//��� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a,b,c;
		
		System.out.print("ù ��° ���� �Է� : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		c = System.in.read();							
	
		

		if(c==43)  //43==43 -> �ƽ�Ű�ڵ尪
		{
			System.out.printf("%d + %d = %d",a,b,(a+b));
		} else if (c==45)
		{
			 System.out.printf("%d - %d = %d",a,b,(a-b));
		} else if (c ==42)
		{
			System.out.printf("%d * %d = %d",a,b,(a*b));	
		}else if (c==47)
		{
		    System.out.printf("%d / %d = %d",a,b,(a/b));	
		} else
		{ 
			System.out.println("������ �����Դϴ�.\n");
		} */



		// ��� ��		��CHECK��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a,b,result=0;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();							
	
		

		if(op=='+')  
			 result = a + b;
		else if (op=='-')
			 result = a - b;
	    else if (op=='*')
			result = a * b;	
		else if (op=='/')
		    result = a/b;
		else
			System.out.print("������ �����Դϴ�.\n");
		
		 
		System.out.printf("\n >> %d %c %d = %d",a,op,b,result);
	

	}
}

//�������
/*
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +
 >> 20 + 14 = 34
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/