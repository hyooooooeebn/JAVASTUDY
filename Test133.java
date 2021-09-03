/*===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - String Ŭ����
===========================================*/



public class Test133
{
	public static void main(String[] args)
	{

		String s = "seoul Korea";
		System.out.println(s);
		//--==>> seoul Korea


		// �� ���ڿ� ����
		System.out.println(s.substring(6,9));
		//--==>> Kor

		System.out.println(s.substring(7));
		//--==>> orea
		//--��String.substring(s)��
		//	String���ڿ��� �������
		//	s��°���� ������,,,


		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul Korea"));
		System.out.println(s.equals("seoul korea"));
		//--==>> true
		//		 false
		//--��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("Seoul korea"));
		//--==>> true
		//--��ҹ��� ���� ����


		//�� ã���� �ϴ� ��� ���ڿ�(s)��
		//	 ��kor�����ڿ��� �����ұ�?
		//	  �����Ѵٸ�,,,  �� ��ġ�� ��� �ɱ�?

		//"seoul korea"
		System.out.println(s.indexOf("Kor"));
		//--==>> 6
		
		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1		//�տ������� ǥ���Ѵ�...

		System.out.println(s.indexOf("tt"));
		//--==>> -1		
		//�ش� ���ڰ� ������ ������ ���´�... ������ -1�� �ƴϴ�...
		//--ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//	�� ���ڿ��� �ε����� ��ȯ������
		//	�������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)


		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//	  (true/false)
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false


		// �� ã���� �ϴ� ��� ���ڿ�(s)�� ��e�����ڿ��� �����ϴ°�?
		//	  �����Ѵٸ� �� ��ġ�� ����ΰ�?
		//	  ��, �ڿ������� �˻�

		//seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));	//ã�°͸� �ڿ��� ã�� �տ������� ī���
		//--==>> 9

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7


		// �� ��� ���ڿ�(s) �� ��6����° �ε��� ��ġ�� ���ڴ�?
		
		System.out.println(s.charAt(6));
		//--==>> K

		System.out.println(s.charAt(10));
		//--==>> a

		//System.out.println(s.charAt(22));
		//--==>> ��Ÿ�� ���� (StringIndexOutOfBoundsException)

		
		// �� ��� ���ڿ�(s)�� �� ���ڿ� ��seoul Corea���� � ���ڿ��� �� ū��?
		//	  �� ���ڿ��� �ٸ��ٸ� ���̸� Ȯ��	(-> ������ �迭)

		System.out.println(s.compareTo("seoul Korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul Corea"));
		//--==>> 8 (c~k => defghijk)

		// �� ��� ���ڿ�(s) �� �؈� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����
		
		s ="�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����","����");

		System.out.println(s);
		//--==>> �츮���� ���ֹα� ���ֵ��� ����

		
		// �� ���� ����
		s = "      ��       ��      ";
		System.out.println(";" + s +";");
		//--==>> ;      ��       ��      ;

		System.out.println(";"+s.trim()+";");	//trim() ���� ���� ����	-> �ѹ��� �ڸ��°� �ƴϰ� �ϳ��� �߶󳪰���.
		//--==>> ;��       ��;					//������,,,,��		   ���� ���̸� ���Ѵ�...
		
		System.out.println(";"+s.replaceAll(" ","")+";");
		//--==>> ;���;

		
		int n = Integer.parseInt("30");		//parseInt() ���ڿ� -> ������
		s = Integer.toString(30);			//toString() ������ -> ���ڿ�
		System.out.println(s);

		n =2345678;
		System.out.printf("%d",n);
		System.out.format("%d\n",n);	//printf�� ���� ��� �޼ҵ�
		

		s= String.format("%,d",n);		//����� �ƴϰ� �ش� ������ ���ڿ��� ��ȯ
		System.out.println(s);	
		//--==>> 2,345,678

		System.out.format("%.2f\n",3.141592);	//���

		s = String.format("%.2f",3.141592);		//���ڿ� ��ȯ
		System.out.println(s);


		String[] sArray = "�⺻,����,���".split(",");

		for (String str : sArray)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> �⺻ ���� ���


	 
	 
	}
}