/*==============================================
		���� �ڹ� �⺻ ���α׷��� ����
		-����
		�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
		�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.
================================================*/

//���� ��)
//�� �ﰢ���� ���� ���ϱ� ��
//- �ﰢ���� �غ� �Է� : 3
//- �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 

//�ػﰢ���� ���� = �غ� * ���� / 2

/*[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //�Է°��� �޾ƿ��� ����

		 int a,b;
		 double c;

		 System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		
		 System.out.print("-�ﰢ���� �غ� �Է� :");
		 a = Integer.parseInt(br.readLine()); //�غ� a �޾ƿ���
		
		
		 System.out.print("-�ﰢ���� ���� �Է� :"); 
		 b = Integer.parseInt(br.readLine()); //���� b �޾ƿ���


		 c=a*b/2.0;

		 System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %f\n",a,b,c); 
	}
}

//�������
/*�� �ﰢ���� ���� ���ϱ� ��
-�ﰢ���� �غ� �Է� :3
-�ﰢ���� ���� �Է� :5
>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.500000
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/



//[���� �� Ǯ��]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// ���ֿ� ���� ����
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int bottomLength, height;		//�غ��� ���� ����
		 double area;

		 
		 // �� ���� �� ó��

		 // �� ����ڿ��� �ȳ� �޼��� ���
		 System.out.println("�� �ﰢ���� ���� ���ϱ� ��");		
		 System.out.print("-�ﰢ���� �غ� �Է� :");

		 // �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ �� 
		 //	   ���� bottomLength�� ��Ƴ���
		 bottomLength = Integer.parseInt(br.readLine()); 
		
		 // �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		 System.out.print("-�ﰢ���� ���� �Է� :");
		 
		 // �� ����ڰ� �ԏ��� �����͸� ���� ���·� ��ȯ ��
		 //	   ���� height �� ��Ƴ���
		 height = Integer.parseInt(br.readLine()); 

		 // �� ���� ä���� �������� Ȱ���Ͽ� ���� ���ϴ� ���� ����
		 area = bottomLength * height /2.0;                             //��CHECK��
		//		  ������     * ������ /�Ǽ��� => �Ǽ� ��� ���� ����
		/* �ؽǼ� �ڷ����� ��������� ����Ǵ� ��������
			 �Ǽ� ����� ������ �ʿ��� ��Ȳ.
			 ������ ��2���� �ƴ� ��2.0������ ������ ������ �����ϰ� �Ǹ�
			 �� ������ �Ǽ� ������� ó���ȴ�.*/


		// �� ��� ���
		//System.out.print() -> ����
		 System.out.println(); //-> ����
		 System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n",bottomLength,height,area); 
	}
}
//���� ���
/*�� �ﰢ���� ���� ���ϱ� ��
-�ﰢ���� �غ� �Է� :3
-�ﰢ���� ���� �Է� :5

>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/