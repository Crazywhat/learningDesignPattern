package com.jockey.SingletonPattern;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance = null;
	private static boolean empty;
	private static boolean boil;
	
	private ChocolateBoiler(){
		empty = true;
		boil = false;
	}
	
	//注入巧克力和牛奶的混合物
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boil = false;
		}
	}
	
	//将煮沸的巧克力和牛奶排出
	public void drain() {
		if (!isEmpty()&&isBoil()) {
			empty = true;
		}
	}
	
	//将炉内物煮沸
	public void boil() {
		if(!isEmpty()&&!isBoil()) {
			boil = true;
		}
	} 
	
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoil() {
		return boil;
	}
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
