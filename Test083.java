/*============================
	 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
==============================*/

/*	�迭�� �迭�� Ȱ���Ͽ�
	������ ���� �����͸�  ��ҷ� ���ϴ� �迭�� �����ϰ�
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� �� )

	 1  2  3  4  5						 
	 5  1  2  3  4							  
	 4  5  1  2  3
	 3  4  5  1  2
	 2  3  4  5  1
									*/


public class Test083
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];	
		int n;
		
		for (int i=0;i<arr.length ;i++ )
		{	
/*			n=1;

			for (int j=i; n <= 5 ; j++ )			//��CHECK��
			{	
					arr[i][j] = n;
					n++;
					
				if (j==4)
				
					j=-1;
		}
				
*/
			
			for (int j=i,n=1; n<=5 ; n++)
			{
				arr[i][j] = n;
				j++;

				if(j==5)
					j=0;

			} 
		}
		
		// ��ü ��� ���
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
				
					System.out.printf("%3d",arr[i][j]);
				

			System.out.println();
		}
	}
}