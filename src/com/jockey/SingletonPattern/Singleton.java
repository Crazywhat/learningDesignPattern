package com.jockey.SingletonPattern;

public class Singleton {

	//1.ʹ��synchronizedͬ��
	//�������϶������
	//2.����ʵ����
	// ֱ����ʵ����
	//3.ʹ�á�˫�ؼ������������Լ���ʹ��ͬ��
	//��ѷ�����ֻ��ʹ��һ��ͬ������֤����
}


//1.ʹ��synchronizedͬ��
//�������϶������
class SingletonWithSynchronized{
	private SingletonWithSynchronized() {}
	
	private static SingletonWithSynchronized UniqueInstance = null;
	
	//ʹ��synchronizedͬ��
	public synchronized static SingletonWithSynchronized getInstance() {
		if (UniqueInstance == null) {
			UniqueInstance = new SingletonWithSynchronized();
		}
		return UniqueInstance;
	}
	
}


//2.����ʵ����
// ֱ����ʵ����
class SingletonWithEagerly{
	private SingletonWithEagerly() {}
	
	private static SingletonWithEagerly UniqueInstance = new SingletonWithEagerly();
	
	public  static SingletonWithEagerly getInstance() {
		return UniqueInstance;
	}
	
}


//3.ʹ�á�˫�ؼ������������Լ���ʹ��ͬ��
//��ѷ�����ֻ��ʹ��һ��ͬ������֤����
class SingletonWithDoubleCheckLocking{
	private SingletonWithDoubleCheckLocking() {}
	
	//volatile��һ����������ͬ�����ƣ�
	//����Ҫ���������ԣ�һ�Ǳ�֤��������������̵߳Ŀɼ��ԣ����ǽ�ָֹ���������Ż���
	private static volatile SingletonWithDoubleCheckLocking UniqueInstance = null;
	
	//˫�ؼ��
	public  static SingletonWithDoubleCheckLocking getInstance() {
		if (UniqueInstance == null) {
			synchronized (SingletonWithDoubleCheckLocking.class) {
				if (UniqueInstance == null) {
					UniqueInstance = new SingletonWithDoubleCheckLocking();
				}
			}
		}
		return UniqueInstance;
	}
}