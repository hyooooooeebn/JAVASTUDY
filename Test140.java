/*   ==============================
   ��� �ڹ��� �ֿ� Ŭ�������
   - Calendar Ŭ����
 ==============================*/
  
/*
 ���� ��)
 ���� ��¥ : 2021-8-11 ������
 ��ĥ ���� ��¥�� Ȯ���ϰ����մϱ�? : 200

 ============[Ȯ�� ���]==============
 200�� �� : xxx-xx-xx x����
 =====================================

 �� ���� ��¥�� �������� �� ���� ���ϴ� ����޼ҵ�
 	����ü.add(Calendar.DATE, �� ��);��
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test140
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		String[] week = {"�Ͽ���", "������","ȭ����","������","�����","�ݿ���","�����"};

		System.out.print(" ���� ��¥ : ");

		int y = cal.get(Calendar.YEAR);

	    int m = cal.get(Calendar.MONTH) +1;		

	    int d = cal.get(Calendar.DATE);
	  
		int w = cal.get(Calendar.DAY_OF_WEEK);

	   
	    System.out.println(y+"-"+m+"-"+d+" "+week[w-1]);


		System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ����մϱ�? : ");
		int a = sc.nextInt();

		cal.add(Calendar.DATE, a);

		y = cal.get(Calendar.YEAR);

	    m = cal.get(Calendar.MONTH) +1;		

	    d = cal.get(Calendar.DATE);
	  
		w = cal.get(Calendar.DAY_OF_WEEK);



		System.out.println();
		System.out.println("============[Ȯ�� ���]==============");
		System.out.printf("%d�� �� : %d-%d-%d %s\n",a,y,m,d,week[w-1]);
		System.out.println("=====================================");
	   

		

	}
}