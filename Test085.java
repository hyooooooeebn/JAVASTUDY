/*============================
	 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
==============================*/

/*	�迭�� �迭�� Ȱ���Ͽ�
	������ ���� �����͸�  ��ҷ� ���ϴ� �迭�� �����ϰ�
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� �� )
	
	 E	J  O  T  Y
 	 D  I  N  S	 X							
	 C  H  M  R	 W						
	 B  G  L  Q  V						
	 A  F  K  P  U								
									*/

public class Test085
{
	public static void main(String[] args)
	{
		
		char[][] arr = new char[5][5];
		
		
		int a =65;

		for (int i=0; i<5 ; i++ )
		{	
			
			for (int j=0; j<5 ;j++ )
			{	
					arr[4-j][i] = (char)a;
					a++;
			}
		}


		for (int i=0;i<arr.length ;i++ )
		{
				for (int j=0;j<arr[i].length ;j++ )
				
				System.out.printf("%3c",arr[i][j]);
				
			System.out.println();
		}
	}
}