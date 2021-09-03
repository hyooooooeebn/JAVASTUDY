/*=============================================
   ■■ 객체 직렬화(Object Serialization) ■■
================================================*/

/*
 ○ 객제 직렬화는 
 	메모리에 생성된 클래스 객체의 멤버 변수의 현재 상태를
	그대로 보존해서 파일에 저장하거나
	네트워크를 통해 전달 할 수 있는 기능으로
	멤버 변수의 값을 보존한다거나
	다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다.

	즉, 객체 직렬화는 내용물을 바이트 단위로 변환하여
	파일 또는네트워크를 통해 송수신(스트림)이 가능하게
	만들어주는 것으로 이때 객체란 멤버 변수의 메모리만으로 구성된 것을 말한다
	
	따라서, 메소드와 생성자는 객체 직렬화의 대상에서 제외된다. ★CHECK★


 ○ 장점

 	객체 자체의 내용을 입출력 형식에 구애받지 않고
	객체를 파일에 저장함으로써 영속성을 제공할 수 있으며
	객체 자체를 네트워크를 통해 손쉽게 교환할 수 있게 된다.

	객체 직렬화는 자바 1,1이후에 도입되었는데
	그 이유는 RMI와 Bean때문이다.
	RMI는 원래 객체 통신을 지원해야 하기 때문에
	객체가 그대로 이동할 수 있어야 한다,
	따라서 이를 지원하기 위해서는 객체 직렬화가 필수적이다.

	또한 Bean은 설계 시 상태에 대한 정보를 저장할 때 
	이 객체 직렬화를 사용하면 편하게 객체 상태를 저장할 수 있다.

 ※ RMI(Remote Method Invocation)
 	서로 다른 가상 기계장치에 존재하는 함수를
	호출하고 실행하는 기능을 담당한다.
	서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의
	통신 구조를 지원하는 개념으로 이해하면 좋겠다.

 ※ Bean(빈)
	C/S 구조적 모델에서 서버측 구조에 해당하며
	재사용 가능한 소프트웨어 개체를 만들 수 있게 하는 컴포넌트 기술
	작성된 개체의 공유가 가능하며 프로젝트에 쉽게 포함시킬 수 있도록 한다.
	클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리

 ○ Serializable 인터페이스
 	
	객체 직렬화를 하기 위해 먼저 객체 직렬화가 가능하도록
	인터페이스를 구현해 주어야 한다.
	ㅇ; ㅇ;ㄴ터페이스는객체 직렬화가 제공되어야 한다는 사실을
	JVM에게 알려주는 역할을 수행한다.
	또한 Serializable인터페이스는
	다른 인터페이스와 달리 구현해야 할 메소드가 없기 때문에
	단지 선언만해주면 ㅈ된다

	(1)
	public class 클래스면 implements Serializable
	{}

	(2)
	Serializable 인터페이스를 구현한 후
	ObjectInputStream클래스와 ObjectOutputStream클래스를 이용하여
	객체 단위로 입출력을 수행하게 된다;

	※ 멤버 변수가 static으로 선언된 경우
		객체 직렬화의 대상에서 제외된다.


 ○ Object Stream
	

	파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의
	직렬화를 해제하는 기능을 제공한다.
	단, java.io.Serializable 인터페이스와
	java.io.Enernalizable인터페이스를 지원해주는 객체에 대해서만 사용이 가능하다.
	즉, Serializable 인터페이스와 Enernalizable인터페이스를 구현한 객체에서만 사용이 가능하다는 것
	이때 readObject()메소드를 이용하여
	스트림으로부터 직렬화된 객체를 읽을 수 있으며
	이렇게 읽은 객체는 배열, 문자열 또는 각 객체 등
	원래의 형(type)으로 캐스팅해주어야 한다.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test173
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		//System.out.println(appDir);
		//--==>> C:\JavaStudy

		// 파일 객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");
		//--appDir -> C:\JavaStudy
		//	appDir위치를 중심으로 "\\data\\test.ser"를 구성하겠다는 의미
		//	결과적으로 『C:\JavaStudy\data\test.ser』구성

		// 테스트 (1)
		//System.out.println(f0.getParentFile().exists());
		//--==>> false

		// 테스트 (2) : 『C:\JavaStudy』경로에 ªdata』디렉터리 생성 후 확인
		//System.out.println(f0.getParentFile().exists());
		//--==>> true

		//디렉터리 구성이 존재하지 않는 상황이라면,,,
		if (!f0.getParentFile().exists())
		{
			//디렉터리를 만들겠다.
			f0.getParentFile().mkdirs();
		}

		// Hashtable 자료구조 인스턴스생성
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// 생성한 h1이라는 Hashtable 자료구조에 요소 추가
		h1.put("3","손손손");
		h1.put("4","채채채");		
		h1.put("2","김김김");		
		h1.put("5","권권권");
		h1.put("1","장장장");
	
		//System.out.println(h1.get("1"));
		//--==>> 장장장

		//파일 전용 출력 스트림 생성 -> 수도꼭지 열기
		FileOutputStream fos = new FileOutputStream(f0);
		//--파일 전용 출력 스트림에 f0라는 파일 객체를 띄우겠다...(흘러갈 수 있도록,,,)

		//객체 전용 출력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//--객체 전용 출력 스트림으로 fos라는 파일 전용 출력 스트림을 감싸겠다.
		
		// 위의 구문과 동일한구문
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// ※ ObjectOutputStream클래스는 객체들을 출력하는 기능을 제공
		//	  출력 스트림에 출력하기 전에 내부적으로 객체 직렬화를 수행하게 된다.
		//	  자바 기본형 데이터 또는 객체들을 파일에 저장하거나 네트워크를 통해 전달하기 위해
		//	  전달할 객체를 직렬화하는 기능을 제공하는 것이다.


		// 생성된 스트림에 내보낼 객체를 기록
		oos.writeObject(h1);

		oos.close();
		//--ObjectOutputStream 리소스 반납

		fos.close();
		//--FileOutputStream 리소스 반납

		//내보내기 끝----------------------------------------------------- 직렬화



		//읽어들이기 시작======================================
		if (f0.exists())		//--f0파일 객체가 존재한다면,,,
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ObjectInputStream로 읽어들인 객체를 readObject를 통해 처리
			// 원래의 형(Hashtable)으로 캐스팅하여
			// h2라는 Hashtable 자료구조에 담아내기
			Hashtable h2 = (Hashtable)ois.readObject();

			ois.close();
			
			fis.close();

			// 읽어들이기 끝============================================

			// 읽어들인 h2 객체의 내용 확인
			String key;
			String value;

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//System.out.println(key);

				value = (String)h2.get(key);
				System.out.println(key + "→" + value);
			}

		}
		

	}
}