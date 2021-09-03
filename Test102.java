/*===============================================
	  ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=================================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����
	
	(1) ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567
	****** ******	----------------------
	234567 892345	�� �ڸ����� ������ ��

	(2) ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	(3) ������ ������� 11�� ������ ������������ ���Ѵ�.

	(4) 11���� �������� �� ������� ���Ѵ�.
	   �� (3)�� ó�� �������� �������� 0�� ��� -> 11 -> 1	
									   1�� ��� -> 10 -> 0	
		  �̸� �ٽ� 10���� ������ �������� ���Ѵ�.
		  
    (5) (4)�� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	    ��ġ�ϴ����� ���θ� Ȯ���Ѵ�.

		��ġ -> ��ȿ�� �ֹι�ȣ
		����ġ -> �߸��� �ֹι�ȣ


	���� ��)
	�ֹι�ȣ �Է� : 123456-12345678		-> �Է� ���� �ʰ�
	>> �Է¿���~!!!
	����Ϸ��� �ƹ� Ű�� ��������...
	
	�ֹι�ȣ �Է� : 123456-123456		-> �Է� ���� �̴�
	>> �Է¿���~!!!
	����Ϸ��� �ƹ� Ű�� ��������...

	�ֹι�ȣ �Է� : 123456-1234567		//��ȿ�� �ֹι�ȣ
	>>��Ȯ�� �ֹι�ȣ~!!!

	�ֹι�ȣ �Է� : 123456-1234568		//��ȿ���� ���� �ֹι�ȣ
	>>�߸��� �ֹι�ȣ~!!!


�� tip!!
���ڿ�.length()  ->  ���ڿ��� ���� ��ȯ

���ڿ�.substring() -> ���ڿ� ����

*/

import java.util.Scanner;
import java.io.*;

public class Test102
{
	public static void main(String[] args) throws IOException
	{
/*
		String strTemp ="��ȿ��";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp ="study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//--==>> DE

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--==>> NOPQ

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		//--==>> ���� (StringIndexOutOfBoundsException)

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5,strTemp.length()));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
*/


/* [���� �� Ǯ��] //�� ����
		Scanner sc = new Scanner(System.in);
		String id;


		for (; ; )
		{
			System.out.print("�ֹι�ȣ �Է� : ");
			id = sc.next();
			if (id.length()!=14)
			{
				System.out.print(">> �Է¿���~!!!\n");
				break;
			}
			else
				
				break;		
		} 
	
			String[] arr = new String[6];
			int[] num = {2,3,4,5,6,7,8,9,2,3,4,5};
		
			for (int i =1; i<7; i++)
			{
				arr[i-1] = id.substring(i-1,i); // arr[] = 1 2 3 4 5 6
			}

			
			Integer.parseInt(str.substring(i,i+1))

*/

//[���� �� Ǯ��]

	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

	//�Է¹޴� �ֹι�ȣ(���ڿ� ����)
	String str;

	//�ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �ֵ��� �迭 ���� ����
	//			 1 2 3 4 5 6 - 1 2 3 4 5 6 7	
	int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};


	//���� ���� �� ������(��, ������ ����� ���� ���� �� �ֵ��� ó��...)
	int tot = 0;

	System.out.print("�ֹι�ȣ �Է� : ");
	str = br.readLine();

	if (str.length() != 14)
	{
		System.out.println(">> �Է¿���~!!!");
		return;		//�޼ҵ� ���� 
	}

	for (int i=0;i<13 ;i++ )
	{
		if (i==6)
			continue;	// �޺κ� �����ϰ� ����ض�
		

		tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));		//��CHECK�� ���ڿ� int�� �ٲٱ�,,,
	}
	
			
	//--------------------------------------------------(2)���� ó�� �Ϸ�~~!!
	
	int su = 11 - tot % 11;

	//���� ��� ��� ������,,, �߰� ���� �ʿ�~!!!
	su %= 10; //su =su%10;

	//--------------------------------------------------(4)���� ó�� �Ϸ�~!!

	if (su ==Integer.parseInt(str.substring(13)))
	
		System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
	
	else 
	
		System.out.println(">> �߸��� �ֹι�ȣ~!!!");
	

			
				
			

			
			


			
		








			

	}
}