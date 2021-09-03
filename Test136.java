/*===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
      - StringTokenizer Ŭ����
===========================================*/
// StringTokenizer Ŭ������ �ǹ����� ������������� �����Ѵ�.
// �ڿ� ����� ������ �κ��� �־ ���� �Ѿ��...
/*
��  StringTokenizer Ŭ������
	���ڿ� �Ľ�(Parsing)�� ���� �����������ϴ� Ŭ������
	�Ľ�(Parsing)�ϰ��� �ϴ� ���ڿ������ڷ� �޾� �����ϴµ�,
	���⿡�� �Ľ�(Parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
	������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� �����´����� �Ǵ�
	���ڿ��� ��ū(token)�̶�� �Ѵ�.

	StringTokenizer Ŭ������ ����ϱ� ���ؼ���
	java.util ��Ű���� StringTokenizer�� import�ؾ� �Ѵ�.

	��StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
	���� �����ǰ� ������� ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
	String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����
	����� ���� �����ϰ� �ִ�.


��  ������
	- ����
	  StringTokenizer(String str)
	  StringTokenizer(String str, String delim)
	  StringTokenizer(String str, String delim, boolean returnDelims)
	  -> �־��� ���ڿ� str �� �ܾ�� ������� ��ü�� �����ϸ�
	     ���鹮�ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		 ���� returnDelims�� true���
		 ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;
import java.util.StringTokenizer;

public class Test136
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");		//"���,����,�ٳ���,�丶��"
		strTemp = br.readLine();

		//StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp�� ��� ���ڿ���,,,
		//	��,���� �����ڷ�,,,

		strArr = new String[st.countTokens()];						// st.countTokens()  -> 4 
		//--int countTokens()
		//	: �Ľ̵� ���ڿ� ������ ��ȯ(return)�Ѵ�.

		n=0;
		while (st.hasMoreTokens())				//���� ��ū�� �ִ°� Ȯ�θ� �ϴ� �޼ҵ�...
		{
			strArr[n++] = st.nextToken();		//�������� �̵��ϰ� ���� �������� �ϴ� �޼ҵ�...
		}
		//--��hasMoretokens()��
		//	: ����� �� �ִ� ��ū�� �����ִ� ��� true ��ȯ,
		//	  �� �̻� ����� ��ū�� �������� ���� ��� false ��ȯ.
		//	  Ȯ�� ����� ��ȯ�� ��,,,
		//	  ���� ������ �о���̴� ���(��)�� �̵���Ű�� �ʴ´�.

		//--��nextToken()��
		//	: ���� ��ū�� ���´�.
		//	  ���� ��ū�� ������ ���(��)�� �̵���Ű�Եȴ�.
		//	  �����ڸ� �ٲپ��� ��� ���� ���⿡��
		//	  �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();

	
	}
}