/*===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
      - StringBuffer Ŭ����
===========================================*/

/*
��	StringBuffer Ŭ������ ���ڿ��� ó���ϴ� Ŭ������
	String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

	����, JDK 1.5���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�,
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� muiti-thread unsafe��� ���̴�.
	��, Syncronization�� ���� ������
	StringBuffer���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.
*/

public class Test134
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));	//object�� equals�� ��� override���� �ʾƼ� �ּҰ� ��
		//--==>> false							//String �� equals�� override�ؼ� ����
		//		 false

		System.out.println(sb1);				//toString()�� override�ؼ� �ؽ��ڵ尡 ������ ����
		//--==>> korea		
		System.out.println(sb1.toString());
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString()));	//String�� equals()
		//				  ---------------	
		//				      String
		//--==>> true

		StringBuffer sb3 = new StringBuffer();
		//�⺻ ������ ȣ�� ��(�ν��Ͻ� ���� ����)
		//�⺻������ �����Ǵ� ���� ũ��� ��16��

		//capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16

		/////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> �� (���������ʴ´�.)
		
		/*	String�� ���ڿ� �߰� ��� -> ��ȿ����
		String name = "ȫ�浿";
		name += "������";
		System.out.println(name);
		*/


		sb3.append("seoul");		// sb3 += "seoul";
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		//		 seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> 34				==> ���� ũ�� ����... ���� ũ�� �ڵ����� ������Ŵ,,,,

		///////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle


		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> ���� �߻�
		// String���� ���������� StringBuffer���� ���������ʴ� �޼ҵ� toUpperCase()/ toLowerCase()

		String temp3 = sb3.toString();		//String�� ��Ƽ� ó������
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		
		//temp3�� �ٲ� ���� �ٲ�Ű� ���� sb3�� ���� �ٲ���� �ƴϴ�.... 
		//sb3 = "seoulkorea�츮������ѹα�"
		System.out.println(sb3);


		//�� ��� ���ڿ�(sb3) �� seoul �տ� ���ѱ����̶�� ���ڿ� �߰�
		sb3.insert(0,"�ѱ�");
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// �� ��� ���ڿ� �� korea ���ڿ� �ڿ� ��������̶�� ���ڿ� �߰�
		//	  ��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����,,,
		
		/* [���� �� Ǯ��]
		sb3.insert(sb3.length()-sb3.indexOf("korea")-1,"���");
		System.out.println(sb3.toString());
		*/

		//[���� �� Ǯ��]
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"���");
		//         -------------------- ----------------
		//			 korea ���� ��ġ    korea���ڿ�����
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea����츮������ѹα�


		// �� ���츮���� ���ڿ� ����
		//sb3.delete(14,18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		// �� ��� ���ڿ�(sb3)���� korea ���� ���ڿ� ����
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul

		///////////////////////////////////////////////////////////////////////////////////

		//���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34					//�̹� �þ ����ũ�Ⱑ �پ���� ����

		//���ڿ��� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		//���� ũ�� ����
		// -> ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();

		//���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7





	}
}