/*============================
	 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
==============================*/

/*	�迭�� �迭�� Ȱ���Ͽ�
	������ ���� �����͸�  ��ҷ� ���ϴ� �迭�� �����ϰ�
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� �� )
	
	A					00
	B C					10	11
	D E F				20	21	22
	G H I J				30	31	32	33
	K L M N O			40	41	42	43	44
															*/

public class Test088
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char n = 'A';
		
		for (int i =0;i<arr.length ;i++ )
		{
			for (int j=0; j<=i ;j++ )
			{
				arr[i][j] = n;
				n++;
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
//�������
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

//2021-07-29 ���� 9:17