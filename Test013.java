/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	-������ �ڷ���
	-�ڹ��� �⺻ ����� : BufferedReader Ŭ����
================================================*/

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

/*���� ��)
 �̸��� �Է��ϼ���.  : ��ȿ��
 ���� ���� �Է� : 90
 ���� ���� �Է� : 80
 ���� ���� �Է� : 70

 ===[���]===
 �̸� : 
 ���� : 
 */


/*[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, math;
		int sum=0;

		System.out.print("�̸��� �Է��ϼ���. : ");
		name = br.readLine();
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		math =Integer.parseInt(br.readLine());

		sum = kor + eng + math;

		System.out.println();
		System.out.println("===[���]===");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
	}
} 

//�������
/*
�̸��� �Է��ϼ���. : ��ȿ��
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

===[���]===
�̸� : ��ȿ��
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


//[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader �ν��Ͻ� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		String strName;
		int nKor, nEng, nMat;
		int nTot;

		//�߰� ���� ����
		String strTemp;						//���ڿ� ������ �ӽ� ���� ����


		// �� ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");
		
		//-����ڰ� �Է��� ���� ������ ��Ƴ���
		strName = br.readLine();			//���ڿ��� �޾ƿͼ� ��ȯ���� �Է�

		//-����ڿ��� �ȳ� �޼���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//-����ڰ� �Է��� ���� ������ ��Ƴ���
		strTemp = br.readLine();
		//-��Ƴ� ���� �ʿ��� ������ �Ű� ���	
		nKor = Integer.parseInt(strTemp);
		//-�ӽ� ���� ���� strTemp�� ����ִ� ���� 
		// �� ��ȯ ��,,,, �������� ������ ��Ƴ���


		//-����ڿ��� �ȳ� �޼���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		
		//-����ڰ� �Է��� ���� ������ ��Ƴ���
		strTemp = br.readLine();

		//- ��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nEng = Integer.parseInt(strTemp);
	    //-�ӽ� ���� ���� strTemp�� ����ִ� ���� 
		// �� ��ȯ ��,,,, �������� ������ ��Ƴ���


		//-����ڿ��� �ȳ� �޼���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		
		//-����ڰ� �Է��� ���� ������ ��Ƴ���
		strTemp = br.readLine();

		//- ��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nMat = Integer.parseInt(strTemp);
	    //-�ӽ� ���� ���� strTemp�� ����ִ� ���� 
		// �� ��ȯ ��,,,, �������� ������ ��Ƴ���


		/*�� ���� ������ ����ִ� �����͵��� �����Ͽ� 
		������ �����ϰ� �� ����� ���� ������ ��Ƴ���*/

		nTot=nKor +nEng +nMat;

		// �� ��� ���
		System.out.println("\n ====[���]===");
		System.out.printf("�̸� : %s\n", strName);
		System.out.printf("���� : %d\n", nTot);	
	}
}

//���� ���
/* 
�̸��� �Է��ϼ��� : ��ȿ��
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

 ====[���]===
�̸� : ��ȿ��
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/