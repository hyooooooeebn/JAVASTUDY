/*===============================================
	  ■■■ 정렬(sort) 알고리즘 ■■■
=================================================*/

/*
	사용자로부터 여러 학생의 성적 데이터를 입력받아
	점수가 높은 순에서 낮은 순으로 등수를 부여하여
	결과를 출력하는 프로그램을 구현
	단, 배열과 정렬 알고리즘을 활용라여 작성

	실행 예)
	인원 수 입력 : 5
	이름 점수 입력(1) : 
	이름 점수 입력(2) :
	이름 점수 입력(3) : 
	이름 점수 입력(4) :
	이름 점수 입력(5) : 

	---------------------
	1등 이름 점수 
	2등
	3등
	4등
	5등
	----------------------
*/
import java.util.Scanner;

public class Test106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String name;
		int score;
		String temp =" ";
		

		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();

		int[] arr = new int[n];
		String[] names = new String[n];

		for (int i=0;i<n ;i++ )
		{
			System.out.printf("이름 점수 입력(%d) : ",i+1);
			name = sc.next();
			score = sc.nextInt();
			names[i] = name;
			arr[i] = score;

		}  

		for (int i=0;i<arr.length ;i++ )			//선택정렬
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]<arr[j])
				{
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[j]^arr[i];
					arr[i]=arr[i]^arr[j];

					temp = names[i];
					names[i]=names[j];
					names[j] = temp;
				}
			
			}
		}//end sort

		System.out.println("---------------------");
		for (int k=0;k<n ;k++ )
		{
			System.out.printf("%d등 ",k+1);
			System.out.print(" " + names[k]);
			System.out.print(" " + arr[k]);
			System.out.println();
			
		}
		System.out.println("---------------------");


		

	}
}