/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/

/*사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
다음과 같은 형태로 출력하는 프로그램 작성
등급은 평균 점수를 기준으로 산출하여 처리

//90점 ~ 100점 : A 
//80점 ~ 89점 : B
//70점 ~ 79점 : C
//60점 ~ 69점 : D
//60점 미만 : F


//실행 예 )
  이름 입력 : 
  국어 점수 : 
  영어 점수 :
  수학 점수 :

  >> 당신의 이름은 _____입니다.
  >> 국어점수는 90,
  >> 영어점수는 80,
  >> 수학점수는 70,
  >> 총점은 240이고, 평균은 80입니다.
  >> 등급은 B입니다. */

/* //[내가 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;	
		int kor, eng, mat;
		int sum =0;
		double avg =0;
		char rank;

		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor+eng+mat; 
		avg = sum/3.0;

		if(90.0<= avg && avg <100.0) 
		{
			rank ='A';
		} else if(80.0<=avg && avg<89.0)
		  {
			rank ='B';
		   } else if(70.0<=avg && avg <79.0)
			  {
			   rank='C';
			   } else if(60.0<=avg && avg <69.0)
			    {
				 rank = 'D';
			    } else 
			    { 
				 rank='F'; }

	

		System.out.printf("\n당신의 이름은 %s 입니다.",name);
		System.out.printf("\n국어 점수 : %d,",kor);
		System.out.printf("\n영어 점수 : %d,",eng);
		System.out.printf("\n수학 점수 : %d,",mat);
		System.out.printf("\n총점은 %d이고, 평균은 %.3f입니다.",sum,avg);
		System.out.printf("\n등급은 %c입니다\n",rank);



	}
}*/


//최종결과
/*
이름 입력 : 박효빈
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

당신의 이름은 박효빈 입니다.
국어 점수 : 90,
영어 점수 : 80,
수학 점수 : 70,
총점은 240이고, 평균은 80.000입니다.
등급은 B입니다
계속하려면 아무 키나 누르십시오 . . .

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;	
		int kor, eng, mat;
		int tot;
		double avg;
		char grade ='F';		//먼저 초기화하면 else로 안끝나도 무언가 담고 있기 때문에 에러 안난다.
								//★CHECK★

		// ○ 연산 및 처리
		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor+eng+mat; 
		avg = tot/3.0;						//★CHECK★ 실수=실수 형으로 맞추기

		if(90 <= avg && avg <=100){
			grade ='A';
		} else if(80 <=avg){				//'이미 90이하'라는 의미를 가지고 내려왔다 
			grade ='B';
		} else if(70 <=avg){
			grade='C';
	    } else if(60 <=avg){
			grade = 'D';
	    } else{ 
		   grade='F'; }


		// ○ 결과 출력
		System.out.printf("\n>> 당신의 이름은 %s 입니다.",name);
		System.out.printf("\n>> 국어 점수 : %d,",kor);
		System.out.printf("\n>> 영어 점수 : %d,",eng);
		System.out.printf("\n>> 수학 점수 : %d,",mat);
		System.out.printf("\n>> 총점은 %d이고, 평균은 %.2f입니다.",tot,avg);
		System.out.printf("\n>> 등급은 %c입니다\n",grade);

	}
}

//최종 결과
/*
이름 입력 : 박효빈
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 박효빈 입니다.
>> 국어 점수 : 90,
>> 영어 점수 : 80,
>> 수학 점수 : 70,
>> 총점은 240이고, 평균은 80.00입니다.
>> 등급은 B입니다
계속하려면 아무 키나 누르십시오 . . .
*/