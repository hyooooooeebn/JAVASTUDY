/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- switch문 실습
===============================================================*/

/*
○ 다중 선택문이라 하면,  switch 문 다음의 수식 값에 따라
실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
switch(수식)
{
	case 상수1 : 문장 1; [break;]
	case 상수2 : 문장 2; [break;]

	[default : 문장; [break;]]
}

switch문의 『수식』과 case의 『상수』는
byte, short, int, long 이어야한다.

case문 뒤에 『break;』가 없는 형태인 경우
다음 case문의 문장을 계속해서 수행하게 된다 (->기본모델)
*/


//


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException; 

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어 점수 입력 :");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 :");
		int eng = Integer.parseInt(br.readLine());
        System.out.print("수학 점수 입력 :");
		int mat = Integer.parseInt(br.readLine());

		int avg = (kor + eng + mat) /3;

		char grade;		


		switch(avg/10)								//★CHECK★
		{										    //case는 1부터 아니다!! 상수로 출력★
			case 10 : case 9:  grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			case 5 : case 4: case 3: case 2: case 1: case 0 : grade = 'F'; break;
			default : System.out.println("\n 점수 입력 오류입니다"); grade='X'; 
		}

		/*
		switch(avg/10)								//★CHECK★
		{										    //case는 1부터 아니다!! 상수로 출력★
			case 10 : case 9: grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default :grade='F'; 
		}
		*/

		System.out.printf("\n 당신의 이름은 %s 입니다.", name);
		System.out.printf("\n 총점은 %d이고, 평균은 %d입니다.", (kor+eng+mat),avg);        
		System.out.printf("\n 등급은 %c 입니다.\n",grade);


	}
}
//최종결과
/*
이름 입력 : 박효빈
국어 점수 입력 :50
영어 점수 입력 :60
수학 점수 입력 :70

 당신의 이름은 박효빈 입니다.
 총점은 180이고, 평균은 60입니다.
 등급은 D 입니다.
계속하려면 아무 키나 누르십시오 . . .*/