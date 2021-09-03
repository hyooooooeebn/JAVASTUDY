/*============================
	 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
==============================*/

/*	배열의 배열을 활용하여
	다음과 같은 데이터를  요소로 취하는 배열을 구성하고
	그 결과를 출력하는 프로그램을 구현한다.

	실행 예 )

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

			for (int j=i; n <= 5 ; j++ )			//★CHECK★
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
		
		// 전체 요소 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
				
					System.out.printf("%3d",arr[i][j]);
				

			System.out.println();
		}
	}
}