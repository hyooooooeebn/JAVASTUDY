/*============================
	 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
==============================*/

/*	배열의 배열을 활용하여
	다음과 같은 데이터를  요소로 취하는 배열을 구성하고
	그 결과를 출력하는 프로그램을 구현한다.

	실행 예 )

	 1  8  9 16 17								00 01 02 03 04
	 2  7 10 15 18								10 11 12 13 14
	 3  6 11 14 19								20 21 22 23 24	
	 4  5 12 13 20								30 31 32 33 34
									*/


									
public class Test084
{
	public static void main(String[] args)
	{
		
			int[][] arr = new int[4][5];

		/* [내가 한 풀이]
			int n=1;

			for (int i=0; i< arr[0].length ;i++ )
			{
				if (i%2!=0)
				{
					for (int j=3; j>=0 ;j-- )
					{
						arr[j][i] =n;
						n++;
					}
				} 

				else
				{
				 for (int j=0; j<arr.length; j++ )
					{
						arr[j][i] = n;
						n++;
					}
				}
				 
			}*/

			// [같이 한 풀이]
			int n =0;
			for (int i=0;i<5 ;i++ )
			{
				for (int j=0; j<4 ;j++ )
				{
					n++;
					if(i%2==0)
						arr[j][i] = n;

					else 
						arr[3-j][i] = n;				//★CHECK★
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

//최종결과
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . .
*/