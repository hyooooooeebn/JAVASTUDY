/*============================
	 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
==============================*/

/*
	�迭�� �迭�� Ȱ���Ͽ�
	������ ���� �����͸�  ��ҷ� ���ϴ� �迭�� �����ϰ�
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� �� )

	 1  2  3  4  5
	 2  3  4  5  6
	 3  4  5  6  7
	 4  5  6  7  8
	 5  6  7  8  9
*/


public class Test082
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int a;

		for (int i =0; i<arr.length ;i++ )					
		{
			a = i+1;

			for (int j=0; j<arr[i].length ;j++ )		
			{
				arr[i][j] = a;
				a++;
				
			}
		}


		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			
				System.out.printf("%3d",arr[i][j]);
			
			System.out.println();
		}

			
	}
}
//�������
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/