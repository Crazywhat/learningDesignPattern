package com.jockey.DecoratorPattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


//��д�Լ���Java I/0װ����

//���ȣ���չFilterInputStream����������InputStream�ĳ���װ���ߡ�
public class UpperCaseInputStream extends FilterInputStream {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
	}
	
	/*����read()������һ������ֽڣ�һ������ֽ����飬��ÿ���Ǵ�д�ַ�
	���ֽڣ�ÿ������һ���ַ���ת��Сд��*/
	public int read() throws IOException {
		int c = super.read();
		return (c == -1)?(c):(Character.toUpperCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException
	{
		int result = super.read(b, offset, len);
		
		for(int i = offset; i < offset + result; ++i)
		{
			b[i] = (byte) Character.toUpperCase((char)b[i]);
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {	
		try {
			/*����FileInputStream������BufferedInputStreamװ������
			 * ��������ո�µ�Upper CaseInputStream������װ������*/
			InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(".\\src\\com\\jockey\\DecoratorPattern\\test.txt")));
			int ch;
			
			//ֻ��������ȡ�ַ���һֱ���ļ�β�ˡ�ÿ��һ���ַ��������Ͻ�����ʾ������
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
