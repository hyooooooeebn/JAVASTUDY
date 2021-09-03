/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- switch�� �ǽ�
===============================================================*/

/*
�� ���� ���ù��̶� �ϸ�,  switch �� ������ ���� ���� ����
���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
switch(����)
{
	case ���1 : ���� 1; [break;]
	case ���2 : ���� 2; [break;]

	[default : ����; [break;]]
}

switch���� �����ġ��� case�� ���������
byte, short, int, long �̾���Ѵ�.

case�� �ڿ� ��break;���� ���� ������ ���
���� case���� ������ ����ؼ� �����ϰ� �ȴ� (->�⺻��)
*/


//


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException; 

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name = br.readLine();

		System.out.print("���� ���� �Է� :");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� :");
		int eng = Integer.parseInt(br.readLine());
        System.out.print("���� ���� �Է� :");
		int mat = Integer.parseInt(br.readLine());

		int avg = (kor + eng + mat) /3;

		char grade;		


		switch(avg/10)								//��CHECK��
		{										    //case�� 1���� �ƴϴ�!! ����� ��¡�
			case 10 : case 9:  grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			case 5 : case 4: case 3: case 2: case 1: case 0 : grade = 'F'; break;
			default : System.out.println("\n ���� �Է� �����Դϴ�"); grade='X'; 
		}

		/*
		switch(avg/10)								//��CHECK��
		{										    //case�� 1���� �ƴϴ�!! ����� ��¡�
			case 10 : case 9: grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default :grade='F'; 
		}
		*/

		System.out.printf("\n ����� �̸��� %s �Դϴ�.", name);
		System.out.printf("\n ������ %d�̰�, ����� %d�Դϴ�.", (kor+eng+mat),avg);        
		System.out.printf("\n ����� %c �Դϴ�.\n",grade);


	}
}
//�������
/*
�̸� �Է� : ��ȿ��
���� ���� �Է� :50
���� ���� �Է� :60
���� ���� �Է� :70

 ����� �̸��� ��ȿ�� �Դϴ�.
 ������ 180�̰�, ����� 60�Դϴ�.
 ����� D �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/