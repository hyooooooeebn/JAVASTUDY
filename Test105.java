/*===============================================
	  ���� ����(sort) �˰��� ����
	  - ���� ���� ����(Bubble Sort)
=================================================*/

/*
	�� �տ��� Ȯ���� �� Selection Sort�� Bubble Sort�� ������ ����.
	    (�� �ݺ� Ƚ���� ����)
		������ ���� ���� ������ ��� �������� ������ ����
		�Ϲ� ���� �����̳� ���� ���ĺ��� ������ ���� �� �ִ�.

���������� : 61 15 20 22 30
			 15 20 22 30 61 - 1ȸ�� (���� �߻� -> true)  -> ���� ȸ�� o
			 15 20 22 30 61 - 2ȸ�� (���� �߻� -> false) -> ���� ȸ�� x


==> 1ȸ�� ����,,,2ȸ�� ����,,.�� �غ��Ҵ���,,,
	2ȸ������ ������ �Ͼ�� �ʾұ⶧����
	���ʿ��� �߰� ������ ���ǹ��� ������ �Ǵ��Ͽ� �������� �ʴ´�.

*/



public class Test105
{
	public static void main(String[] args)
	{
		int[] a = {10, 50,20,30,40};

		System.out.print("Source Data : ");
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();


		/*
		10 50 20 30 40		0	1
							1	2
							2	3
							3	4
						------------1ȸ�� -> ���ҹ߻�
		10 20 30 40 50		0	1
							1	2
							2	3
					    ------------2ȸ�� -> ���ҹ߻���
		...���� ȸ�� �߻����� ����

		*/


/*
		int i,j;
		int c=0;
	
		for (i =1; i<a.length; i++)			
		{
			c=0;
			for (j = 0 ; j< a.length-i ; j++) 
			{
				
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					c++;
					
				} 
			} if (c==0)	
				
				break;
			 
		}  
		
		*/			
				
	
		
/*
	int i=0,j;
		
	boolean b;	
	
	do
	{
		b=false;
		for (i =1; i<a.length; i++)
		{
		for (j = 0 ; j< a.length-n ; j++) 
			{
				
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					b =true;
						
				} 				
				
			} 
		}System.out.println(b);
		
	}
	while (b);
	
		*/
			

		boolean flag;
		int temp;
		int pass=0;

		//���� Bubble Sort ����
		do
		{
			flag = false;
			pass++;
			for (int i=0;i<a.length-pass ;i++ )
			{
				if (a[i]>a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

					flag = true;
					// �� �ѹ��̶� ������ �߻��ϰ� �Ǹ� flag������ true�� ����
				}
				
			}
		}
		while (flag);
		//--flag ������ false��� ���� ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ���
		//	�� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ�


				
		System.out.print("Sorted Data : ");
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();

	}
}
//�������
/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/