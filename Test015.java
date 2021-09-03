/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	-자바의 기본 입출력 : 
================================================*/

public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n"); //개행은 문자열 안에 해야한다
		//--==> AAABBBCCC
		

		System.out.println(); //개행
	  //System.out.print(); //컴파일 에러
		

		System.out.printf("12345");		//print()와 같다
		System.out.printf("12345\n");	//개행
		System.out.printf("12345%n");	//개행


	  //System.out.printf(); //컴파일 에러
	    
		System.out.printf("%d + %d =%d\n",10,20,30);  //기본 형태
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123); 
		//총 자리가 10자리 --==> -------123
		System.out.printf("%08d\n",1234); 
		//숫자 앞에 0을 넣으면 0으로 채워진다. --==> 00001234]


		System.out.printf("%+d\n",365);
		//--==> +365
		System.out.printf("+%d\n",365); // ★이걸로 사용하기
		//--==> +365
		System.out.printf("%d\n",+365);
		//--==> 365


		
	  //System.out.printf("%-d\n",365);  //런타임 에러
		System.out.printf("-%d\n",365);  //--==> -365
		System.out.printf("%d\n",-365);  //--==> -365



		System.out.printf("%(d\n",-365); //--==> (365)
		System.out.printf("%(d\n",365);  //--==>  365
		//%와 d 사이에 『(』는 음수는 ()안에 양수는 그냥 표현



	  //System.out.printf("%d\n",'A'); --==> 런타임오류
		//printf()안에 매개변수가 들어만 있으면 컴파일 에러는 나지않는다.
		//매개변수가 맞지않을 경우 런타임에러 발생
		System.out.printf("%c\n",'A');


	  //System.out.printf("%c\n","ABCD"); --==> 런타임에러
	    System.out.printf("%s\n","ABCD");


		System.out.printf("%h\n", 365); //16진수
		//--==> 16d
		System.out.printf("%o\n",24);   //8진수
		//--==> 30

		System.out.printf("%b\n",true);
		//--==> true

		System.out.printf("%f\n",123.23);
		//--==> 123.230000
		System.out.printf("%.2f\n",123.23);
		//--==> 123.23
		System.out.printf("%.2f\n",123.231);
		//--==> 123.23
		System.out.printf("%.2f\n",123.236);
		//--==> 123.24


		System.out.printf("%8.2f\n",123.236); 
		//총 8칸 확보(소수점포함) __123.24


		System.out.printf("%2.2f\n",123.236); 
		//에러 안나고 그냥 무시한다.  --==> 123.24

	}

}

//최종결과
/*
AAABBBCCC

1234512345
12345
10 + 20 =30
123
       123
00001234
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/