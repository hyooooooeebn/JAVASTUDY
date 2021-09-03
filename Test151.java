/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

import java.util.Stack;

public class Test151
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	//생성자
	public Test151()
	{
		//st라는 Stack 자료구조 생성
		//제네릭을 활용하여 자료구조에 담기는 데이터 표현 <String>
		Stack<String> st = new Stack<String>();

		//st = colors;	(x)

		for (String color : colors )
		{
			st.push(color);
		}

		st.push("보라");	//가장 나중에 push니까 가장 먼저 pop

		//st.push(10); (x) 컴파일 에러--제너릭 표현이 맞지않으면...

		//출력메소드호출
		popStack(st);

	}
	
	// 출력메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
		
			System.out.print(st.pop() + " ");
			System.out.println();
		
	}

	public static void main(String[] args)
	{
		new Test151();
	}
}