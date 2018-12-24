package com.jockey.SingletonPattern;

public class Singleton {

	//1.使用synchronized同步
	//会牺牲较多的性能
	//2.急切实例化
	// 直接先实例化
	//3.使用“双重检查加锁”，可以减少使用同步
	//最佳方案，只会使用一次同步，保证性能
}


//1.使用synchronized同步
//会牺牲较多的性能
class SingletonWithSynchronized{
	private SingletonWithSynchronized() {}
	
	private static SingletonWithSynchronized UniqueInstance = null;
	
	//使用synchronized同步
	public synchronized static SingletonWithSynchronized getInstance() {
		if (UniqueInstance == null) {
			UniqueInstance = new SingletonWithSynchronized();
		}
		return UniqueInstance;
	}
	
}


//2.急切实例化
// 直接先实例化
class SingletonWithEagerly{
	private SingletonWithEagerly() {}
	
	private static SingletonWithEagerly UniqueInstance = new SingletonWithEagerly();
	
	public  static SingletonWithEagerly getInstance() {
		return UniqueInstance;
	}
	
}


//3.使用“双重检查加锁”，可以减少使用同步
//最佳方案，只会使用一次同步，保证性能
class SingletonWithDoubleCheckLocking{
	private SingletonWithDoubleCheckLocking() {}
	
	//volatile是一种轻量级的同步机制，
	//它主要有两个特性：一是保证共享变量对所有线程的可见性；二是禁止指令重排序优化。
	private static volatile SingletonWithDoubleCheckLocking UniqueInstance = null;
	
	//双重检查
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