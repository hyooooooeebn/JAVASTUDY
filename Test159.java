/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

/*
	실행 예)

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 1

		1번쨰 요소 입력 : 손범석
		1번째 요소 입력 성공
		요소 입력 계속(Y/N)? : Y

		2번째 요소 입력 : 서승균
		2번째 요소 입력 성공
		요소 입력 계속(Y/N)? : n

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 2

		[벡터 전체 출력]
			손범석
			서승균
		벡터 전체 출력 완료

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 정미화

		[검색 결과 출력]
		항목이 존재하지 않습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 손범석

		[검색 결과 출력]
		항목이 존재합니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 송해덕

		[삭제 결과 출력]
		항목이 존재하지 않아서 삭제할 수 없습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 서승균

		[삭제 결과 출력]
		서승균 항목이 삭제되었습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 5

		변경할 요소 입력 : 이지영

		[변경 결과 출력]
		변경할 대상이 존재하지않습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 5

		변경할 요소 입력 : 손범석
		수정할 내용 입력 : 정가연

		[변경 결과 출력]
		변경이 완료되었습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 6

		프로그램 종료
계속하려면 아무 키나 누르세요...

*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class menus //완성
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
	public static final int E_FIND = 3;
	public static final int E_DEL = 4;
	public static final int E_CHA = 5;
	public static final int E_END = 6;

}


public class Test159
{

	//주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;		// 선택값
	private static String con;		//계속 여부

	static
	{
		vt = new Vector<Object>();

		br = new BufferedReader(new InputStreamReader(System.in));

		sel =1;
		con ="Y";
		
	}

	//메뉴 출력
	public static void menuDisp()
	{
		System.out.print("  [메뉴 선택]\n 1. 요소 추가\n 2. 요소 출력\n 3. 요소 검색\n");
		System.out.print(" 4. 요소 삭제\n 5. 요소 변경\n 6. 종료\n >> 메뉴 선택(1~6) :  ");
	}

	//메뉴 선택
	public static void 	menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
	}

	// 선택된 메뉴 실행에 따른 기능 호출
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case menus.E_ADD: addElement(); break;
		case menus.E_DISP : disElement(); break;
		case menus.E_FIND : findElement(); break;
		case menus.E_DEL : delElement(); break;
		case menus.E_CHA : chaElement(); break;
		case menus.E_END : exit(); break;
		}
		
	}

	
	//요소 추가
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("%d번째 요소 입력 : ",vt.size()+1);
			String a = br.readLine();
			vt.add(a);
			System.out.printf("%d번째 요소 입력 성공\n",vt.size());
			System.out.print("요소 입력 계속(Y/N)? :");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));	
		

	}

	public static void disElement()
	{
		System.out.println("[벡터 전체 출력]");
		for(int a=0; a<vt.size(); a++)
			System.out.printf("%s\n", vt.get(a));
		System.out.println("벡터 전체 출력 완료");
		System.out.println();
			
	}

	public static void findElement() throws IOException
	{

		System.out.println("검색할 요소 입력 : "); 
		boolean b = vt.contains(br.readLine());

		System.out.println("[검색 결과 출력]");
		if (b)
		{
			System.out.println("항목이 존재하지 않습니다.");
		}else 
			System.out.println("항목이 존재합니다.");
		
	}

	public static void delElement() throws IOException  
	{
		System.out.print("삭제할 요소 입력 :");
		String del = br.readLine();
		System.out.println("[삭제 결과 출력]");
		if (vt.contains(del))
		{
			int i = vt.indexOf(del);
			vt.remove(i);
			System.out.printf("%s 항목이 삭제되었습니다.\n",del);
		}else
			System.out.println("항목이 존재하지 않아서 삭제할 수 없습니다.\n");
		
	}

	public static void chaElement() throws IOException  
	{
		System.out.print("변경할 요소 입력 : ");
		String change1 = br.readLine();
		

		if (vt.contains(change1))
		{
			int chidx = vt.indexOf(change1);
			System.out.print("수정할 요소 입력 : ");
			String change2 = br.readLine();

			vt.set(chidx, change2);
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		} else
		{	
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지않습니다.");
		}		

	}

	public static void exit()	//완성
	{
		System.out.println("\t프로그램종료");
		System.exit(-1);
	}

	//main() --완성
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}