/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	-�ڹ��� �⺻ ����� : 
================================================*/

public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n"); //������ ���ڿ� �ȿ� �ؾ��Ѵ�
		//--==> AAABBBCCC
		

		System.out.println(); //����
	  //System.out.print(); //������ ����
		

		System.out.printf("12345");		//print()�� ����
		System.out.printf("12345\n");	//����
		System.out.printf("12345%n");	//����


	  //System.out.printf(); //������ ����
	    
		System.out.printf("%d + %d =%d\n",10,20,30);  //�⺻ ����
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123); 
		//�� �ڸ��� 10�ڸ� --==> -------123
		System.out.printf("%08d\n",1234); 
		//���� �տ� 0�� ������ 0���� ä������. --==> 00001234]


		System.out.printf("%+d\n",365);
		//--==> +365
		System.out.printf("+%d\n",365); // ���̰ɷ� ����ϱ�
		//--==> +365
		System.out.printf("%d\n",+365);
		//--==> 365


		
	  //System.out.printf("%-d\n",365);  //��Ÿ�� ����
		System.out.printf("-%d\n",365);  //--==> -365
		System.out.printf("%d\n",-365);  //--==> -365



		System.out.printf("%(d\n",-365); //--==> (365)
		System.out.printf("%(d\n",365);  //--==>  365
		//%�� d ���̿� ��(���� ������ ()�ȿ� ����� �׳� ǥ��



	  //System.out.printf("%d\n",'A'); --==> ��Ÿ�ӿ���
		//printf()�ȿ� �Ű������� �� ������ ������ ������ �����ʴ´�.
		//�Ű������� �������� ��� ��Ÿ�ӿ��� �߻�
		System.out.printf("%c\n",'A');


	  //System.out.printf("%c\n","ABCD"); --==> ��Ÿ�ӿ���
	    System.out.printf("%s\n","ABCD");


		System.out.printf("%h\n", 365); //16����
		//--==> 16d
		System.out.printf("%o\n",24);   //8����
		//--==> 30

		System.out.printf("%b\n",true);
		//--==> true

		System.out.printf("%f\n",123.23);
		//--==> 123.230000
		System.out.printf("%.2f\n",123.23);
		//--==> 123.23
		System.out.printf("%.2f\n",123.231);
		//--==> 123.23
		System.out.printf("%.2f\n",123.236);
		//--==> 123.24


		System.out.printf("%8.2f\n",123.236); 
		//�� 8ĭ Ȯ��(�Ҽ�������) __123.24


		System.out.printf("%2.2f\n",123.236); 
		//���� �ȳ��� �׳� �����Ѵ�.  --==> 123.24

	}

}

//�������
/*
AAABBBCCC

1234512345
12345
10 + 20 =30
123
       123
00001234
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/