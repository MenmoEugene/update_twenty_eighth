/*
����һ��ͼƬ��
˼·��
1�����ֽڶ�ȡ�������ͼƬ������
2�����ֽ�д�������󴴽�һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ���ݡ�
3��ͨ��ѭ����д��������ݴ洢��
4���ر���Դ��
*/

import java.io.*;
class CopyPic 
{
	public static void main(String[] args) 
	{
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try
		{
			fos = new FileOutputStream("E:\\Ziliao\\Java\\practice\\2.jpg");
			fis = new FileInputStream("E:\\Ziliao\\Java\\practice\\1.jpg");

			byte[] buf = new byte[1024];

			int len = 0;

			while ((len=fis.read(buf))!=-1)
			{
				fos.write(buf,0,len);
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("�����ļ�ʧ��");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
	}
}
