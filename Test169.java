/*====================================
   ��� �ڹ��� �⺻ �����(I/O) ���
=======================================*/

//OutPutStream �ǽ�

import java.io.OutputStream;
import java.io.IOException;

public class Test169
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : �ڹ��� ǥ�� �Է� ��Ʈ��
		// System.out : �ڹ��� ǥ�� ��� ��Ʈ��

		OutputStream out = System.out;	// ����� ����Ʈ �������� on

		byte[] ch = new byte[3];		// ����Ʈ �迭 ����
	
		ch[0] = 65;		// A			// ����Ʈ ä���
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		out.write(ch);					// ������ ������ ������(����)�� ��Ʈ���� ��� �� ���ٱ⿡ ������ �����

		out.flush();					// ��ϵ� ��Ʈ���� �������� ����� ����	�� ���ۿ� �� �� �ѹ��� �о ��������
										//	������ Bufer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������ ��������
										//	Buffered�Ǿ� �ִ� ��Ʈ���� ���� �Ұ���

		out.close();					// ��� ��Ʈ���� ���� ���ҽ� �ݳ�
										//	�� out ��Ʈ�� �������� ��ױ�

		System.out.println("���Ͷ� ��!");
		//��out.close()���� �ۼ��� ���� ��µ��� �ʴ� ����
		// ��µǴ� ��Ʈ���� �ݾұ� ������,,,
	}
}