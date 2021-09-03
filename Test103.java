/*===============================================
	  ���� ����(sort) �˰��� ����
	  - ���� ����(Selection Sort)
=================================================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ�� �°� ������� ����

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
    -> ���� ����,,, �˻��ϱ� ����

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����,,,


   ���� ��)
   Source Data : 52 42 12 62 60
   Sorted Data : 12 42 52 60 62
   ����Ϸ��� �ƹ� Ű�� ��������,,,
*/

	

public class Test103
{
	public static void main(String[] args)
	{
		int[] a ={52, 42, 12, 62, 60};

/*
		52 42 12 62 60			0 1
		== --
		12 52 42 62 60			0 2
		==    --
								0 3
								0 4
	-----------------------------------1ȸ��	//�ּҰ� ����	
								1 2
								1 3
								1 4
	------------------------------------
								2 3
								2 4
	------------------------------------
								3 4

	
*/
		int i,j;

		System.out.print("Source Data : ");
		for (i=0; i<a.length ;i++ )   
			
			 System.out.print(a[i] + " ");

		System.out.println();

		// ���� for�� (forEach ����)
		System.out.print("Source Data : ");
		for (int n :a)
		
			System.out.print(n + " ");
		System.out.println();
				
	

		System.out.print("Sorted Data : ");
		for (i=0; i<a.length-1 ;i++ )			//��~ �񱳱��� ������ -> 0	  1   2  3
		{
			for (j=i+1; j<a.length ;j++ )				//��! �񱳱��� ������ -> 1234 234 34 4
			{
				if (a[i] > a[j])		//��������
				//if (a[i] < a[j])      //��������
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			} System.out.print(a[i] + " ");
		}
		System.out.println();



	}
}
//�������
/*
Source Data : 52 42 12 62 60
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/