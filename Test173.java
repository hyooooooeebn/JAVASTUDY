/*=============================================
   ��� ��ü ����ȭ(Object Serialization) ���
================================================*/

/*
 �� ���� ����ȭ�� 
 	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
	�״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ���� �� �� �ִ� �������
	��� ������ ���� �����Ѵٰų�
	�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
	���� �Ǵ³�Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
	������ִ� ������ �̶� ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�
	
	����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�. ��CHECK��


 �� ����

 	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
	��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

	��ü ����ȭ�� �ڹ� 1,1���Ŀ� ���ԵǾ��µ�
	�� ������ RMI�� Bean�����̴�.
	RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
	��ü�� �״�� �̵��� �� �־�� �Ѵ�,
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̴�.

	���� Bean�� ���� �� ���¿� ���� ������ ������ �� 
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

 �� RMI(Remote Method Invocation)
 	���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
	ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
	���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

 �� Bean(��)
	C/S ������ �𵨿��� ������ ������ �ش��ϸ�
	���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���
	�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

 �� Serializable �������̽�
 	
	��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
	�������̽��� ������ �־�� �Ѵ�.
	��; ��;�������̽��°�ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
	JVM���� �˷��ִ� ������ �����Ѵ�.
	���� Serializable�������̽���
	�ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
	���� �������ָ� ���ȴ�

	(1)
	public class Ŭ������ implements Serializable
	{}

	(2)
	Serializable �������̽��� ������ ��
	ObjectInputStreamŬ������ ObjectOutputStreamŬ������ �̿��Ͽ�
	��ü ������ ������� �����ϰ� �ȴ�;

	�� ��� ������ static���� ����� ���
		��ü ����ȭ�� ��󿡼� ���ܵȴ�.


 �� Object Stream
	

	���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
	����ȭ�� �����ϴ� ����� �����Ѵ�.
	��, java.io.Serializable �������̽���
	java.io.Enernalizable�������̽��� �������ִ� ��ü�� ���ؼ��� ����� �����ϴ�.
	��, Serializable �������̽��� Enernalizable�������̽��� ������ ��ü������ ����� �����ϴٴ� ��
	�̶� readObject()�޼ҵ带 �̿��Ͽ�
	��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
	������ ��(type)���� ĳ�������־�� �Ѵ�.

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

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//--appDir -> C:\JavaStudy
		//	appDir��ġ�� �߽����� "\\data\\test.ser"�� �����ϰڴٴ� �ǹ�
		//	��������� ��C:\JavaStudy\data\test.ser������

		// �׽�Ʈ (1)
		//System.out.println(f0.getParentFile().exists());
		//--==>> false

		// �׽�Ʈ (2) : ��C:\JavaStudy����ο� ��data�����͸� ���� �� Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//--==>> true

		//���͸� ������ �������� �ʴ� ��Ȳ�̶��,,,
		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�.
			f0.getParentFile().mkdirs();
		}

		// Hashtable �ڷᱸ�� �ν��Ͻ�����
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// ������ h1�̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("3","�ռռ�");
		h1.put("4","äää");		
		h1.put("2","����");		
		h1.put("5","�ǱǱ�");
		h1.put("1","������");
	
		//System.out.println(h1.get("1"));
		//--==>> ������

		//���� ���� ��� ��Ʈ�� ���� -> �������� ����
		FileOutputStream fos = new FileOutputStream(f0);
		//--���� ���� ��� ��Ʈ���� f0��� ���� ��ü�� ���ڴ�...(�귯�� �� �ֵ���,,,)

		//��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//--��ü ���� ��� ��Ʈ������ fos��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		
		// ���� ������ �����ѱ���
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// �� ObjectOutputStreamŬ������ ��ü���� ����ϴ� ����� ����
		//	  ��� ��Ʈ���� ����ϱ� ���� ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//	  �ڹ� �⺻�� ������ �Ǵ� ��ü���� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//	  ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.


		// ������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);

		oos.close();
		//--ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//--FileOutputStream ���ҽ� �ݳ�

		//�������� ��----------------------------------------------------- ����ȭ



		//�о���̱� ����======================================
		if (f0.exists())		//--f0���� ��ü�� �����Ѵٸ�,,,
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ObjectInputStream�� �о���� ��ü�� readObject�� ���� ó��
			// ������ ��(Hashtable)���� ĳ�����Ͽ�
			// h2��� Hashtable �ڷᱸ���� ��Ƴ���
			Hashtable h2 = (Hashtable)ois.readObject();

			ois.close();
			
			fis.close();

			// �о���̱� ��============================================

			// �о���� h2 ��ü�� ���� Ȯ��
			String key;
			String value;

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//System.out.println(key);

				value = (String)h2.get(key);
				System.out.println(key + "��" + value);
			}

		}
		

	}
}