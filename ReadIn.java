/*
��ȡ����¼�롣
System.out����Ӧ���Ǳ�׼����豸������̨��
System.in����Ӧ���Ǳ�׼�����豸�����̡�


����
ͨ������¼�����ݡ�
��¼��һ�����ݺ󣬾ͽ��������ݽ��д�ӡ��
���¼���������over����ôֹͣ¼�롣

*/
import java.io.*;
class ReadIn
{
	public static void main(String[] args) throws IOException
	{
		InputStream in = System.in;
		StringBuilder sb = new StringBuilder();
		while (true)
		{
			int ch = in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				String s = sb.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				sb.delete(0,sb.length());
			}
			else
				sb.append((char)ch);
		}

	}
}
/*
		System.out.println('\r'+0);
		System.out.println('\n'+0);
		int by = in.read();
		int by1 = in.read();
		System.out.println(by);
		System.out.println(by1);
*/