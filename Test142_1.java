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

//[같이 한 풀이]
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	private int[] num = new int[6];

	//getter
	public int[] getNum()
	{
		return num;
	}

	//6개의 난수 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt=0;
		
		jump:			//★CHECK★
		while (cnt<6)	//웅~~ 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;

			for (int i=0;i<cnt; i++)	//쑝!
			{
				if (num[i]==n)
				{
					//난수 다시 발생시킬 수 있도록 처리
					continue jump;
				}
			}

			num[cnt++] = n; 
		}
		// 정렬 메소드 호출
		sorting();
		
	}//end start()

	private void sorting()
	{
		Arrays.sort(num);
	}
}

public class Test142_1
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		for (int i=1;i<=5 ;i++ )
		{
			lotto.start();

			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}
//최종결과
/*
   7  11  15  17  22  36
  10  15  28  31  42  43
   6   7  29  36  41  44
   4   6   8  14  23  42
   3  13  21  24  38  40
계속하려면 아무 키나 누르십시오 . . .
*/