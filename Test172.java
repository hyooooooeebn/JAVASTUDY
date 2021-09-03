/*====================================
   ��� �ڹ��� �⺻ �����(I/O) ���
=======================================*/

// Reader Writer �ǽ�

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172
{
	public void process(InputStream is)	//����Ʈ ��� �Է½�Ʈ��
	{
		int data;
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{	
			// �Ű����� is��� ����Ʈ��� ��ü�� ���� ��Ʈ������ ��ȯ�Ͽ� Reader���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);
			
			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��½�Ʈ����
			// ���� ��Ʈ������ ��ȯ�Ͽ� write���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);

			while ((data = rd.read())!=-1)
			{
				wt.write(data);	//���ڱ�� ������ ���ڴ�. -> ���ٱ⿡ ���
				wt.flush();		//�̸� �������ڴ�.	-> ����� ��Ʈ���� �о�� ������
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args)
	{
		Test172 ob =new Test172();
		ob.process(System.in);		
	}
}

/*
���ڿ� �Է�(����:Ctrl+z)
abcd
abcd
1234
1234
�����ٶ�
�����ٶ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/