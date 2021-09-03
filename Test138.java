/*   ==============================
   ��� �ڹ��� �ֿ� Ŭ�������
   - Calendar Ŭ����
   ==============================*/
/*
�� Calendar Ŭ����
: �߻�Ŭ�����̹Ƿ� ��ü ���� X

�� Calendar ��ü(�ν��Ͻ�) ����
1. Calendar ob1 = Calendar.getInstance();		//Ŭ���������� ����_static(����)�޼ҵ�
2. Calendar ob2 = new GregorianCalendar();      //GregorianCalendar()�� Calendar�� ����Ŭ����(��ĳ����)
3. GregorianCalendar ob3 = = new GregorianCalendar();
*/

//������ ��, ��, ��, ������ Calendar ��ü�� Ȱ���Ͽ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
   public static void main(String[] args)
   {
	   // Calendar Ŭ���� ��� �ν��Ͻ� ����
	   // Calendar rightnow = new Calendar();		//-(x)
	   Calendar rightNow = Calendar.getInstance();

	   // ������ �޷� �ν��Ͻ��� ����
	   // ��¥ ���� ������ ��� �� �� �ִ� �޼ҵ� -> ��get()��
	   int y = rightNow.get(Calendar.YEAR);
	   System.out.println(y);
	   //--==>> 2021

	   int m = rightNow.get(Calendar.MONTH) +1;		//��CHECK�� ���� �迭�� �����Ǿ� �־ +1�� �ؾ��Ѵ�.
	   System.out.println(m);
	   //--==>> 8

	   int d = rightNow.get(Calendar.DATE);
	   System.out.println(d);
	   //--==>> 10

	   int w = rightNow.get(Calendar.DAY_OF_WEEK);
	   System.out.println(w);
	   //--==>> 3 

	   System.out.println(y+"-"+m+"-"+d+"-"+w);
	   //--==>> 2021-8-10-3

/*
	   //�׽�Ʈ
	   System.out.println(Calendar.SUNDAY);	//--==>> 1 -> �Ͽ���
	   System.out.println(Calendar.MONDAY);	//--==>> 2 -> ������
*/

	   System.out.println();

	   String week ="";
	   switch (w)
	   {
		//case 1 : week = "�Ͽ���"; break;
		case Calendar.SUNDAY : week = "�Ͽ���"; break;

		//case 2 : week = "������"; break;
		case Calendar.MONDAY : week = "������"; break;

		//case 3 : week = "ȭ����"; break;
		case Calendar.TUESDAY : week = "ȭ����"; break;

		//case 4 : week = "������"; break;
		case Calendar.WEDNESDAY : week = "������"; break;

		//case 5 : week = "�����"; break;
		case Calendar.THURSDAY : week = "�����"; break;

		//case 6 : week = "�ݿ���"; break;
		case Calendar.FRIDAY : week = "�ݿ���"; break;

		//case 7 : week = "�����"; break;
		case Calendar.SATURDAY : week = "�����"; break;
	   
	   }


	   System.out.println(y+"-"+m+"-"+d+"-"+week);
	   //--==>> 2021-8-10-ȭ����

	   ///////////////////////////////////////////////////////////////////////
	   System.out.println();

	   // Calendar ��ü ����
	   Calendar rightNow2 = new GregorianCalendar();

	   String[] week2 = {"�Ͽ���", "������","ȭ����","������","�����","�ݿ���","�����"};

	   //�޷��� ��¥ ���� -> ��set()��
	   rightNow2.set(2021, 11, 24);			//12�� �޷� ��CHECK��

	   System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));

	   System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> �ݿ���


		//�޷��� ��¥ ����

		//���� Ȯ��
		rightNow2.set(1998,05,11);
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);


		  
   }
}