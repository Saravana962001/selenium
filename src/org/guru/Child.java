package org.guru;

public class Child extends Parent {

	@Override
	public void Function() {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Sum is:"+c);
		
		
		
	}
	public static void main(String[] args) {
		Child od=new Child();
		od.saro();
		od.Function();
	}

}
