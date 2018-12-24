package com.jockey.SingletonPattern;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance = null;
	private static boolean empty;
	private static boolean boil;
	
	private ChocolateBoiler(){
		empty = true;
		boil = false;
	}
	
	//ע���ɿ�����ţ�̵Ļ����
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boil = false;
		}
	}
	
	//����е��ɿ�����ţ���ų�
	public void drain() {
		if (!isEmpty()&&isBoil()) {
			empty = true;
		}
	}
	
	//��¯�������
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
