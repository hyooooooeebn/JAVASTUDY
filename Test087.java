/*============================
	 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
==============================*/

/*	�迭�� �迭�� Ȱ���Ͽ�
	������ ���� �����͸�  ��ҷ� ���ϴ� �迭�� �����ϰ�
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� �� )
	
	A B	C D E
	F G H I J 
	K L M N O
	P Q R S T 
	U V W X Y
															*/

public class Test087
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char n='A';

		for (int i =0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
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
/*  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
//2021-07-29 ���� 9:13