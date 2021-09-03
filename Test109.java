/*=============================
	���� Ŭ���� ��� ����
	  - ��� (Inheritance)
==============================*/

/*
	������ ���� ���α׷��� �����Ѵ�.
	��, ����� ������ �����Ͽ� �ۼ��� ���ֵ��� �Ѵ�.

	���� ��)
	������ �� ���� �Է�(���� ����) : 20 15
	�������Է�(+ - * /) : -
	>> 20 - 15 = 5.00
*/

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}
}

/* [���� �� Ǯ��]
class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}

	Bclass()		
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("�������Է�(+ - * /) : ");
		op = (char)System.in.read();

	}

	double a =0;

	public double cal()
	{
		switch (op)
		{
			case  '+' : a=x+y; break;
			case  '-' : a=x-y; break;
			case  '*' : a=x*y; break;
			case  '/' : a=(double)x/y; break;
	
		}
		return a;
	}

}


public class Test109
{
	public static void main(String[] args)
	{
		Bclass ob = new Bclass();
		ob.cal();
		ob.write(result);
	}
}*/


//[���� �� Ǯ��]
class Bclass extends Aclass	 //Aclass ��� ���� �ڽ� Ŭ����
{
	/* == ��� ���� �κ�
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}
	*/

	/*
	Bclass()
	{
		super();
	}*/


	//�Է�
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		String temp = br.readLine();	//"20 15" -> ��ü�� ���ڿ��� �Է¹޾� �´�
		String[] strArr = temp.split("\\s");	//������ �� ����	\s�� �����̴�.		��CHECK�� 
		//String[] strArr = {"20", "15"};

		//�� ���ڿ�.split("������")								//��CHECK��
		//	ex) "10 20 30 40".split("\\s");
		//		�� {"10","20","30","40"}; ��ȯ

		if (strArr.length != 2)		//�Է� ���� ������ 2���� �ƴϸ�
			return false;			//false�� ��ȯ�ϸ� input() �޼ҵ� ����
									//�������� �����Ұ��...
									//�� �ڵ��� �Ʒ��� �����ؾ��� �ڵ尡���Ҵ���
									//����...

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		System.out.print("�������Է�(+ - * /) : ");
		op = (char)System.in.read();

		if (op != '+' && op != '-' && op != '*' && op != '/' )	//�س������� ����
			return false;

		return true;
		

	}// end input()


	double calc()
	{
		double result = 0;

		switch (op)
		{
			case  '+' : result=x+y; break;
			case  '-' : result=x-y; break;
			case  '*' : result=x*y; break;
			case  '/' : result=(double)x/y; break;
	
		}

		return result;


	}//end calc()
	

}//end Bclass

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
		
	} //end main()
}//end class Test109


//�������
/*
������ �� ���� �Է�(���� ����) : 20 15
�������Է�(+ - * /) : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/