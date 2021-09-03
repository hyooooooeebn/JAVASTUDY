 /*===================================
	 ■■■ 클래스와 인스턴스 ■■■
	 - 클래스와 인스턴스 활용
======================================*/

/*
	2. Sungjuk 
	-인원 수를 입력받아, 입력받은 인원 수 만큼
	 총첨, 평균을 산출하는 클래스 설계
	 *속성 : 인원 수, record 형태의 배열
	 *기능 : 인원 수 입력, 상세 데이터 입력, 총점 평균 연산, 결과 출력
*/

import java.util.Scanner;

public class Sungjuk
{
	
	// 주요 속성 구성(주요 변수 선언)
	int inwon;		//인원수
	Record[] rec;	//Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
					//Record를 기반으로 생성된 객체만 담아낼 수 있는 배열
	
	

	// 주요 메소드 정의(기능 구성)
	//① 인원  수 입력
	public void set() 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon>100 || inwon<1);

		//Record 클래스를 기반으로 생성된 객체를 담을 수 있는 
		//배열 방을 inwon 만큼 생성
		rec = new Record[inwon];								//★CHECK★
		//--Record배열방을 inwon만큼 생성
		//	Record 클래스의 인스턴스를 생성한 것은 아니다.
	
	}

	// ② 상세 데이터 입력(총점, 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		//인원 수 만큼 반복
		for (int i = 0; i<inwon ;i++ )		//inwon = rec.length
		{
			
			/* //Record 클래스 기반의 인스턴스 생성
			Record ob = new Record();								
			rec[i] = ob;
			*/
			rec[i] = new Record();										//★CHECK★

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			rec[i].name = sc.next();
/*
			System.out.print("국어 점수 : ");
			rec[i].kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].mat = sc.nextInt();
*/
			for (int j=0;j<title.length; j++ )
			{
				System.out.print(title[j]);

				//사용자가 입력한 데이터를 score 배열에 담아내기
				rec[i].score[j] = sc.nextInt();			// i번째 학생의 score[0]  -> 국어점수
														// i번째 학생의 score[1]  -> 영어점수
														// i번째 학생의 score[2]  -> 수학점수
				
				// 총점 누적하기
				rec[i].tot += rec[i].score[j];


			}

			//평균 산출
			rec[i].avg = rec[i].tot / 3.0;


		}
		
	}

	// ③ 결과 출력
	public void print()
	{   ranking();
		System.out.println();

		// 학생 한명 당 반복 출력구문 구성
		for (int i =0;i<inwon ;i++ )
		{
			System.out.printf("%5s",rec[i].name);

			for (int j=0;j<3 ;j++ )
				System.out.printf("%4d", rec[i].score[j]);

			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);
			System.out.printf("%5d", rec[i].rank);
			System.out.println();
		}
		
	}// end print()


	// ④ 석차 산출 메소드 추가
	//	- Record 배열의 rank 속성 초기화 기능 -> 반환 자료형 void
	//	- 클래스 내부에서 활용할 메소드로 정의 -> 접근제어 지시자 private
	private void ranking()
	{
		int i, j;			//루프 변수

		// 모든 학생들의 등수(석차 rank)를 1로 초기화

		for (i=0;i<inwon ;i++ )
		
			rec[i].rank = 1;
		
		for (i=0; i<inwon-1;i++)					//비교 기준 0 1 2
		{
			for (j=i+1; j<inwon; j++)				//비교 대상 123 23 3
			{
				if (rec[i].avg > rec[j].avg)		//비교기준의 평균이 비교대상의 평균보다 크면,,,
				
					rec[j].rank++;					//비교대상의 rank를 1만큼 증가
				
				else if(rec[j].avg > rec[i].avg)    //비교대상의 평균의 비교기준이 평균보다 크다면,,,
				
					rec[i].rank++;					//비교기준의 rank를 1만큼 증가
				
			}
		}
	}




}//end class Sungjuk