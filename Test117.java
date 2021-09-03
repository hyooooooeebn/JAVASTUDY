/*================================ 
	■■■ 클래스 고급 ■■■
	 - 인터페이스(Interface)
================================== */

/*
○ 실습 문제
   성적 처리 프로그램을 구현한다.
   단, 인터페이스 활용

   실행 예)
   인원 수 입력(1~10) : 2
   1번째 학생의 학번 이름 입력(공백구분) :
   국어 영어 수학 점수 입력	  (공백구분) : 
   2번째 학생의 학번 이름 입력(공백구분) :
   국어 영어 수학 점수 입력	  (공백구분) : 

   학번 이름	 90 100 85		275		91
   				 수  수 우
   학번 이름	 85 70 65		220		73
   				 우 미 양
	
*/

import java.util.Scanner;

//속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak,name;
	int kor,eng,mat;
	int tot, avg;
}

//인터페이스
interface Sungjuk
{
	public void set();		//인원 수 구성
	public void input();	//상세 데이터 입력
	public void print();	//결과 출력
}


//문제 해결 과정에서 설계해야 할 클래스 -> Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	int n;
	Record[] rec;


	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		rec = new Record[n];
	}

	

	@Override
	public void input()	
	{
		Scanner sc = new Scanner(System.in);
		

		for (int i =0;i<n ;i++ )
		{
			
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백구분) : ",i+1);
			rec[i].hak = sc.next();
			rec[i].name =sc.next();

			System.out.print("국어 영어 수학 점수 입력	  (공백구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;

			a = panjung(rec[i].kor/10);
			b = panjung(rec[i].eng/10);
			c = panjung(rec[i].mat/10);
			
		}	
	}

	public String panjung(int score)
	{
		char result;
		switch (score)
		{
			case 9 : case 10 : result ='수'; break;
			case 8 : result ='우'; break;
			case 7 : result ='미'; break;
			case 6 : result ='양'; break;
			
		}
		return result;
			
	}


	@Override
	public void print()
	{
		for (int i=0;i<n ;i++ )
		{
			
			System.out.printf("%13s",rec[i].hak);
			System.out.printf("%4s",rec[i].name);
			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d\n",rec[i].avg);
		
			System.out.print("%21c %4c %4c",a,b,c);
		}
	}


}

//main()메소드를 포함하는 외부의 다른 클래스
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		//문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}