/*===============================================
	  ■■■ 주민등록번호 유효성 검사 ■■■
=================================================*/

/*
○ 주민등록번호 검증 공식
	
	(1) 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	123456-1234567
	****** ******	----------------------
	234567 892345	각 자리수에 곱해질 수

	(2) 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	(3) 더해진 결과값을 11로 나누어 『나머지』를 취한다.

	(4) 11에서 나머지를 뺀 결과값을 구한다.
	   ※ (3)의 처리 과정에서 나머지가 0인 경우 -> 11 -> 1	
									   1인 경우 -> 10 -> 0	
		  이를 다시 10으로 나누어 나머지를 취한다.
		  
    (5) (4)의 연산 결과가 주민번호를 구성하는 마지막 숫자와
	    일치하는지는 여부를 확인한다.

		일치 -> 유효한 주민번호
		불일치 -> 잘못된 주민번호


	실행 예)
	주민번호 입력 : 123456-12345678		-> 입력 갯수 초과
	>> 입력오류~!!!
	계속하려면 아무 키나 누르세요...
	
	주민번호 입력 : 123456-123456		-> 입력 갯수 미달
	>> 입력오류~!!!
	계속하려면 아무 키나 누르세요...

	주민번호 입력 : 123456-1234567		//유효한 주민번호
	>>정확한 주민번호~!!!

	주민번호 입력 : 123456-1234568		//유효하지 않은 주민번호
	>>잘못된 주민번호~!!!


※ tip!!
문자열.length()  ->  문자열의 길이 반환

문자열.substring() -> 문자열 추출

*/

import java.util.Scanner;
import java.io.*;

public class Test102
{
	public static void main(String[] args) throws IOException
	{
/*
		String strTemp ="박효빈";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp ="study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//--==>> DE

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--==>> NOPQ

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		//--==>> 에러 (StringIndexOutOfBoundsException)

		strTemp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5,strTemp.length()));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
*/


/* [내가 한 풀이] //다 못함
		Scanner sc = new Scanner(System.in);
		String id;


		for (; ; )
		{
			System.out.print("주민번호 입력 : ");
			id = sc.next();
			if (id.length()!=14)
			{
				System.out.print(">> 입력오류~!!!\n");
				break;
			}
			else
				
				break;		
		} 
	
			String[] arr = new String[6];
			int[] num = {2,3,4,5,6,7,8,9,2,3,4,5};
		
			for (int i =1; i<7; i++)
			{
				arr[i-1] = id.substring(i-1,i); // arr[] = 1 2 3 4 5 6
			}

			
			Integer.parseInt(str.substring(i,i+1))

*/

//[같이 한 풀이]

	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

	//입력받는 주민번호(문자열 형태)
	String str;

	//주민번호의 각 자릿수에 곱하게 될 수 있도록 배열 형태 구성
	//			 1 2 3 4 5 6 - 1 2 3 4 5 6 7	
	int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};


	//곱셈 연산 후 누적합(즉, 곱셈의 결과를 더해 나갈 수 있도록 처리...)
	int tot = 0;

	System.out.print("주민번호 입력 : ");
	str = br.readLine();

	if (str.length() != 14)
	{
		System.out.println(">> 입력오류~!!!");
		return;		//메소드 종료 
	}

	for (int i=0;i<13 ;i++ )
	{
		if (i==6)
			continue;	// 뒷부분 무시하고 계속해라
		

		tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));		//★CHECK★ 문자열 int로 바꾸기,,,
	}
	
			
	//--------------------------------------------------(2)까지 처리 완료~~!!
	
	int su = 11 - tot % 11;

	//최종 결과 출력 이전에,,, 추가 연산 필요~!!!
	su %= 10; //su =su%10;

	//--------------------------------------------------(4)까지 처리 완료~!!

	if (su ==Integer.parseInt(str.substring(13)))
	
		System.out.println(">> 정확한 주민번호~!!!");
	
	else 
	
		System.out.println(">> 잘못된 주민번호~!!!");
	

			
				
			

			
			


			
		








			

	}
}