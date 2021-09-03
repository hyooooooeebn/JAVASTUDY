/*==============================
   ■■ 자바의 주요 클래스■■
		- Random 클래스
================================*/
/*
○  java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스다
	Math클래스의 정적 메소드인 random() 메소드도
	난수를 발생시켜 제공하는메소드지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
	필요한여러 형태의 난수를 만들어내기위해서는
	추가적인 연산들을 수행해야 한다.
	그래서 자바는여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.


// 로또 번호 생성기 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

//실행 예)
// 3 5 12 24 31 41
// 4 5 6 7 8 9 45
//
//
//
*/

import java.util.Random;


public class Test142
{
	public static void main(String[] args)
	{
		//[내가 한 풀이]
		Random rd = new Random();
		int[] arr = new int[6];
		int random;
		
		for (int n=0;n<5 ;n++ )
		{
		
		//배열에 랜덤으로 입력
		for (int i =0;i<6 ;i++ )
		{	
			random = rd.nextInt(45)+1;			//중복없애기.......
			
				arr[i] = random;
		} 
		
		//정렬
		for (int i =0;i<6 ;i++ )
		{
			for (int j=i+1;j <arr.length ;j++ )
			{
				if (arr[i] > arr[j])
				{
					arr[i] = arr[i]^arr[j];
					arr[j] = arr[j]^arr[i];
					arr[i] = arr[i]^arr[j];
				}
			} 	
			
		 }//end 정렬
		
		 //출력
		 for ( int a : arr )
				System.out.printf("%3d",a);
			System.out.println();

		}//end 5번돌리기
		
	}//end main()
}//end class