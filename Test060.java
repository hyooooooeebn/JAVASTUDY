/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- break
===============================================================*/

/*
아래와 같은 처리가 이루어지는 프로그램을 구현한다.
단, 입력받은 정수는 1~100 범위 안에서만
가능하도록 작성한다.

실행예 )

임의의 정수 입력 : -20

임의의 정수 입력 : 0

임의의 정수 입력 : 2021

임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까?(Y/N) : y

임의의 정수 입력 : 100
>> 1 ~100까지의 합 : 5050
계속하시겠습니까?(Y/N) : n


*/

/* [내가 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int a,n=1;
		char answer;
		
		 for (; ; )
		{
			
			System.out.print("임의의 정수 입력 : ");
			a= Integer.parseInt(br.readLine());
			
			if (1<=a && a<=100)
			{
				int sum=0;
				for ( n=1; n<=a; n++ )
				{
					sum += n;
				}

				System.out.printf(">> 1 ~ %d까지의 합 : %d\n",a,sum);
				System.out.print("계속하시겠습니까(Y/N)? : ");
				answer = (char)System.in.read();
				System.in.skip(2); 

				System.out.println();

				if (answer== 'Y' || answer =='y')
				
				continue;
				
				else if (answer== 'N' || answer =='n')
				
				break; 
				
				
			} 

		}





	}
}
//최종결과
/*
임의의 정수 입력 : -20
임의의 정수 입력 : 0
임의의 정수 입력 : 2021
임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 100
>> 1 ~ 100까지의 합 : 5050
계속하시겠습니까(Y/N)? : n

계속하려면 아무 키나 누르십시오 . . .


*/



//[같이 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n,s=0,i;
	
		char ch;		//계속할지말지


		//무한 반복문
		while(true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

		//테스트
		///Sytem.out.print("유효정수");
			
			s=0;		//누적합 변수의 초기화 위치
			

			for (i=1;i<=n ;i++ )
			{
				s+=i;
			}

			System.out.printf(">> 1~%d까지의 합 %d\n",n,s);
	
			System.out.printf("계속하시겠습니까(Y/N)? : ");
			ch =(char)System.in.read();



			//그만할래 의사표현
			//if (ch=='n' || ch=='N')
			if (ch != 'Y' && ch != 'y')						//★CHECK★ 
															//긍정에서 부정으로 바뀔 때 || -> &&
				//반복문을 빠져나갈 수 있는 코드 작성 필요
				//--위와 같은 의사표현을 햇다면
				//  그동안 수행했던 반복문을 멈추고 빠져나간다.
				break; //멈춘다 그리고 빠져나간다. 

			
			System.in.skip(2);			//enter값 skip필요함  ★CHECK★



		}//end while



	}//end main()

}//end test060


//최종결과

/*
*/