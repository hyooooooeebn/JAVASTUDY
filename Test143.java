/*=======================
   ��� ���� ó�� ���
==========================*/

/*
�� ���α׷����� �߻��ϴ� ������
	
	�� �߸��� ������ ����ϰų� ���� ������������ ���� ���¿���
	   ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����

	�� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����
	
	�� ���� �� �ִ�.

		- �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
		  ������ ����� �������� �Ǵ� ������ ������

		- �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����, �׸���

		- ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ� 
		  ���ܻ�Ȳ�� �ִ�.

		���� ���.
		-> � ���� 0���� �����ų�..
		-> �迭 ÷�ڸ� ����� ��Ȳ,,
		-> �������� ���� ������ �����Ͽ� �������δٰų�,,,

	==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
		������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��,
		��.��.ó.��.

�� ������ ��������~!!! (�� Exception Ŭ����)
	
	- ���ܴ����α׷� ���� �߿� �߻��� �� �ִ�
	  ��ɾ�� �������� �帧�� �����ϴ� �̺�Ʈ��
	  �ڹٿ��� ���ܴ��ϳ��� ������Ʈ�̴�.

	- ���α׷����� �߿� �޼ҵ�ȿ��� ������ �߻��ϰԵɰ��
	  �޼ҵ�� �׿����� �ش��ϴ¿��� ������Ʈ�� �����
	  �װ��� �ڹ� ��Ÿ�� �ý��ۿ� ������ �ش�.

	- �ڹٿ����� ��� ���ܴ� Throwable Ŭ������
	  Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

	- Throwable Ŭ�����¿��ܸ� �����ϴ� �����̳�
	  ���ܰ��߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

	- Throwable Ŭ�������� �Ļ��� Ŭ����

		 > Exception Ŭ����
		   Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		   ������ �� �ִ� ���� ��Ȳ����
		   �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

		> Error Ŭ����
		  �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

�� ������ ����

	- checked exception
	 �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� throws���� �޼ҵ� ������ �߻��� �� �ִ�
	 ���ܵ���������ְų� �Ǵ� �� ���ܸ� try~catch�ؼ�
	 ó�����־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� checked exception ��
	 throws �Ǵ°��� ���� Ȥ�� try-catch �Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷� ���ܸ� � ������ε� ó������ ������
	 ������ ��ü�� �Ұ����ϴ�.

	- unchecked exception
	 ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
	 ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.



�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
	
	- String toString()
	: Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
	- void printStackTrace(PrintStream s)
	- void printStackTrace(PrintSriter w)
	: ǥ�� ��½�Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�ӿ��� Ŭ����

	- ArithmeticException
	: ��ġ ������ ����
	- ArraryStoreException
	: �迭�� �߸��� ������ ���� �����Ͽ� ���� �ܿ� �߻��ϴ¿���
	- IndexOutOfBouundsException
	: �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
	- ClassCastException
	: Ŭ���� ��ȯ�� �߸��� ��� �߻��� ����
	- NullPointerException
	: �� ��ü�� �����ϴ� ��� (�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����
	- SecurityException
	: �ڹ��� ���� ���� ������ �������� ��� �߻��ϴ� ����

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{										   //���(1):���ܻ����� ������ ������... 
	public static void main(String[] args) //throws IOException
	{
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,c;

		/*
		//���(2)
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("��� : " + c);
		
		}
		catch (IOException e)
		{
			//IOException -> checked exception
			//--�޼ҵ鸦 �����ϴ� �������� throws�� ����
			//	��Ƴ��ų� ������ ���� ��� ������ ���� �߻�,
			System.out.println(e.toString());	//ThrowsŬ�������� toString()�������̵��Ϸ�
												//Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
		}*/


		/*
		//���(3)
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("��� : " + c);
		
		}
		catch (IOException e1)
		{
			//IOException -> checked exception
			//--�޼ҵ鸦 �����ϴ� �������� throws�� ����
			//	��Ƴ��ų� ������ ���� ��� ������ ���� �߻�,
			System.out.println(e1.toString());	//ThrowsŬ�������� toString()�������̵��Ϸ�
												//Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
		}
		catch (NumberFormatException e2)
		{
			// Integer.parseInt -> unchecked exception
			// ���ص� ������ �ƴ����� ������ ��찡 �����
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ϼ���.");
		}*/

		/*
		//���(4)
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("��� : " + c);
		
		}
		catch (Exception e)	//�پ��� Exception�� ���������� ó�� ����
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());

			System.out.println("printStackTrace...");
			e.printStackTrace();
		}*/

		//���(5)
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("��� : " + c);
		
		}
		catch (Exception e)
		{
			System.out.println(e.toString());	
		}
		finally		//��CHECK��
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų�...
			//������ ����Ǵ� ����

			System.out.println("�����ϼ̽��ϴ�.");
		}
		

	}
}