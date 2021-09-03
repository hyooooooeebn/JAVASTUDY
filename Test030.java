/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/

/*사용자로부터 임의의 정수를 입력받아
  입력받은 정수가 짝수인지, 홀수인지, 0인지
  결과를 판별

  //실행 예)
  임의의 정수 입력 : 14
  14 -> 짝수
												 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String strResult;


		System.out.print("임의의 정수 입력 : ");
		a =Integer.parseInt(br.readLine());


		if(a==0){
		strResult = "영";}				// ★CHECK★  짝수보다 0을 앞에서 확인
		else if(a%2!=0){
		strResult = "홀수";}
		else {
		strResult = "짝수";
		}

		System.out.printf("%d -> %s\n",a,strResult);

	}
}
//최종 결과
/*
임의의 정수 입력 : 0
0 -> 영
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 14
14 -> 짝수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 7
7 -> 홀수
계속하려면 아무 키나 누르십시오 . . .

*/