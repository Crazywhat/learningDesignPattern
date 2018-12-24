package com.jockey.DecoratorPattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


//编写自己的Java I/0装饰者

//首先，扩展FilterInputStream，这是所有InputStream的抽象装饰者。
public class UpperCaseInputStream extends FilterInputStream {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
	}
	
	/*两个read()方法，一个针对字节，一个针对字节数组，把每个是大写字符
	的字节（每个代表一个字符）转成小写。*/
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
			/*设置FileInputStream，先用BufferedInputStream装饰它，
			 * 再用我们崭新的Upper CaseInputStream过滤器装饰它。*/
			InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(".\\src\\com\\jockey\\DecoratorPattern\\test.txt")));
			int ch;
			
			//只用流来读取字符，一直到文件尾端。每读一个字符，就马上将它显示出来。
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
