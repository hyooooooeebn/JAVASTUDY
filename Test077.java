/*==========================
	 ■■■ 배열 ■■■
	 - 배열의 선언과 초기화
     - 배열의 기본적 활용
============================*/

/*
	사용자로부터 처음 입력받은 인원 수 만큼의
	학생 이름과 전화번호를 입력받고
	입력받은 내용을 전체 출력하는 프로그램을 구현한다.
	단, 배열을 활용하여 처리

	실행예)
	입력 처리할 학생 수 입력(명, 1~10) : 24
	입력 처리할 학생 수 입력(명, 1~10) : 3
	이름 전화번호 입력[1](공백 구분) : 
	이름 전화번호 입력[2](공백 구분) : 
	이름 전화번호 입력[3](공백 구분) : 

	-------------------
	전체 학생 수 : 3명
	-------------------
	 이름	전화번호




	--------------------

*/


/* [내가 한 풀이]
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n =sc.nextInt();
		}
		while (n<1 || n>10);


		String[] name = new String[n];
		String[] ph = new String[n];

		for (int i=0; i<n ;i++ )
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));
			name[i] = sc.next();
			ph[i] = sc.next();
		}

		System.out.println("-------------------");
		System.out.printf("전체 학생 수 : %d명\n",n);
		System.out.println("-------------------");



		for (int a=0; a<n ;a++ )
		{
			System.out.println(name[a] +"     " + ph[a] );
		}

		
		System.out.println("--------------------");


	}
}

//최종 결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 김하나 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 박둘 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 이셋 010-3333-3333
-------------------
전체 학생 수 : 3명
-------------------
김하나  010-1111-1111
박둘  010-2222-2222
이셋  010-3333-3333
--------------------
계속하려면 아무 키나 누르십시오 . . .
*/

//[같이 한 풀이]
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아둘 변수
		int memCount =0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount =sc.nextInt();
		}
		while (memCount<1 ||memCount>10);

		// 배열 생성(이름 배열, 전화번호 배열) - 사용자로부터 입력받은 인원수 만큼의 배열방 구성

		// 이름 저장 배열
		String[] names = new String[memCount];

		// 전화번호 저장 배열
		String[] tels = new String[memCount];
		//『String[] tels = new String[names.length];』 와 동일


		for (int i=0; i<memCount ;i++ )		//memCount = names.length = tels.length
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// 최종결과 출력
		System.out.println();
		System.out.println("-------------------");
		System.out.printf("전체 학생 수 : %d명\n",memCount);
		System.out.println("-------------------");
		System.out.println("이름	   전화번호\n");



		for (int m=0; m<memCount ;m++ )
		
			System.out.printf("%4s %14s\n",names[m], tels[m] );
		

		
		System.out.println("--------------------");


	}
}
