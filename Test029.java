/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- if ~ else�� �ǽ�
===============================================================*/

/*����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
������ ���� ���·� ����ϴ� ���α׷� �ۼ�
����� ��� ������ �������� �����Ͽ� ó��

//90�� ~ 100�� : A 
//80�� ~ 89�� : B
//70�� ~ 79�� : C
//60�� ~ 69�� : D
//60�� �̸� : F


//���� �� )
  �̸� �Է� : 
  ���� ���� : 
  ���� ���� :
  ���� ���� :

  >> ����� �̸��� _____�Դϴ�.
  >> ���������� 90,
  >> ���������� 80,
  >> ���������� 70,
  >> ������ 240�̰�, ����� 80�Դϴ�.
  >> ����� B�Դϴ�. */

/* //[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;	
		int kor, eng, mat;
		int sum =0;
		double avg =0;
		char rank;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor+eng+mat; 
		avg = sum/3.0;

		if(90.0<= avg && avg <100.0) 
		{
			rank ='A';
		} else if(80.0<=avg && avg<89.0)
		  {
			rank ='B';
		   } else if(70.0<=avg && avg <79.0)
			  {
			   rank='C';
			   } else if(60.0<=avg && avg <69.0)
			    {
				 rank = 'D';
			    } else 
			    { 
				 rank='F'; }

	

		System.out.printf("\n����� �̸��� %s �Դϴ�.",name);
		System.out.printf("\n���� ���� : %d,",kor);
		System.out.printf("\n���� ���� : %d,",eng);
		System.out.printf("\n���� ���� : %d,",mat);
		System.out.printf("\n������ %d�̰�, ����� %.3f�Դϴ�.",sum,avg);
		System.out.printf("\n����� %c�Դϴ�\n",rank);



	}
}*/


//�������
/*
�̸� �Է� : ��ȿ��
���� ���� : 90
���� ���� : 80
���� ���� : 70

����� �̸��� ��ȿ�� �Դϴ�.
���� ���� : 90,
���� ���� : 80,
���� ���� : 70,
������ 240�̰�, ����� 80.000�Դϴ�.
����� B�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;	
		int kor, eng, mat;
		int tot;
		double avg;
		char grade ='F';		//���� �ʱ�ȭ�ϸ� else�� �ȳ����� ���� ��� �ֱ� ������ ���� �ȳ���.
								//��CHECK��

		// �� ���� �� ó��
		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor+eng+mat; 
		avg = tot/3.0;						//��CHECK�� �Ǽ�=�Ǽ� ������ ���߱�

		if(90 <= avg && avg <=100){
			grade ='A';
		} else if(80 <=avg){				//'�̹� 90����'��� �ǹ̸� ������ �����Դ� 
			grade ='B';
		} else if(70 <=avg){
			grade='C';
	    } else if(60 <=avg){
			grade = 'D';
	    } else{ 
		   grade='F'; }


		// �� ��� ���
		System.out.printf("\n>> ����� �̸��� %s �Դϴ�.",name);
		System.out.printf("\n>> ���� ���� : %d,",kor);
		System.out.printf("\n>> ���� ���� : %d,",eng);
		System.out.printf("\n>> ���� ���� : %d,",mat);
		System.out.printf("\n>> ������ %d�̰�, ����� %.2f�Դϴ�.",tot,avg);
		System.out.printf("\n>> ����� %c�Դϴ�\n",grade);

	}
}

//���� ���
/*
�̸� �Է� : ��ȿ��
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ��ȿ�� �Դϴ�.
>> ���� ���� : 90,
>> ���� ���� : 80,
>> ���� ���� : 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/